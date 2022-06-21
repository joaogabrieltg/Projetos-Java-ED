package AdicionarERemover;

public class CustomStack<T>{

    private Node<T> topo;
    private int qtd;

    public void add(T e) {
        Node<T> novo = new Node<T>(e);
        novo.next = topo;
        topo = novo;
        qtd++;
    }

    public T remove() {
        T r = null;
        if (! isEmpty()) {
            r = topo.info;
            topo = topo.next;
            qtd--;
        } else {
            return null;
        }
        return r;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return qtd;
    }

    public String display() {
        String r = "";
        if (! isEmpty()) {
            Node<T> p = topo;
            while (p != null) {
                r = p.info + " " + r;
                p = p.next;
            }
        } else {
            r += "Empty";
        }
        return r;
    }
}
