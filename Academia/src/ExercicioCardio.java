import java.time.LocalTime;

public class ExercicioCardio extends Exercicio{
    private double velocidade;
    private LocalTime tempo;
    private String obsevacao;

    public ExercicioCardio(String nome, double velocidade, LocalTime tempo, String obsevacao) {
        super(nome);
        this.velocidade = velocidade;
        this.tempo = tempo;
        this.obsevacao = obsevacao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    public String getObsevacao() {
        return obsevacao;
    }

    public void setObsevacao(String obsevacao) {
        this.obsevacao = obsevacao;
    }

    @Override
    public void executar() {
        System.out.println(
                getNome() + ": velocidade: "+
                        getVelocidade() + " por " +
                        getTempo() + " hora/minutos. " +
                        "Obs " + getObsevacao()

        );
    }
}
