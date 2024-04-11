import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> elementos = new LinkedList<>();

    public void enqueue(int valor) {
        elementos.addLast(valor);
    }

    public int dequeue() {
        return elementos.removeFirst();
    }

    public int frente() {
        return elementos.getFirst();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }
}
