package CalculoPercurso;

public class NoArvore<T>{

    T info;
    NoArvore<T> esquerda, direita;

    public NoArvore(T novo){
        info = novo;
    }

    public String toString(){
        return "" + info;
    }
}