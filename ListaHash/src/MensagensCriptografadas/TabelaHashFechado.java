package MensagensCriptografadas;

public class TabelaHashFechado<T>{

    private Lista<T> tabela[];

    public TabelaHashFechado(int n){
        tabela = new Lista[n];
        for(int i = 0; i < n; i++){
            tabela[i] = new Lista<>();
        }
    }

    public void inserir(String e){
        int i = IndexOf(e.charAt(0) + "");
        if(!tabela[i].procurar((T) e)){
            tabela[i].inserir((T) e);
        }
    }

    private int hashCode(String e){
        return e.hashCode();
    }

    public String consultar(int i){
        return tabela[i].inicio.info.toString();
    }

    public int IndexOf(String e){
        return hashCode(e) % tabela.length;
    }
}