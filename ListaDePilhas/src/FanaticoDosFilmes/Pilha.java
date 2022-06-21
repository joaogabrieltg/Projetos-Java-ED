package FanaticoDosFilmes;

public class Pilha<T>{

    private Node<T> topo;
    private int qtd;

    public void push(T e) {
        Node<T> novo = new Node<T>(e);
        novo.next = topo;
        topo = novo;
        qtd++;
    }

    public T pop() {
        T r = null;
        if (! isEmpty()) {
            r = topo.info;
            topo = topo.next;
            qtd--;
        }
        return r;
    }

    public T peek() {
        T r = null;
        if (! isEmpty()) {
            r = topo.info;
        }
        return r;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return qtd;
    }

    public String toString() {
        String r = "";
        if (! isEmpty()) {
            Node<T> p = topo;
            while (p != null) {
                r = p.info + " " + r;
                p = p.next;
            }
        }
        return r;
    }
    public void print() {
        System.out.println(this);
    }
}
