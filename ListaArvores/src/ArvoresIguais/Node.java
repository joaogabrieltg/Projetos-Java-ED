package ArvoresIguais;

public class Node<T>{
    T info;
    Node<T> esquerda, direita;

    public Node(T novo){
        info = novo;
    }

    public String toString(){
        return "" + info;
    }
}