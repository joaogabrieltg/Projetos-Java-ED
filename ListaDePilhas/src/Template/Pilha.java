package Template;

public class Pilha<T>{

    private No<T> topo;
    private int qtd;

    public void push(T e) {
        No<T> novo = new No<T>(e);
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
        } else {
            throw new RuntimeException("CustomStack vazia!");
        }
        return r;
    }

    public T peek() {
        T r = null;
        if (! isEmpty()) {
            r = topo.info;
        } else {
            throw new RuntimeException("CustomStack vazia!");
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
        String r = "topo ";
        if (! isEmpty()) {
            No<T> p = topo;
            while (p != null) {
                r += "-> " + p.info;
                p = p.next;
            }
        } else {
            r += "-> null";
        }
        return r;
    }

    public void print() {
        System.out.println(this);
    }

}
