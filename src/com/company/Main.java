import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar Gerente");
            System.out.println("2. Criar Professor");
            System.out.println("3. Criar Aluno");
            System.out.println("4. Criar Curso");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    criarGerente();
                    break;
                case 2:
                    criarProfessor();
                    break;
                case 3:
                    criarAluno();
                    break;
                case 4:
                    criarCurso();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void criarGerente() {
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        System.out.println("Digite o email do professor associado (ou deixe em branco):");
        String professorEmail = scanner.nextLine();
        Professor professor = null;
        if (!professorEmail.isEmpty()) {

            professor = buscarProfessorPorEmail(professorEmail);
        }

        Gerente gerente = new Gerente(email, nome, telefone, senha, professor);

        System.out.println("Gerente criado com sucesso.");
    }

    private static Professor buscarProfessorPorEmail(String email) {

        return new Professor(email, "Nome do Professor", "Telefone", "Senha");
    }

    private static void criarProfessor() {
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        Professor professor = new Professor(email, nome, telefone, senha);

        System.out.println("Professor criado com sucesso.");
    }

    private static void criarAluno() {
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        Aluno aluno = new Aluno(email, nome, telefone, senha);

        System.out.println("Aluno criado com sucesso.");
    }

    private static void criarCurso() {
        System.out.println("Digite o id do curso:");
        String id = scanner.nextLine();
        System.out.println("Digite o nome do curso:");
        String nome = scanner.nextLine();
        System.out.println("Digite a descrição do curso:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o tempo do curso:");
        String tempo = scanner.nextLine();
        System.out.println("Digite a quantidade de alunos:");
        int quantidadeDeAlunos = scanner.nextInt();
        scanner.nextLine();  // Consumir newline

        Curso curso = new Curso(id, nome, descricao, tempo, quantidadeDeAlunos);

        System.out.println("Curso criado com sucesso.");
    }
}
