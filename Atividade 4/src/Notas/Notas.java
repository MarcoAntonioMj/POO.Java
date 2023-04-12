package Notas;

public class Notas {
  private double notaMat;
  private double notaPort;
  private double notaCien;

  public Notas(double notaMat, double notaPort, double notaCien) {
    this.notaMat = notaMat;
    this.notaPort = notaPort;
    this.notaCien = notaCien;
  }

  public double media() {
    return (notaMat + notaPort + notaCien) / 3;
  }
}
