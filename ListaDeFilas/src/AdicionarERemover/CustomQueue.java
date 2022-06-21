package AdicionarERemover;

public class CustomQueue<T>{

    private Node<T> inicio, fim;
    private int qtd;

    public void add(T novo) {
        Node<T> novoNo = new Node<T>(novo);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.next = novoNo;
            fim = novoNo;
        }
        qtd++;
    }

    public T remove() {
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

    public int size(){
        return qtd;
    }

    public String display() {
        String s = "";
        Node<T> aux = inicio;
        while (aux != null) {
            s += aux + " ";
            aux = aux.next;
        }
        return s;
    }
}