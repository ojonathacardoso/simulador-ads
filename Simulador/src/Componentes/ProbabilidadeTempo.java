
package Componentes;

public class ProbabilidadeTempo {
    
    private Analista analista;
    private int dias;
    private double probUrgente;
    private double probNaoUrgente;

    public ProbabilidadeTempo(int dias, Analista analista, double probUrgente, double probNaoUrgente){
        this.analista = analista;
        this.dias = dias;
        this.probUrgente = probUrgente;        
        this.probNaoUrgente = probNaoUrgente;
    }
    
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Analista getAnalista() {
        return analista;
    }
    
    public void setAnalista(Analista analista) {
        this.analista = analista;
    }
    
}
