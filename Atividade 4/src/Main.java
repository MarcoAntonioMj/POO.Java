import java.util.Scanner;
import Notas.Notas;

public class Main {
  public static void main(String[] args) {
    String nome;
    int idade;
    double notaMat, notaPort, notaCien;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o seu nome:");
    nome = sc.next();
    System.out.println("Olá, " + nome + "!");
    System.out.println("Digite a sua idade:");
    idade = sc.nextInt();
    System.out.println("Digite a sua nota em matemática:");
    notaMat = sc.nextDouble();
    System.out.println("Digite a sua nota em português:");
    notaPort = sc.nextDouble();
    System.out.println("Digite a sua nota em ciências:");
    notaCien = sc.nextDouble();
    Notas notas = new Notas(notaMat, notaPort, notaCien);
    System.out.println("Aluno: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Média: " + notas.media());
    sc.close();
  }
}
