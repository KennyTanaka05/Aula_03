public abstract class Exercicio {
    private String nome;

    public Exercicio(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public abstract void executar();
}
