public class Exercicio {
    private String nomeExer;
    private int numeroRepeticao;
    private int qtdSerie;
    private String carga;

    public Exercicio(String nomeExer, int numeroRepeticao, int qtdSerie, String carga) {
        this.nomeExer = nomeExer;
        this.numeroRepeticao = numeroRepeticao;
        this.qtdSerie = qtdSerie;
        this.carga = carga;
    }

    public Exercicio() {
    }

    public String getNomeExer() {
        return nomeExer;
    }

    public void setNomeExer(String nomeExer) {
        this.nomeExer = nomeExer;
    }

    public int getNumeroRepeticao() {
        return numeroRepeticao;
    }

    public void setNumeroRepeticao(int numeroRepeticao) {
        this.numeroRepeticao = numeroRepeticao;
    }

    public int getQtdSerie() {
        return qtdSerie;
    }

    public void setQtdSerie(int qtdSerie) {
        this.qtdSerie = qtdSerie;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "nomeExer='" + nomeExer + '\'' +
                ", numeroRepeticao=" + numeroRepeticao +
                ", qtdSerie=" + qtdSerie +
                ", carga='" + carga + '\'' +
                '}';
    }
}
