package InverterLista;

public class List<T> {

    private Node<T> inicio;
    private int qtd;

    public void inserir(T novo){
        Node<T> novoNo = new Node<T>(novo);
        if(inicio == null){
            inicio = novoNo;
        }
        else {
            Node<T> aux = inicio;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = novoNo;
        }
        qtd++;
    }

    public boolean remover(T e){
        boolean r = false;
        if(inicio != null){
            if(inicio.info.equals(e)){
                inicio = inicio.next;
                r = true;
                qtd--;
            }
            else{
                Node<T> aux = inicio;
                while (aux.next != null) {
                    if(aux.next.info.equals(e)){
                        aux.next = aux.next.next;
                        r = true;
                        qtd--;
                        break;
                    }
                    aux = aux.next;
                }
            }
        }
        return r;
    }

    public T consultar(int index){
        if(index < qtd){
            int i = 0;
            Node<T> aux = inicio;
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
        Node<T> aux = inicio;
        while (aux != null){
            s += aux + ", ";
            aux = aux.next;
        }
        return s;
    }

    public int getQtd(){
        return qtd;
    }
}
