package Template;

public class TabelaHashFechado<T> implements TabelaHash<T>{

    private List<T> tabela[];

    public TabelaHashFechado(int n){
        tabela = new List[n];
        for (int i = 0; i < n; i++){
            tabela[i] = new List<>();
        }
    }
    public void inserir(T e){
        int i = e.hashCode() % tabela.length;
        if(!tabela[i].procurar(e)){
            tabela[i].inserir(e);
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
