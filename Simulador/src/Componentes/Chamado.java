
package Componentes;

import java.util.Date;

public class Chamado {
    
    private int tempo;
    private Setor setor;
    private Analista analista;
    private Boolean urgente;
    
    public Chamado(Setor setor, Boolean urgente, Analista analista, int tempo) {
        this.setor = setor;
        this.urgente = urgente;
        this.analista = analista;
        this.tempo = tempo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Analista getAnalista() {
        return analista;
    }

    public void setAnalista(Analista analista) {
        this.analista = analista;
    }

    public Boolean getUrgente() {
        return urgente;
    }

    public void setUrgente(Boolean urgente) {
        this.urgente = urgente;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
       
}