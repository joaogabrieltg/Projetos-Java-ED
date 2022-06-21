package ListaDeListas;

public class List<T>{

    private Node<T> inicio;
    private int qtd;

    public void receberString(T novo){
        Node<T> novoNo = new Node<>(novo);
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

    public String toString(){
        String s = "";
        Node<T> aux = inicio;
        while (aux != null){
            s += aux;
            aux = aux.next;
        }
        return s;
    }

}