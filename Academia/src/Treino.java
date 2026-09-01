import java.util.ArrayList;

public class Treino {
    private int codigoIdent;
    private String nomeTreino;
    private Objetivo objetivo;
    private ArrayList<Exercicio> exercicios;


    public Treino() {
    }

    public Treino(int codigoIdent, String nomeTreino, Objetivo objetivo, ArrayList<Exercicio> exercicios) {
        this.codigoIdent = codigoIdent;
        this.nomeTreino = nomeTreino;
        this.objetivo = objetivo;
        this.exercicios = exercicios;
    }

    public Treino(int codigoIdent, String nomeTreino, Objetivo objetivo) {
        this.codigoIdent = codigoIdent;
        this.nomeTreino = nomeTreino;
        this.objetivo = objetivo;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public int getCodigoIdent() {
        return codigoIdent;
    }

    public void setCodigoIdent(int codigoIdent) {
        this.codigoIdent = codigoIdent;
    }
}
