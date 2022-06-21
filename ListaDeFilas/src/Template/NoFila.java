package Template;

public class NoFila<T> {

    public T info;
    public NoFila<T> next;

    public NoFila(T novo) {
        this.info = novo;
    }

    public String toString() {
        return "" + info;
    }

}