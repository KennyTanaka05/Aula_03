public class Plano {
    private String nomePlano;
    private double valorMensal;
    private int meses;

    public Plano(String nomePlano, double valorMensal, int meses, Aluno aluno) {
        this.nomePlano = nomePlano;
        this.valorMensal = valorMensal;
        this.meses = meses;

    }

    public Plano() {
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    @Override
    public String toString() {
        return "Plano{" +
                "nomePlano='" + nomePlano + '\'' +
                ", valorMensal=" + valorMensal +
                ", meses=" + meses +
                '}';
    }
}
