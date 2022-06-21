package MensagensCriptografadas;

public class Lista<T>{

    protected No<T> inicio;
    protected int qtd;

    public void inserir(T novo){
        No<T> novoNo = new No<T>(novo);
        if(inicio == null){
            inicio = novoNo;
        }
        else{
            No<T> aux = inicio;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = novoNo;
        }
        qtd++;
    }

    public String toString(){
        String s = "";
        No<T> aux = inicio;
        while(aux != null){
            s += " -> " + aux;
            aux = aux.next;
        }
        return s;
    }

    public boolean procurar(T e){
        int i = 0;
        int r = -1;
        No<T> aux = inicio;
        while(aux != null){
            if(aux.info.equals(e)){
                return true;
            }
            aux = aux.next;
            i++;
        }
        return false;
    }
}
