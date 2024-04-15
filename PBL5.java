import java.util.ArrayList;
import java.util.Scanner;

public class PBL5 {

    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    buscarUsuariosPorTipo();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Listar Usuários");
        System.out.println("3 - Buscar Usuários por Tipo");
        System.out.println("0 - Sair");
        System.out.print("\nDigite a opção desejada: ");
    }

    private static void cadastrarUsuario() {
        System.out.println("\n----- Cadastrar Usuário -----");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Tipo (cliente, funcionario, gerente): ");
        String tipo = scanner.next();

        Usuario usuario = new Usuario(nome, tipo);
        listaUsuarios.add(usuario);

        System.out.println("\nUsuário cadastrado com sucesso!");
    }

    private static void listarUsuarios() {
        System.out.println("\n----- Lista de Usuários -----");
        for (Usuario usuario : listaUsuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Tipo: " + usuario.getTipo());
            System.out.println("--------------------");
        }
    }

    private static void buscarUsuariosPorTipo() {
        System.out.println("\n----- Buscar Usuários por Tipo -----");
        System.out.print("Digite o tipo (cliente, funcionario, gerente): ");
        String tipo = scanner.next();

        System.out.println("\n----- Usuários do tipo " + tipo + " -----");
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getTipo().equals(tipo)) {
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("--------------------");
            }
        }
    }
}

class Usuario {

    private String nome;
    private String tipo;

    public Usuario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
