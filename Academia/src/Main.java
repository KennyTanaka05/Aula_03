
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

     static Scanner scanner = new Scanner(System.in);
     static ArrayList<Exercicio> listaExercicios = new ArrayList<>();

    public static void menuCrud(String entidade){
        while(true) {
            System.out.println("""
                    1.Cadastrar
                    2.Alterar
                    3.Visualizar
                    4.Deletar
                    """);
            String opcao = scanner.nextLine();
            switch (entidade + opcao){
                //case "11" -> cadastrarAluno();
                //case "12" -> atualizarAluno();
                //case "13" -> visualizarAluno();
                //case "14" -> excluirAluno();
                //case "21" -> cadastrarPlano();
                //case "22" -> atualizarPlano();
                //case "23" -> visualizarPlano();
                //case "24" -> excluirPlano();
                //case "31" -> cadastrarTreino();
                //case "32" -> atualizarTreino();
                //case "33" -> visualizarTreino();
                //case "34" -> deletarTreino();
                case "41" -> cadastrarExercicioMusculacao();
                //case "42" -> atualizarExercicio();
                case "43" -> visualizarExercicio();
                case "44" -> excluirExercicio();
                case "51" -> cadastrarExercicioCardio();
                //case "42" -> atualizarExercicio();
                case "53" -> visualizarExercicio();
                case "54" -> excluirExercicio();
                default -> System.out.println("Opção inválida");


            }

        }
    }




    public static String lerValidarEntradas(String prompt, String regex, String mensagemErro){
        while (true){
            System.out.println(prompt);
            String valor = scanner.nextLine();
            if (valor.matches(regex)) return valor;
            System.out.println(mensagemErro);
        }
    }
    public static void cadastrarExercicioMusculacao() {
        String nome = lerValidarEntradas(
                "Digite o nome do exercícío:",
                "[\\p{L}\\p{N}]+",
                "O no do exercicio só pode conter letras e números"
        );
        int quantidadeSerie = Integer.parseInt(lerValidarEntradas(
                "Digite a quantidade de séries:",
                "\\d+",
                "Você deve informar um número inteiro"
        ));
        int numeroRepeticoes = Integer.parseInt(lerValidarEntradas(
                "Digite a quantidade de repetições:",
                "\\d+",
                "Você deve informar um número inteiro"
        ));
        double carga = Double.parseDouble(lerValidarEntradas(
                "Digite a carga:",
                "[\\p{L}\\p{N}]+",
                "O no do exercicio só pode conter letras e números")
                );

        ExercicioMusculacao exercicio = new ExercicioMusculacao(nome, quantidadeSerie, numeroRepeticoes, carga);
        listaExercicios.add(exercicio);
        System.out.println("Exercício cadastrado com sucesso!");

        }



    public static void visualizarExercicio() {
    if (listaExercicios.isEmpty()) {
        System.out.println("Não há exercícios cadastrados!");
        return;
    }
    for (Exercicio exercicio : listaExercicios) {
        exercicio.executar();
    }
}

public static void indexarExercicio() {
    if (listaExercicios.isEmpty()) {
        System.out.println("Não há exercícios cadastrados!");
        return;
    }
    for (int i=0;i<listaExercicios.size();i++) {
        System.out.println(i+1 + ". " + listaExercicios.get(i));
    }
}

public static void excluirExercicio(){
    indexarExercicio();
    int indiceExcluir = Integer.parseInt(lerValidarEntradas(
            "Digite o número do exercício que deseja excluir: ",
            "[1-"+String.valueOf(listaExercicios.size())+"]",
            "Número inválido!"
    ));
    indiceExcluir--;

    String confirma = lerValidarEntradas(
            "Deseja realmente excluir "+listaExercicios.get(indiceExcluir)+"? (S/N)",
            "[SNsn]",
            "Por favor digite somente S para sim ou N para não"
    );

    if(confirma.toLowerCase().equals("s")) {
        listaExercicios.remove(indiceExcluir);
        System.out.println("Exercício removido com sucesso!");
    }
}

public static void cadastrarExercicioCardio() {
    String nome = lerValidarEntradas(
            "Digite o nome do exercícío:",
            "[\\p{L}\\p{N}]+",
            "O no do exercicio só pode conter letras e números"
    );
    double velocidade = Double.parseDouble(lerValidarEntradas(
            "Digite a velocidade:",
            "\\d+",
            "Você deve informar um número inteiro"
    ));
    int numeroRepeticoes = Integer.parseInt(lerValidarEntradas(
            "Digite a quantidade de repetições:",
            "\\d+",
            "Você deve informar um número inteiro"
    ));
    double carga = Double.parseDouble(lerValidarEntradas(
            "Digite a carga:",
            "[\\p{L}\\p{N}]+",
            "O no do exercicio só pode conter letras e números")
    );

    ///ExercicioCardio exercicio = new ExercicioCardio(nome, velocidade, tempo, observacao);
    //listaExercicios.add(exercicio);
    //System.out.println("Exercício cadastrado com sucesso!");


}
            public static void main (String[]args){
//        Aluno aluno = new Aluno("kenny", "123123", 21321);
                //aluno.setNome("Lucas");
                //aluno.setCpf("12345678910");
                //aluno.setNumeroMatricula(12341);
//        Plano plano = new Plano();
//        plano.setNomePlano("Basico");
//        plano.setMeses(12);
//        plano.setValorMensal(12312.124);
//        aluno.setPlano(plano);

//        Aluno aluno1 = new Aluno("Ana", "423423432", 41235235);
//        Plano plano1 = new Plano();
//        plano1.setValorMensal(12412515325.124);
//        plano1.setNomePlano("Gold");
//        plano1.setMeses(24);
//        aluno1.setPlano(plano1);


//        System.out.println(aluno);
//        System.out.println(aluno1);


                System.out.println("=== Bem vindo ao FiapFit ===");
                System.out.println("""
                        1. Aluno
                        2. Plano
                        3. Treino 
                        4. Exercícios Musculuação
                        5. Exercicios Cardio
                        ------------------------
                            Digite o número da opção desejada
                        """);
                String opcao = scanner.nextLine();
                if (opcao.matches("[1-5]")) {
                    menuCrud(opcao);

                } else {
                    System.out.println("Opção inválida:");

                }

            }

        }