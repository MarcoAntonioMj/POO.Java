package metodos;

import java.util.ArrayList;

public class contas {
    private ArrayList<Integer> listaContas = new ArrayList<Integer>();

    public void criarConta(int numeroConta) {
        listaContas.add(numeroConta);
    }

    public void removerCliente(ArrayList<String> listaClientes, ArrayList<Integer> listaContas, String nome) {
        int index = listaClientes.indexOf(nome);
        if (index >= 0) {
            listaClientes.remove(index);
            listaContas.remove(index);
            System.out.println(nome + " foi removido da lista.");
        } else {
            System.out.println(nome + " não foi encontrado na lista.");
        }
    }

    public ArrayList<Integer> getListaContas() {
        return listaContas;
    }
}