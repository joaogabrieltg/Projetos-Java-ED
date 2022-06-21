package Balanceamento;

public class Arvore<T>{

    protected Node<Comparable> raiz;
    private boolean isAVL;

    public void inserir(T novo){
        if(!existe(novo)){
            Node<Comparable> novoNode = new Node(novo);
            if(raiz == null){
                raiz = novoNode;
            }
            else{
                Node<Comparable> aux = raiz;
                while(aux != null){
                    int flag = aux.info.compareTo(novo);
                    if(flag < 0){
                        if(aux.direita != null){
                            aux = aux.direita;
                        }
                        else{
                            aux.direita = novoNode;
                            break;
                        }
                    }
                    else{
                        if(aux.esquerda != null){
                            aux = aux.esquerda;
                        }
                        else{
                            aux.esquerda = novoNode;
                            break;
                        }
                    }
                }
            }
        }
    }

    public boolean estaBalanceada(){
        isAVL = true;
        AlturaNo(raiz);
        return isAVL;
    }

    public T consultar(T e){
        T r = null;
        Node<Comparable> aux = raiz;
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

    public int AlturaNo(Node<Comparable> p){
        int altura = 0;
        if(p != null){
            int altNoEsquerdo = AlturaNo(p.esquerda);
            int altNoDireito = AlturaNo(p.direita);
            altura = (altNoEsquerdo > altNoDireito)? (altNoEsquerdo + 1) : (altNoDireito + 1);
            if(Math.abs(altNoEsquerdo - altNoDireito) > 1 && isAVL){
                isAVL = false;
            }
        }
        return altura;
    }
}