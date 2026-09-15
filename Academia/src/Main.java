
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
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
                case "41" -> cadastrarExercicio();
                //case "42" -> atualizarExercicio();
                //case "43" -> visualizarExercicio();
                //case "44" -> deletarExercicio();
                default -> System.out.println("Opção inválida");


            }

        }
    }
    public static void cadastrarExercicio() {
        String nome;
        int quantideSerie;
        int numeroRepeticoes;
        String carga;

        while (true) {
            System.out.println("Digite o nome do exercicio:");
            nome = scanner.nextLine();
            if (nome.isBlank() || nome.isEmpty()) {
                continue;
            } else {
                break;

            }
        }
        System.out.println("Digite a quantidade de séries:");
        String series = scanner.nextLine();
        while (true){
            if (series.matches("[0-9]+")) {
                quantideSerie = Integer.parseInt(scanner.nextLine());
                break;
            } else {
                System.out.println("Digite um número!!");
            }

        }

        while(true){
            System.out.println("Digite o número de repetição:");
            String repeticao = scanner.nextLine();
            if (repeticao.matches("[0-9]+")) {
                numeroRepeticoes = Integer.parseInt(scanner.nextLine());
                break;
            } else {
                System.out.println("Digite um número");
            }
        }

        while (true){
            System.out.println("Digite a carga:");
            carga = scanner.nextLine();
            if (carga.matches(".*\\d.*")) {
                break;
            } else {
                System.out.println("Digite um número");

            }
        }

    }

    public static void main(String[] args) {
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
                4. Exercícios
                ------------------------
                    Digite o número da opção desejada
                """);
        String opcao = scanner.nextLine();
            if(opcao.matches("[1-4]")){
                menuCrud(opcao);

            } else {
                System.out.println("Opção inválida:");

        }

    }

}