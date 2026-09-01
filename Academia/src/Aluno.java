import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cpf;
    private int numeroMatricula;
    private Plano plano;
    private ArrayList<Treino> treinos;




    public Aluno(String nome, String cpf, int numeroMatricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroMatricula = numeroMatricula;
    }

    public Aluno(Plano plano, int numeroMatricula, String cpf, String nome) {
        this.plano = plano;
        this.numeroMatricula = numeroMatricula;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Aluno(String nome, String cpf, int numeroMatricula, Plano plano, ArrayList<Treino> treinos) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroMatricula = numeroMatricula;
        this.plano = plano;
        this.treinos = treinos;
    }

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", plano=" + plano +
                ", treinos=" + treinos +
                '}';
    }
}
