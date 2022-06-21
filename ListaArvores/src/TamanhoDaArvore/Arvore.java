package TamanhoDaArvore;

public class Arvore<T>{

    private No<Comparable> raiz;

    public void inserir(T novo){
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

    public boolean existe(T e){
        return consultar(e) != null;
    }

    public String percursoEmOrdem(){
        return percursoEmOrdem(raiz);
    }

    private String percursoEmOrdem(No<Comparable> p){
        if(p != null){
            return percursoEmOrdem(p.esquerda) + p + ";" + percursoEmOrdem(p.direita);
        }
        return "";
    }

    private int percursoPos(No<Comparable> p){
        int altura = 0;
        if(p != null){
            int altNoEsquerdo = percursoPos(p.esquerda);
            int altNoDireito = percursoPos(p.direita);
            altura = (altNoEsquerdo > altNoDireito)? altNoEsquerdo : altNoDireito;
            altura++;
        }
        return altura;
    }

    public int alturaArvore(){
        int altura = percursoPos(raiz);
        return altura;
    }
}