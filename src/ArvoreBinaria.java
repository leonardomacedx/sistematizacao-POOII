public class ArvoreBinaria {
    No raiz;

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerdo = inserirRecursivo(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = inserirRecursivo(atual.direito, valor);
        }

        return atual;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private void percursoEmOrdemRecursivo(No no) {
        if (no != null) {
            percursoEmOrdemRecursivo(no.esquerdo);
            System.out.print(no.valor + " ");
            percursoEmOrdemRecursivo(no.direito);
        }
    }

    public void percursoEmOrdem() {
        percursoEmOrdemRecursivo(raiz);
    }

    private void percursoPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percursoPreOrdemRecursivo(no.esquerdo);
            percursoPreOrdemRecursivo(no.direito);
        }
    }

    public void percursoPreOrdem() {
        percursoPreOrdemRecursivo(raiz);
    }

    private void percursoPosOrdemRecursivo(No no) {
        if (no != null) {
            percursoPosOrdemRecursivo(no.esquerdo);
            percursoPosOrdemRecursivo(no.direito);
            System.out.print(no.valor + " ");
        }
    }

    public void percursoPosOrdem() {
        percursoPosOrdemRecursivo(raiz);
    }
}
