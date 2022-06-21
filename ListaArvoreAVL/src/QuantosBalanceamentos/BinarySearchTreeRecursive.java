package QuantosBalanceamentos;

public class BinarySearchTreeRecursive<T>{

    protected Node<Comparable> raiz;

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

    public boolean remover(T e){
        boolean r = false;
        if(raiz != null){
            if(raiz.info.equals(e)){
                if(raiz.esquerda == null){
                    raiz = raiz.direita;
                }
                else if(raiz.direita == null){
                    raiz = raiz.esquerda;
                }
                else{
                    substituiRaizSubarvore(raiz);
                }
                r = true;
            }
            else{
                Node<Comparable> p = raiz;
                Node<Comparable> paiP = p;
                while(p != null){
                    int flag = p.info.compareTo(e);
                    if(flag == 0){
                        break;
                    }
                    else if(flag < 0){
                        paiP = p;
                        p = p.direita;
                    }
                    else{
                        paiP = p;
                        p = p.esquerda;
                    }
                }
                if(p != null){
                    r = true;
                    if(p.esquerda == null){
                        if(paiP.esquerda == p){
                            paiP.esquerda = p.direita;
                        }
                        else{
                            paiP.direita = p.direita;
                        }
                    }
                    else if(p.direita == null){
                        if(paiP.esquerda == p){
                            paiP.esquerda = p.esquerda;
                        }
                        else{
                            paiP.direita = p.esquerda;
                        }
                    }
                    else{
                        substituiRaizSubarvore(p);
                    }
                }
            }
        }
        return r;
    }

    private void substituiRaizSubarvore(Node<Comparable> raizSubArvore){
        Node<Comparable> aux = raizSubArvore.direita;
        Node<Comparable> paiAux = aux;
        while(aux.esquerda != null){
            paiAux = aux;
            aux = aux.esquerda;
        }
        raizSubArvore.info = aux.info;
        if(aux != paiAux){
            paiAux.esquerda = aux.direita;
        }
        else{
            raizSubArvore.direita = aux.direita;
        }
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
            altura = (altNoEsquerdo > altNoDireito)? altNoEsquerdo : altNoDireito;
            altura++;
        }
        return altura;
    }
}
