
package Componentes;

public class ProbabilidadeAnalista {
    
    private Setor setor;
    private Analista analista;
    private double probabilidade;
    
    public ProbabilidadeAnalista(Setor setor, Analista analista, double probabilidade){
        this.setor = setor;
        this.analista = analista;
        this.probabilidade = this.probabilidade;
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

    public double getProbabilidade() {
        return probabilidade;
    }

    public void setProbabilidade(double probabilidade) {
        this.probabilidade = probabilidade;
    }
        
}