package ListaPalindromos;

public class Lista<T>{

    private No<T> inicio;
    private int qtd;

    public void add(T novo){
        No<T> novoNo = new No<>(novo);
        if(inicio == null){
            inicio = novoNo;
        }
        else {
            No<T> aux = inicio;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = novoNo;
        }
        qtd++;
    }

    public T consultar(int index){
        if(index < qtd){
            int i = 0;
            No<T> aux = inicio;
            while (i != index){
                aux = aux.next;
                i++;
            }
            return aux.info;
        }
        else{
            return null;
        }
    }
}
