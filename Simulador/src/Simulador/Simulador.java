
package Simulador;

import Componentes.Analista;
import Componentes.Chamado;
import Componentes.Setor;
import Parametros.Parametros;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Simulador {
    
    private Menu menu;
    private Parametros parametros;
    
    private Inicializador inicializador;
    private Simulador simulador;
    
    private ArrayList chamados = new ArrayList<Chamado>();
    
    Scanner scanner = new Scanner(System.in);
    
    public Simulador() throws IOException, ParseException {
        
        this.inicializador = new Inicializador();
        this.parametros = new Parametros();        
        this.menu = new Menu();
        
        int escolha = menu.exibirMenu();

        if(escolha != 0)
        {
            switch(escolha){
                case 1:
                    this.criarChamadosPorcentagemFixa();
                    break;
                case 2:
                    this.criarChamadosPorcentagemManual();
                    break;
                case 3:
                    this.criarChamadosQuantidadeAleatoria();
                    break;
                case 4:
                    this.criarChamadosQuantidadeOrdem();
                    break;
            };           
        }

        System.out.println("------------------------------");
        
        Exportador.criarArquivo(this.chamados);
        
    }
     
    public void criarChamadosPorcentagemFixa() throws ParseException {

        int quantChamados;
        String data;
                
        do {
            System.out.print("Informe quantos chamados o sistema criará: ");
            quantChamados = scanner.nextInt();            
        } while (quantChamados < 0);
        
        System.out.println("------------------------------");
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient (false);
        boolean valida = false;
        do {
            System.out.print("Informe a data inicial, no formato DD/MM/YYYY: ");
            data = scanner.nextLine(); 
            try {
                df.parse (data);
                valida = true;
            } catch (ParseException ex) {
                valida = false;
            }
        } while (valida == false);
        
        this.inicializador.iniciarDatasAnalistas(data);
        
        System.out.println("------------------------------");

        for(int x = 0; x < quantChamados; x++) {
            double numero = Math.random() * 100;
            
            String setorString = this.obterSetorPorcentagem(1, numero);            
            Setor setor = this.inicializador.getSetorNome(setorString.replace(".", " "));
            
            Boolean urgencia = this.obterUrgencia();
            
            Analista analista = this.obterAnalista(setor);
            
            int tempo = this.obterTempo(analista, urgencia);
            
            Date[] datas = this.obterDatas(analista, tempo);
                
            this.chamados.add(new Chamado(setor, urgencia, analista, tempo, datas));
            
        }
        
        System.out.println("Foram criados " + quantChamados + " chamados com sucesso!");
        
    }
    
    public void criarChamadosPorcentagemManual() throws ParseException {
        
        if(this.testarPorcentagem(2)) {
            int quantChamados;
            String data;

            do {
                System.out.print("Informe quantos chamados o sistema criará: ");
                quantChamados = scanner.nextInt();            
            } while (quantChamados < 0);

            System.out.println("------------------------------");
            
            DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
            df.setLenient (false);
            boolean valida = false;
            do {
                System.out.print("Informe a data inicial, no formato DD/MM/YYYY: ");
                data = scanner.nextLine(); 
                try {
                    df.parse (data);
                    valida = true;
                } catch (ParseException ex) {
                    valida = false;
                }
            } while (valida == false);
            
            this.inicializador.iniciarDatasAnalistas(data);
            
            System.out.println("------------------------------");
            
            for(int x = 0; x < quantChamados; x++) {
                double numero = Math.random() * 100;

                String setorString = this.obterSetorPorcentagem(2, numero);            
                Setor setor = this.inicializador.getSetorNome(setorString.replace(".", " "));

                Boolean urgencia = this.obterUrgencia();
                
                Analista analista = this.obterAnalista(setor);
                
                int tempo = this.obterTempo(analista, urgencia);
                
                Date[] datas = this.obterDatas(analista, tempo);
                
                this.chamados.add(new Chamado(setor, urgencia, analista, tempo, datas));
                
            }

            System.out.println("Foram criados " + quantChamados + " chamados com sucesso!");

        } 
        else {
            System.out.println("A soma das porcentagens do arquivo é diferente de 100%. Corrija!");
        }
        
    }
    
    public void criarChamadosQuantidadeAleatoria() throws ParseException {
        
        Map<String, Integer> quantidades = this.testarQuantidade();
        ArrayList setores = new ArrayList();
        Random aleatorio = new Random(); 
        
        int quantSoma = 0;
        int quantChamados = 0;
        String data;
        
        System.out.println("------------------------------");
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient (false);
        boolean valida = false;
        do {
            System.out.print("Informe a data inicial, no formato DD/MM/YYYY: ");
            data = scanner.nextLine(); 
            try {
                df.parse (data);
                valida = true;
            } catch (ParseException ex) {
                valida = false;
            }
        } while (valida == false);
        
        this.inicializador.iniciarDatasAnalistas(data);
        
        System.out.println("------------------------------");
        
        if(quantidades.size() > 0) {
            for ( Object setor : quantidades.keySet()) {
                setores.add( setor.toString() );
                quantSoma += quantidades.get(setor);
            }
            
            quantChamados = quantSoma;
            
            while(quantSoma > 0) {
                int setorInt = aleatorio.nextInt(setores.size()); 
                String setorString = setores.get(setorInt).toString();
                int quantAtual = quantidades.get( setorString );
                if (quantAtual > 0) {
                    Setor setor = this.inicializador.getSetorNome(setorString.replace(".", " "));
                    
                    Boolean urgencia = this.obterUrgencia();
                    
                    Analista analista = this.obterAnalista(setor);
                    
                    int tempo = this.obterTempo(analista, urgencia);
                    
                    Date[] datas = this.obterDatas(analista, tempo);
                
                    this.chamados.add(new Chamado(setor, urgencia, analista, tempo, datas));
                    
                    quantAtual--;                    
                    quantidades.replace(setorString, quantAtual);
                    quantSoma--;
                }
                
            }     
            
            System.out.println("Foram criados " + quantChamados + " chamados com sucesso!");
          
        } 
        else {
            System.out.println("A soma das quantidades no arquivo é igual a zero. Corrija!");
        }

    }
    
    public void criarChamadosQuantidadeOrdem() throws ParseException {
         
        Map<String, Integer> quantidades = this.testarQuantidade();
        ArrayList setores = new ArrayList();
        
        int quantSoma = 0;
        int quantChamados = 0;
        String data;
        
        System.out.println("------------------------------");
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient (false);
        boolean valida = false;
        do {
            System.out.print("Informe a data inicial, no formato DD/MM/YYYY: ");
            data = scanner.nextLine(); 
            try {
                df.parse (data);
                valida = true;
            } catch (ParseException ex) {
                valida = false;
            }
        } while (valida == false);
        
        this.inicializador.iniciarDatasAnalistas(data);
        
        System.out.println("------------------------------");
        
        if(quantidades.size() > 0) {
            for ( Object setor : quantidades.keySet()) {
                setores.add( setor.toString() );
                quantSoma += quantidades.get(setor);
            }
            
            quantChamados = quantSoma;
            
            for(int x = 0; x < setores.size(); x++) {
                String setorString = setores.get(x).toString();
                int totalSetor = quantidades.get( setorString );
                
                for(int y = 0; y < totalSetor; y++) {
                    Setor setor = this.inicializador.getSetorNome(setorString.replace(".", " "));
                    
                    Boolean urgencia = this.obterUrgencia();
                    
                    Analista analista = this.obterAnalista(setor);
                    
                    int tempo = this.obterTempo(analista, urgencia);
                    
                    Date[] datas = this.obterDatas(analista, tempo);
                
                    this.chamados.add(new Chamado(setor, urgencia, analista, tempo, datas));
                }
            }     
            
            System.out.println("Foram criados " + quantChamados + " chamados com sucesso!");
         
        } 
        else {
            System.out.println("A soma das quantidades no arquivo é igual a zero. Corrija!");
        }
    }
    
    public String obterSetorPorcentagem(int tipo, double numero) {
        
        Properties porcentagemProp = new Properties();
        
        if(tipo == 1)
            porcentagemProp = this.parametros.getPorcentagemFixaProp();
        else if(tipo == 2)
            porcentagemProp = this.parametros.getPorcentagemManualProp();
        
        Enumeration<Object> porcentagens = porcentagemProp.elements();
        Enumeration<Object> chaves = porcentagemProp.keys();
        
        String chaveAtual = "";
        double soma = 0;

        // Percorre a lista de parâmetros. A cada rodada ele soma o valor do parâmetro.
        // Esse valor somado é comparado com o sorteado que foi passado na chamada do método
        // No momento em que o número sorteado for menor que a soma, significa que ele encontrou o setor correspondente
        // Se ao final das rodadas ele não tiver encontrado, significa que o setor será o último da lista.
        for (int x = 0; x <= porcentagemProp.size(); x++) {

            if(porcentagens.hasMoreElements()) {
                String porcentagem = porcentagens.nextElement().toString();               
                Double valor;
                
                if(! porcentagem.equals("")) {
                    valor = Double.parseDouble(porcentagem);
                }
                else {
                    valor = 0.00;
                }
                
                chaveAtual = chaves.nextElement().toString();
                
                soma += valor;
                
   //             System.out.println("PROCURANDO "+numero);
   //             System.out.println(chaveAtual + " > " + valor);
   //             System.out.println("SOMA: "+soma);
                
                if(numero <= soma) {
   //                System.out.println("CHAVE ENCONTRADA: "+chaveAtual);
                    return chaveAtual;
                }
            }
            else {
   //             System.out.println("CHAVE ENCONTRADA: "+chaveAtual);
                return chaveAtual;
            }

        }
        
        return null;
    }
    
    public boolean testarPorcentagem(int tipo) {
        
        Properties porcentagemProp = new Properties();
        
        if(tipo == 1)
            porcentagemProp = this.parametros.getPorcentagemFixaProp();
        else if(tipo == 2)
            porcentagemProp = this.parametros.getPorcentagemManualProp();
        
        Enumeration<Object> porcentagens = porcentagemProp.elements();
        
        double soma = 0.0;
        
        while(porcentagens.hasMoreElements()) {
            String porcentagem = porcentagens.nextElement().toString();               
            Double valor;

            if(! porcentagem.equals("")) {
                valor = Double.parseDouble(porcentagem);
            }
            else {
                valor = 0.00;
            }
            
            soma += valor;
        }
        
        if(soma == 100.00)
            return true;
        else
            return false;
        
    }
    
    public Analista obterAnalista(Setor setor) {
        
        double probabilidade = Math.random();  
            
        Analista analista = this.inicializador.getAnalistaProbabilidade(setor, probabilidade);
        
        return analista;        
        
    }
    
    public int obterTempo(Analista analista, Boolean urgencia) {
        
        double probabilidade = Math.random();  
            
        int tempo = this.inicializador.getTempoProbabilidade(analista, urgencia, probabilidade);
        
        return tempo;        
        
    }
    
    public Date[] obterDatas(Analista analista, int dias) {
           
        Date[] datas = this.inicializador.getDatasAnalista(analista, dias);
        
        return datas;        
        
    }
    
    public Map testarQuantidade() {
        
        Properties quantidadeProp = this.parametros.getQuantidadeProp();
        
        Enumeration<Object> quantidades = quantidadeProp.elements();
        Enumeration<Object> chaves = quantidadeProp.keys();
        
        Map<String, Integer> quantidadeMapa = new HashMap<String, Integer>();

        while(quantidades.hasMoreElements()) {
            String quantidade = quantidades.nextElement().toString();
            String chave = chaves.nextElement().toString(); 

            if(! quantidade.equals("")) {
                quantidadeMapa.put(chave, Integer.parseInt(quantidade) );
            }
        }
        
        return quantidadeMapa;
        
    }
    
    public Boolean obterUrgencia() {
        
        Properties urgenciaProp = this.parametros.getUrgenciaProp();
        
        Boolean urgencia = Boolean.FALSE;
        
        Enumeration<Object> porcentagens = urgenciaProp.elements();
        
        for (int x = 0; x <= urgenciaProp.size(); x++) {

            if(porcentagens.hasMoreElements()) {
                String porcentagem = porcentagens.nextElement().toString();               
                Double valor;
                
                if(! porcentagem.equals("")) {
                    valor = Double.parseDouble(porcentagem);
                }
                else {
                    valor = 0.00;
                }
                
                double numero = Math.random() * 100;
                
                if(numero <= valor) {
                    urgencia = Boolean.TRUE;
                } 
                else {
                    urgencia = Boolean.FALSE;
                }
            }

        }
        
        return urgencia;
    }

}