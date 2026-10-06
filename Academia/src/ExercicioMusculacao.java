public class ExercicioMusculacao  extends Exercicio{
    private int numeroRepeticao;
    private int qtdSerie;
    private double carga;

    public ExercicioMusculacao(String nome, int numeroRepeticao, int qtdSerie, double carga) {
        super(nome);
        this.numeroRepeticao = numeroRepeticao;
        this.qtdSerie = qtdSerie;
        this.carga = carga;
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

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void executar() {
        System.out.println(
                getNome()+ " "+
                        getNumeroRepeticao() + " X " +
                        getQtdSerie() + " repetições com " +
                        getCarga() + " kg"
        );
    }
}
