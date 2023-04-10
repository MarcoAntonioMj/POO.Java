import calculo.Retangulo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.print("Base do Retangulo: ");
        double base = leia.nextDouble();

        System.out.print("Altura do Retangulo: ");
        double altura = leia.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println("Área do Retangulo: " + retangulo.area());
        System.out.println("Perimetro do Retangulo: " + retangulo.perimetro());
        leia.close();
    }
}
