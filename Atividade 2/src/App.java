import java.util.Scanner;
import conta.conta;

public class App {
    public static void main(String[] args) throws Exception {
        conta c = new conta();
        c.inicializarConta(151515);
        Scanner sc = new Scanner(System.in);
        int opcao;
        double valor;
        do {
            System.out.println("1: DEPOSITAR");
            System.out.println("2: SACAR");
            System.out.println("3: MOSTRAR");
            System.out.println("4: SAIR");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    valor = sc.nextDouble();
                    c.depositar(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    valor = sc.nextDouble();
                    c.sacar(valor);
                    break;
                case 3:
                    c.exibirDados();
                    break;
                case 4:
                    System.out.println("FIM DO PROGRAMA!!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (opcao != 4);

        sc.close();

    }
}
