
package Parametros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Parametros {

    private File porcentagemFixa;
    private File porcentagemManual;
    private File quantidade;
    private File urgencia;
    
    private Properties porcentagemFixaProp = new Properties();
    private Properties porcentagemManualProp = new Properties();
    private Properties quantidadeProp = new Properties();
    private Properties urgenciaProp = new Properties();
    
    public Parametros() throws FileNotFoundException, IOException {
        
        String diretorio = System.getProperty("user.home")+"/simulador-ads/";
        
        porcentagemFixa = new File(diretorio + "porcentagem-fixa.txt");
        porcentagemManual = new File(diretorio + "porcentagem-manual.txt");
        quantidade = new File(diretorio + "quantidade.txt");
        urgencia = new File(diretorio + "urgencia.txt");
        
        porcentagemFixaProp.load(new FileInputStream(porcentagemFixa));
        porcentagemManualProp.load(new FileInputStream(porcentagemManual));
        quantidadeProp.load(new FileInputStream(quantidade));
        urgenciaProp.load(new FileInputStream(urgencia));
    }

    public Properties getPorcentagemFixaProp() {
        return porcentagemFixaProp;
    }

    public Properties getPorcentagemManualProp() {
        return porcentagemManualProp;
    }

    public Properties getQuantidadeProp() {
        return quantidadeProp;
    }
    
    public Properties getUrgenciaProp() {
        return urgenciaProp;
    }
}