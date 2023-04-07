package conta;

public class conta {

  private int numero;
  private double saldo;

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    saldo = saldo + valor;
    System.out.println("O seu novo saldo é : r$ " + saldo);

  }

  public void sacar(double valor) {
    if (saldo - valor < 0) {
      System.out.println("Não é possível sacar um valor maior do que o saldo atual.");
    } else {
      saldo -= valor;
      System.out.println("O seu novo saldo é : r$ " + saldo);

    }
  }

  public void inicializarConta(int n) {
    numero = n;
    saldo = 0;
  }

  public void exibirDados() {
    System.out.println("Número: " + numero +
        " - Saldo: R$ " + saldo);
  }

}
