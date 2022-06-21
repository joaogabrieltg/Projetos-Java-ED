package MensagensCriptografadas;

public class No<T>{

    T info;
    No<T> next;

    public No(T novo){
        this.info = novo;
    }

    public String toString(){
        return "" + info;
    }
}