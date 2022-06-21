package Template;

public class FilaDinamica<T> implements TADFila<T> {

    private NoFila<T> inicio, fim;
    private int qtd;

    public void inserir(T novo) {
        NoFila<T> novoNo = new NoFila<T>(novo);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.next = novoNo;
            fim = novoNo;
        }
        qtd++;
    }

    public T remover() {
        T r = null;
        if (inicio != null) {
            r = inicio.info;
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
            qtd--;
        }
        return r;
    }

    public T consultarInicio() {
        T r = null;
        if (inicio != null) {
            r = inicio.info;
        }
        return r;
    }

    public int size() {
        return qtd;
    }

    public String toString() {
        String s = "";
        NoFila<T> aux = inicio;
        while (aux != null) {
            s += " -> " + aux;
            aux = aux.next;
        }
        return s;
    }

    public void print() {
        System.out.println(this);
    }

}