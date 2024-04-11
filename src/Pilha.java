import java.util.ArrayList;

public class Pilha {
    private ArrayList<Integer> elementos = new ArrayList<>();

    public void push(int valor) {
        elementos.add(valor);
    }

    public int pop() {
        return elementos.remove(elementos.size() - 1);
    }

    public int topo() {
        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }
}