package Template;

public class TabelaHashEndAberto<T> implements TabelaHash<T>{

    private T[] elementos;

    public TabelaHashEndAberto(int n) {
        elementos = (T[]) new Object[n];
    }

    @Override
    public void inserir(T elem){
        int count = 0;
        if(count < elementos.length){
            int i = elem.hashCode() % elementos.length;
            while(elementos[i] != null){
                i = (i + 1) % elementos.length;
            }
            elementos[i] = elem;
            count++;
        }
        else{
            throw new RuntimeException("full!");
        }
    }

    @Override
    public boolean remover(T e){
        return false;
    }

    @Override
    public T consultar(int index){
        return null;
    }

    @Override
    public void print(){
    }

    @Override
    public int indexOf(T e){
        return 0;
    }
}
