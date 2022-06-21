package Template;

public class NoLista<T>{
    T info;
    NoLista<T> next;

    public NoLista(T novo){
        this.info = novo;
    }

    public String toString(){
        return "" + info;
    }
}

