import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("kenny", "123123", 21321);
        //aluno.setNome("Lucas");
        //aluno.setCpf("12345678910");
        //aluno.setNumeroMatricula(12341);
        Plano plano = new Plano();
        plano.setNomePlano("Basico");
        plano.setMeses(12);
        plano.setValorMensal(12312.124);
        aluno.setPlano(plano);

        Aluno aluno1 = new Aluno("Ana", "423423432", 41235235);
        Plano plano1 = new Plano();
        plano1.setValorMensal(12412515325.124);
        plano1.setNomePlano("Gold");
        plano1.setMeses(24);
        aluno1.setPlano(plano1);


        System.out.println(aluno);
        System.out.println(aluno1);
    }
}