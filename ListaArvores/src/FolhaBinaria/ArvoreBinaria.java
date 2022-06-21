package FolhaBinaria;

public class ArvoreBinaria<T>{

    private NoBinario<Comparable> raiz;

    public void inserir(T novo){
        if(!existe(novo)){
            NoBinario<Comparable> novoNoBinario = new NoBinario(novo);
            if(raiz == null){
                raiz = novoNoBinario;
            }
            else{
                NoBinario<Comparable> aux = raiz;
                while(aux != null){
                    int flag = aux.info.compareTo(novo);
                    if(flag < 0){
                        if(aux.direita != null){
                            aux = aux.direita;
                        }
                        else{
                            aux.direita = novoNoBinario;
                            break;
                        }
                    }
                    else{
                        if(aux.esquerda != null){
                            aux = aux.esquerda;
                        }
                        else{
                            aux.esquerda = novoNoBinario;
                            break;
                        }
                    }
                }
            }
        }
    }

    public T consultar(T e){
        T r = null;
        NoBinario<Comparable> aux = raiz;
        while(aux != null){
            int flag = aux.info.compareTo(e);
            if(flag == 0){
                r = (T) aux.info;
                break;
            }
            else if(flag < 0){
                aux = aux.direita;
            }
            else{
                aux = aux.esquerda;
            }
        }
        return r;
    }

    public boolean existe(T e){
        return consultar(e) != null;
    }

    public NoBinario<Comparable> getRaiz(){
        return raiz;
    }

    public int folha(NoBinario<Comparable> p){
        if(p != null && p.esquerda == null && p.direita == null){
            return 1;
        }
        else if(p == null){
            return 0;
        }
        return folha(p.esquerda) + folha(p.direita);
    }
}