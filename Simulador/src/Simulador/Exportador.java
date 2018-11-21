package Simulador;

import Componentes.Chamado;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Exportador {
	
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // Cabeçalho
    private static final String FILE_HEADER = "Setor,Urgente,Analista,Tempo,DataInicial,DataFinal";

    public static void criarArquivo(ArrayList chamados) {

        FileWriter fileWriter = null;

        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
            LocalDateTime now = LocalDateTime.now();
            
            String fileName = System.getProperty("user.home")+"/simulador-ads/dados_"+dtf.format(now)+".csv";
            
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for(int x = 0; x < chamados.size(); x++) {
                Chamado c = (Chamado) chamados.get(x);

                SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
                
                fileWriter.append(c.getSetor().getNome());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getUrgenteString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getAnalista().getNome());  
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(c.getTempo())); 
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(dt.format(c.getDataInicial()));  
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(dt.format(c.getDataFinal()));  
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Arquivo CSV criado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro na criação do CSV");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Erro ao tentar fechar o arquivo!");
                e.printStackTrace();
            }

        }
    }
}