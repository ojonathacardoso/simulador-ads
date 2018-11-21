
package Componentes;

import java.util.Date;


public class DataAnalista {
    
    private Analista analista;
    private Date data;

    public DataAnalista(Analista analista, Date data){
        this.analista = analista;
        this.data = data;
    }

    public Analista getAnalista() {
        return analista;
    }

    public void setAnalista(Analista analista) {
        this.analista = analista;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}