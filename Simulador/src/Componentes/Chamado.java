
package Componentes;

import java.util.Date;

public class Chamado {
    
    private int tempo;
    private Setor setor;
    private Analista analista;
    private Boolean urgente;
    private Date dataInicial;
    private Date dataFinal;
    
    public Chamado(Setor setor, Boolean urgente, Analista analista, int tempo, Date[] datas) {
        this.setor = setor;
        this.urgente = urgente;
        this.analista = analista;
        this.tempo = tempo;
        this.dataInicial = datas[0];
        this.dataFinal = datas[1];
    }

    public Setor getSetor() {
        return setor;
    }

    public Analista getAnalista() {
        return analista;
    }

    public Boolean getUrgente() {
        return urgente;
    }
    
    public String getUrgenteString() {
        return urgente.equals(Boolean.TRUE) ? "Sim" : "Nao";
    }

    public int getTempo() {
        return tempo;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }
    
}