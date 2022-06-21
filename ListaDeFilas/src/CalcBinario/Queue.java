package CalcBinario;

public class Queue<T>{

    private Node<T> inicio, fim;
    private int qtd;

    public void enqueue(T novo) {
        Node<T> novoNo = new Node<>(novo);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.next = novoNo;
            fim = novoNo;
        }
        qtd++;
    }
    public T dequeue() {
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
    public String toString() {
        String s = "";
        Node<T> aux = inicio;
        while (aux != null) {
            s += aux + " ";
            aux = aux.next;
        }
        return s;
    }
    public void print() {
        System.out.println(this);
    }
}