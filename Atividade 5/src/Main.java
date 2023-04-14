import java.util.ArrayList;
import java.util.Scanner;
import metodos.contas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaClientes = new ArrayList<>();
        contas contas = new contas();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Novo cliente e conta ");
            System.out.println("2 - Excluir cliente");
            System.out.println("3 - Mostrar clientes");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o nome da pessoa: ");
                String nome = sc.next();
                System.out.print("Digite o número da nova conta: ");
                int conta = sc.nextInt();
                listaClientes.add(nome);
                System.out.println(nome + " foi adicionado à lista.");
                contas.criarConta(conta);
                System.out.println(conta + " foi adicionado à lista.");
            } else if (opcao == 2) {
                System.out.print("Digite o nome da pessoa para remover: ");
                String nome = sc.next();
                contas.removerCliente(listaClientes, contas.getListaContas(), nome);
            } else if (opcao == 3) {
                System.out.println("Lista de clientes e contas:");
                for (int i = 0; i < listaClientes.size(); i++) {
                    System.out.println(listaClientes.get(i) + ": " + contas.getListaContas().get(i));
                }
            } else if (opcao == 4) {
                System.out.println("Saindo:");

                break;
            }

        }
        sc.close();

    }
}
