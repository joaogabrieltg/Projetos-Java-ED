package InverterLista;

public class Node<T>{
    T info;
    Node<T> next;

    public Node(T novo){
        this.info = novo;
    }

    public String toString(){
        return "" + info;
    }
}

