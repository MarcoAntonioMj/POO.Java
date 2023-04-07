import java.util.Scanner;
import desconto.carro;

public class App {
    public static void main(String[] args) throws Exception {
        String opcaoNome = "";
        int opcao, ano, preco;

        Scanner sc = new Scanner(System.in);
        do {
            // Mostra as opções de carro
            System.out.println("Escolha um modelo de carro:");
            System.out.println("1. Fiat");
            System.out.println("2. Ford");
            System.out.println("3. Chevrolet");
            System.out.println("4. Volkswagen");
            System.out.println("5. Toyota");

            // Lê a opção selecionada pelo usuário
            opcao = sc.nextInt();

            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o modelo Fiat.");
                    opcaoNome = "Fiat";
                    break;
                case 2:
                    System.out.println("Você escolheu o modelo Ford.");
                    opcaoNome = "Ford";
                    break;
                case 3:
                    System.out.println("Você escolheu o modelo Chevrolet.");
                    opcaoNome = "Chevrolet";
                    break;
                case 4:
                    System.out.println("Você escolheu o modelo Volkswagen.");
                    opcaoNome = "Volkswagen";
                    break;
                case 5:
                    System.out.println("Você escolheu o modelo Toyota.");
                    opcaoNome = "Toyota";
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao < 1 || opcao > 5);

        // Lê o ano do carro
        System.out.println("Escolha o ano do carro:");
        ano = sc.nextInt();

        // Lê o preço do carro
        System.out.println("Escolha o preço do carro:");
        preco = sc.nextInt();

        // Aplica o desconto se o preço for maior que 15000
        if (preco > 15000) {
            carro meuCarro = new carro();
            meuCarro.setPreco(preco);
            meuCarro.aplicarDesconto();
            preco = meuCarro.getPreco();
        }
        sc.close();
        // Mostra a escolha do usuário
        System.out.println("Você escolheu o " + opcaoNome + " de " + ano + " por R$" + preco);
    }
}