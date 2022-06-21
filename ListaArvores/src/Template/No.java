package Template;

public class No<T>{

    T info;
    No<T> esquerda, direita;

    public No(T novo){
        info = novo;
    }

    public String toString(){
        return "" + info;
    }
}