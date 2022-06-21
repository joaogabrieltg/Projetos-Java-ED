package Template;

public interface TabelaHash<T>{
    void inserir(T novo);
    boolean remover(T e);
    T consultar(int index);
    void print();
    int indexOf(T e);
}
