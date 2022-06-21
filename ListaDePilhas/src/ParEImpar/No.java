package ParEImpar;

public class No<T> {

    public T info;
    public No<T> next;

    public No(T novo) {
        this.info = novo;
    }

    public String toString() {
        return "" + info;
    }

}
