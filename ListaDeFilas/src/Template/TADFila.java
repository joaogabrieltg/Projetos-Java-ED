package Template;

public interface TADFila<T> {

    public void inserir(T novo);

    public T remover();

    public T consultarInicio();

    public int size();

    public void print();
}
