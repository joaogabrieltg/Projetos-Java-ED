package Template;

public class TesteFila {
    public static void main(String[] args) {
        FilaDinamica<Integer> fila = new FilaDinamica<Integer>();
        fila.inserir(2);
        fila.inserir(5);
        fila.inserir(3);
        fila.inserir(7);
        fila.inserir(1);
        fila.print();
        fila.remover();
        fila.remover();
        fila.inserir(8);
        fila.print();
    }
}