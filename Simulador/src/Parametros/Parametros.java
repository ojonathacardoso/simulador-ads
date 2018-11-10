
package Parametros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Parametros {

    private File porcentagemFixa = new File("src/Parametros/PorcentagemFixa.txt");
    private File porcentagemManual = new File("src/Parametros/PorcentagemManual.txt");
    private File quantidade = new File("src/Parametros/Quantidade.txt");
    private File urgencia = new File("src/Parametros/Urgencia.txt");
    
    private Properties porcentagemFixaProp = new Properties();
    private Properties porcentagemManualProp = new Properties();
    private Properties quantidadeProp = new Properties();
    private Properties urgenciaProp = new Properties();
    
    public Parametros() throws FileNotFoundException, IOException {
        
        porcentagemFixaProp.load(new FileInputStream(porcentagemFixa));
        porcentagemManualProp.load(new FileInputStream(porcentagemManual));
        quantidadeProp.load(new FileInputStream(quantidade));
        urgenciaProp.load(new FileInputStream(urgencia));
    }
    
    /*public double getParametroPorcentagemFixa(String parametro) {
        return Double.parseDouble(getPorcentagemFixaProp().getProperty(parametro) );
    }
    
    public double getParametroPorcentagemManual(String parametro) {
        return Double.parseDouble(getPorcentagemManualProp().getProperty(parametro) );
    }
    
    public int getParametroQuantidade(String parametro) {
        return Integer.parseInt(getQuantidadeProp().getProperty(parametro) );
    }*/

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