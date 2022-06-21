package PilhaDeMultiplos;

public class NoPilha<T> {

    public T info;
    public NoPilha<T> next;

    public NoPilha(T novo) {
        this.info = novo;
    }

    public String toString() {
        return "" + info;
    }

}
