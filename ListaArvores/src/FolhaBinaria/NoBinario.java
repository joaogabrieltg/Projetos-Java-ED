package FolhaBinaria;

public class NoBinario<T>{

    T info;
    NoBinario<T> esquerda, direita;

    public NoBinario(T novo){
        info = novo;
    }

    public String toString(){
        return "" + info;
    }
}