package Template;

public interface TADLista<T> {
    void inserir(T novo);
    boolean remover(T e);
    T consultar(int index);
    void print();
    int indexOf(T e);
}
