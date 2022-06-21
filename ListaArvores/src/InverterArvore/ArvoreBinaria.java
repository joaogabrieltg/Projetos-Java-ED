package InverterArvore;

public class ArvoreBinaria<T>{

    private No<Comparable> raiz;

    public void add(T novo){
        if(!existe(novo)){
            No<Comparable> novoNo = new No(novo);
            if(raiz == null){
                raiz = novoNo;
            }
            else{
                No<Comparable> aux = raiz;
                while(aux != null){
                    int flag = aux.info.compareTo(novo);
                    if(flag < 0){
                        if(aux.direita != null){
                            aux = aux.direita;
                        }
                        else{
                            aux.direita = novoNo;
                            break;
                        }
                    }
                    else{
                        if(aux.esquerda != null){
                            aux = aux.esquerda;
                        }
                        else{
                            aux.esquerda = novoNo;
                            break;
                        }
                    }
                }
            }
        }
    }

    public T consultar(T e){
        T r = null;
        No<Comparable> aux = raiz;
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

    public void inverterArvore(){
        inverterArvore(raiz, null);
    }

    private void inverterArvore(No<Comparable> p, No<Comparable> n){
        if(p != null){
            n = p.direita;
            p.direita = p.esquerda;
            p.esquerda = n;
            inverterArvore(p.direita, n);
            inverterArvore(p.esquerda, n);
        }
    }

    public boolean existe(T e){
        return consultar(e) != null;
    }

    public void percursoEmOrdem(){
        percursoEmOrdem(raiz);
    }

    private void percursoEmOrdem(No<Comparable> p){
        if(p != null){
            percursoEmOrdem(p.esquerda);
            System.out.print(p.info + " ");
            percursoEmOrdem(p.direita);
        }
    }
}