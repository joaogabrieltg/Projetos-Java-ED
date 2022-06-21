package RepeticaoInvertida;

public class Lista<T> {

    private No<T> inicio;
    private int qtd;

    public int getQtd(){
        return qtd;
    }

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

    public void remover(T e){
        if(inicio != null){
            if(inicio.info.equals(e)){
                inicio = inicio.next;
                qtd--;
            }
            else{
                No<T> aux = inicio;
                while (aux.next != null) {
                    if(aux.next.info.equals(e)){
                        aux.next = aux.next.next;
                        qtd--;
                        break;
                    }
                    aux = aux.next;
                }
            }
        }
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

    public String toString(){
        String s = "";
        No<T> aux = inicio;
        while (aux != null){
            s += aux + " ";
            aux = aux.next;
        }
        return s;
    }

    public void print(){
        System.out.println(this);
    }

}