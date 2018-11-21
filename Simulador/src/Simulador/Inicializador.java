
package Simulador;

import Componentes.ProbabilidadeTempo;
import Componentes.ProbabilidadeAnalista;
import Componentes.Analista;
import Componentes.DataAnalista;
import Componentes.Setor;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Inicializador {

    private ArrayList setores = new ArrayList();
    private ArrayList analistas = new ArrayList();
    private ArrayList probabilidadesAnalista = new ArrayList();
    private ArrayList probabilidadesTempo = new ArrayList();
    private ArrayList datasAnalistas = new ArrayList();

    public Inicializador() throws IOException {
        
        this.criarSetores();
        this.criarAnalistas();
        this.criarProbabilidadesAnalistas();
        this.criarProbabilidadesTempo();
    }
    
    public void criarSetores() {
    
        getSetores().add(new Setor("ACESSO"));
        getSetores().add(new Setor("AFV"));
        getSetores().add(new Setor("ATELIER"));
        getSetores().add(new Setor("COMPRAS"));
        getSetores().add(new Setor("CONTABILIDADE"));
        getSetores().add(new Setor("ESCRITA FISCAL"));
        getSetores().add(new Setor("ESTOQUE"));
        getSetores().add(new Setor("EXPORTACAO"));
        getSetores().add(new Setor("FINANCEIRO"));
        getSetores().add(new Setor("FRETES"));
        getSetores().add(new Setor("GENERICO"));
        getSetores().add(new Setor("METODOS E PROCESSOS"));
        getSetores().add(new Setor("NFE"));
        getSetores().add(new Setor("NOTA FISCAL ELETRONICA"));
        getSetores().add(new Setor("PCP"));
        getSetores().add(new Setor("PROGRAMACAO"));
        getSetores().add(new Setor("SISTEMAS WEB"));
        getSetores().add(new Setor("SPED CONTRIBUICAO"));
        getSetores().add(new Setor("SPED FISCAL"));
        getSetores().add(new Setor("SPED REINF"));
        getSetores().add(new Setor("VENDA"));
        getSetores().add(new Setor("PORTAL WEB"));
    }
    
    public void criarAnalistas(){    
        
        getAnalistas().add(new Analista("Adair"));
        getAnalistas().add(new Analista("Maria"));
        getAnalistas().add(new Analista("Ronaldo"));
        getAnalistas().add(new Analista("Joao"));
    }
    
    public void criarProbabilidadesAnalistas(){
        
        ////////////////////////////////
        //Adair
        ////////////////////////////////
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ACESSO"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("AFV"),
                this.getAnalistaNome("Adair"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ATELIER"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("COMPRAS"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("CONTABILIDADE"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESCRITA FISCAL"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESTOQUE"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("EXPORTACAO"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FINANCEIRO"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FRETES"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("GENERICO"),
                this.getAnalistaNome("Adair"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("METODOS E PROCESSOS"),
                this.getAnalistaNome("Adair"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NFE"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NOTA FISCAL ELETRONICA"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PCP"),
                this.getAnalistaNome("Adair"), 0.99 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PROGRAMACAO"),
                this.getAnalistaNome("Adair"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SISTEMAS WEB"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED CONTRIBUICAO"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED FISCAL"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED REINF"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("VENDA"),
                this.getAnalistaNome("Adair"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PORTAL WEB"),
                this.getAnalistaNome("Adair"), 0.0 ) );
        
        ////////////////////////////////
        //Joao
        ////////////////////////////////
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ACESSO"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("AFV"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ATELIER"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("COMPRAS"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("CONTABILIDADE"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESCRITA FISCAL"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESTOQUE"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("EXPORTACAO"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FINANCEIRO"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FRETES"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("GENERICO"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("METODOS E PROCESSOS"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NFE"),
                this.getAnalistaNome("Joao"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NOTA FISCAL ELETRONICA"),
                this.getAnalistaNome("Joao"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PCP"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PROGRAMACAO"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SISTEMAS WEB"),
                this.getAnalistaNome("Joao"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED CONTRIBUICAO"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED FISCAL"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED REINF"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("VENDA"),
                this.getAnalistaNome("Joao"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PORTAL WEB"),
                this.getAnalistaNome("Joao"), 1.0 ) );   
        
        ////////////////////////////////
        //Maria
        ////////////////////////////////
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ACESSO"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("AFV"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ATELIER"),
                this.getAnalistaNome("Maria"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("COMPRAS"),
                this.getAnalistaNome("Maria"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("CONTABILIDADE"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESCRITA FISCAL"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESTOQUE"),
                this.getAnalistaNome("Maria"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("EXPORTACAO"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FINANCEIRO"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FRETES"),
                this.getAnalistaNome("Maria"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("GENERICO"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("METODOS E PROCESSOS"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NFE"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NOTA FISCAL ELETRONICA"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PCP"),
                this.getAnalistaNome("Maria"), 0.01 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PROGRAMACAO"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SISTEMAS WEB"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED CONTRIBUICAO"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED FISCAL"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED REINF"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("VENDA"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PORTAL WEB"),
                this.getAnalistaNome("Maria"), 0.0 ) );
        
        ////////////////////////////////
        //Ronaldo
        ////////////////////////////////
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ACESSO"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("AFV"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ATELIER"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("COMPRAS"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("CONTABILIDADE"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESCRITA FISCAL"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("ESTOQUE"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("EXPORTACAO"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FINANCEIRO"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("FRETES"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("GENERICO"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("METODOS E PROCESSOS"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NFE"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("NOTA FISCAL ELETRONICA"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PCP"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PROGRAMACAO"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SISTEMAS WEB"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED CONTRIBUICAO"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED FISCAL"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("SPED REINF"),
                this.getAnalistaNome("Ronaldo"), 1.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("VENDA"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        this.getProbabilidadesAnalista().add(new ProbabilidadeAnalista(
                this.getSetorNome("PORTAL WEB"),
                this.getAnalistaNome("Ronaldo"), 0.0 ) );
        
    }
    
    public void criarProbabilidadesTempo() {

        ////////////////////////////////
        //Adair
        ////////////////////////////////
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(5,
                        this.getAnalistaNome("Adair"), 0.5918, 0.5625));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(10,
                        this.getAnalistaNome("Adair"), 0.1020, 0.1875));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(15,
                        this.getAnalistaNome("Adair"), 0.1633, 0.0625));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(20,
                        this.getAnalistaNome("Adair"), 0.0204, 0.0625));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(25,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(30,
                        this.getAnalistaNome("Adair"), 0.0408, 0.0313));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(35,
                        this.getAnalistaNome("Adair"), 0.0204, 0.0313));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(40,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0313));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(45,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(50,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(55,
                        this.getAnalistaNome("Adair"), 0.0204, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(60,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(65,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(70,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0313));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(75,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(80,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(85,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(90,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(95,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(100,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(105,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(110,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(115,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(120,
                        this.getAnalistaNome("Adair"), 0.0204, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(125,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(130,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(135,
                        this.getAnalistaNome("Adair"), 0.0204, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(140,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(145,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(150,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(155,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(160,
                        this.getAnalistaNome("Adair"), 0.0000, 0.0000));

        ////////////////////////////////
        //Joao
        ////////////////////////////////
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(5,
                        this.getAnalistaNome("Joao"), 0.5833, 0.3636));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(10,
                        this.getAnalistaNome("Joao"), 0.0833, 0.1818));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(15,
                        this.getAnalistaNome("Joao"), 0.0000, 0.1818));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(20,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0909));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(25,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(30,
                        this.getAnalistaNome("Joao"), 0.1667, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(35,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(40,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(45,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(50,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(55,
                        this.getAnalistaNome("Joao"), 0.0833, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(60,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0909));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(65,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(70,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(75,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(80,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(85,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(90,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(95,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(100,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(105,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(110,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(115,
                        this.getAnalistaNome("Joao"), 0.0833, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(120,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0909));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(125,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(130,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(135,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(140,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(145,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(150,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(155,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(160,
                        this.getAnalistaNome("Joao"), 0.0000, 0.0000));
        
        ////////////////////////////////
        //Maria
        ////////////////////////////////
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(5,
                        this.getAnalistaNome("Maria"), 0.5385, 0.5333));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(10,
                        this.getAnalistaNome("Maria"), 0.1795, 0.1667));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(15,
                        this.getAnalistaNome("Maria"), 0.0769, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(20,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0667));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(25,
                        this.getAnalistaNome("Maria"), 0.0256, 0.0667));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(30,
                        this.getAnalistaNome("Maria"), 0.0256, 0.1000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(35,
                        this.getAnalistaNome("Maria"), 0.0513, 0.0333));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(40,
                        this.getAnalistaNome("Maria"), 0.0256, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(45,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(50,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(55,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(60,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(65,
                        this.getAnalistaNome("Maria"), 0.0513, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(70,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(75,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(80,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(85,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(90,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0333));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(95,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(100,
                        this.getAnalistaNome("Maria"), 0.0256, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(105,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(110,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(115,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(120,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(125,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(130,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(135,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(140,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(145,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(150,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(155,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(160,
                        this.getAnalistaNome("Maria"), 0.0000, 0.0000));
        
        ////////////////////////////////
        //Ronaldo
        ////////////////////////////////
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(5,
                        this.getAnalistaNome("Ronaldo"), 0.4545, 0.2105));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(10,
                        this.getAnalistaNome("Ronaldo"), 0.1515, 0.1053));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(15,
                        this.getAnalistaNome("Ronaldo"), 0.0909, 0.1579));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(20,
                        this.getAnalistaNome("Ronaldo"), 0.0303, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(25,
                        this.getAnalistaNome("Ronaldo"), 0.0303, 0.1579));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(30,
                        this.getAnalistaNome("Ronaldo"), 0.0606, 0.1053));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(35,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.1579));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(40,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(45,
                        this.getAnalistaNome("Ronaldo"), 0.0606, 0.0526));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(50,
                        this.getAnalistaNome("Ronaldo"), 0.0303, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(55,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(60,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0526));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(65,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(70,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(75,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(80,
                        this.getAnalistaNome("Ronaldo"), 0.0303, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(85,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(90,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(95,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(100,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(105,
                        this.getAnalistaNome("Ronaldo"), 0.0303, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(110,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(115,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(120,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(125,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(130,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(135,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(140,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(145,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(150,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(155,
                        this.getAnalistaNome("Ronaldo"), 0.0303, 0.0000));
        this.getProbabilidadesTempo().add(
                new ProbabilidadeTempo(160,
                        this.getAnalistaNome("Ronaldo"), 0.0000, 0.0000));
    }
    
    public void iniciarDatasAnalistas(String dataTexto) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataTexto);
        
        Calendar c = Calendar.getInstance();
                
        c.setTime(data);
        // Caso esse dia seja um sábado ou domingo, joga pra segunda
        while(
            (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) ||
            (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) )
        {
            System.out.println("Ajustando a data para iniciar na segunda-feira...");
            c.add(Calendar.DATE, 1);
        }                
        
        Date dataAjustada = c.getTime();        
        
        this.datasAnalistas.add(
                new DataAnalista(this.getAnalistaNome("Adair"), data));
        this.datasAnalistas.add(
                new DataAnalista(this.getAnalistaNome("Joao"), data));
        this.datasAnalistas.add(
                new DataAnalista(this.getAnalistaNome("Maria"), data));
        this.datasAnalistas.add(
                new DataAnalista(this.getAnalistaNome("Ronaldo"), data));
    }
    
    public Setor getSetorId(int id) {
        return (Setor) this.getSetores().get(id);
    }
    
    public Setor getSetorNome(String nome) {
        for(int x = 0; x < this.getSetores().size(); x++) {
            if(this.getSetorId(x).getNome().equals(nome)) {
                return this.getSetorId(x);
            }
        }        
        return null;
    }

    public void addSetor(Setor setor) {
        this.getSetores().add(setor);
    }
    
    public ArrayList getSetores() {
        return setores;
    }

    public void setSetores(ArrayList setores) {
        this.setores = setores;
    }
    
    public Analista getAnalistaId(int id) {
        return (Analista) this.getAnalistas().get(id);
    }
    
    public Analista getAnalistaNome(String nome) {
        for(int x = 0; x < this.getAnalistas().size(); x++) {
            if(this.getAnalistaId(x).getNome().equals(nome)) {
                return this.getAnalistaId(x);
            }
        }        
        return null;
    }

    public void addAnalista(Analista analista) {
        this.getAnalistas().add(analista);
    }

    public ArrayList getAnalistas() {
        return analistas;
    }

    public void setAnalistas(ArrayList analistas) {
        this.analistas = analistas;
    }  

    public ArrayList getProbabilidadesAnalista() {
        return probabilidadesAnalista;
    }

    public void setProbabilidadesAnalista(ArrayList probabilidadesAnalista) {
        this.probabilidadesAnalista = probabilidadesAnalista;
    }

    public ArrayList getProbabilidadesTempo() {
        return probabilidadesTempo;
    }

    public void setProbabilidadesTempo(ArrayList probabilidadesTempo) {
        this.probabilidadesTempo = probabilidadesTempo;
    }
    
    public Analista getAnalistaProbabilidade(Setor setor, double probabilidade) {
        
        double soma = 0;

        for (int x = 0; x < probabilidadesAnalista.size(); x++) {

            ProbabilidadeAnalista probAnalista = (ProbabilidadeAnalista) probabilidadesAnalista.get(x);

            if(probAnalista.getSetor().equals(setor))
            {
                soma += probAnalista.getProbabilidade();
                
                if(probabilidade <= soma) {
                    //System.out.println(probAnalista.getAnalista().getNome());
                    return probAnalista.getAnalista();
                }
            }           

        }
        
        return null;
    }
    
    public Date[] getDatasAnalista(Analista analista, int dias) {
        
        for (int x = 0; x < datasAnalistas.size(); x++) {

            DataAnalista dataAnalista = (DataAnalista) datasAnalistas.get(x);
            
            if(dataAnalista.getAnalista().equals(analista))
            {
                Date dataInicial = dataAnalista.getData();
                
                //////////////
                // Seria interessante pensar em um teste de incrementar dias apenas úteis
                // Não acham???
                //////////////
                
                Calendar c = Calendar.getInstance();
                
                // Configura a data final de atendimento
                c.setTime(dataInicial);
                c.add(Calendar.DATE, dias);
                // Caso esse dia seja um sábado ou domingo, joga pra segunda
                while(
                    (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) ||
                    (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) )
                {
                    c.add(Calendar.DATE, 1);
                }                
                Date dataFinal = c.getTime();

                // Configura pro próximo atendimento iniciar no dia seguinte
                c.setTime(dataFinal);
                c.add(Calendar.DATE, 1);
                // Caso esse dia seja um sábado ou domingo, joga pra segunda
                while(
                    (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) ||
                    (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) )
                {
                    c.add(Calendar.DATE, 1);
                }
                dataAnalista.setData(c.getTime());
                
                Date[] datas = new Date[2];
                datas[0] = dataInicial;
                datas[1] = dataFinal;
                
                return datas;
            }           

        }
        
        return null;
    }
    
    public int getTempoProbabilidade(Analista analista, Boolean urgencia, double probabilidade) {
        
        double soma = 0;
        
        for (int x = 0; x < probabilidadesTempo.size(); x++) {

            ProbabilidadeTempo probTempo = (ProbabilidadeTempo) probabilidadesTempo.get(x);
            
            if(probTempo.getAnalista().equals(analista))
            {
                if(urgencia.equals(Boolean.TRUE)) {
                    soma += probTempo.getProbUrgente();
                } else if(urgencia.equals(Boolean.FALSE)) {
                    soma += probTempo.getProbUrgente();
                }
                    
                if(probabilidade <= soma) {
                    
                    // Pega o número de dias sorteado e sorteia um número exato de dias
                    // Por exemplo, se a probabilidade deu 15, ele vai sortear um número de dias entre 11 e 15.
                    double min = Math.ceil(probTempo.getDias()-4);
                    double max = Math.floor(probTempo.getDias());
                    double tempo = Math.floor(Math.random() * (max - min + 1)) + min;   
                    
                    return (int) tempo;
                } 
            }           

        }
        
        return 0;
    }
    
}