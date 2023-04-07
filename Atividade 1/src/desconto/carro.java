package desconto;

public class carro {
    private int preco;

    public void aplicarDesconto() {
        if (preco > 10000) {
            preco -= 200;
            System.out.println("Desconto de R$200 aplicado.");
        }
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
