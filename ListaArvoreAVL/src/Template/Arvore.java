package Template;

public class  Arvore<T>{

    protected No<Comparable> raiz;

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
                No<Comparable> p = raiz;
                No<Comparable> paiP = p;
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

    private void substituiRaizSubarvore(No<Comparable> raizSubArvore){
        No<Comparable> aux = raizSubArvore.direita;
        No<Comparable> paiAux = aux;
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

    private void percursoPreOrdem(No<Comparable> p){
        if(p != null){
            System.out.print(p.info + ", ");
            percursoPreOrdem(p.esquerda);
            percursoPreOrdem(p.direita);
        }
    }

    private void percursoPosOrdem(No<Comparable> p){
        if(p != null){
            percursoPosOrdem(p.esquerda);
            percursoPosOrdem(p.direita);
            System.out.print(p.info + ", ");
        }
    }

    private void percursoEmOrdem(No<Comparable> p){
        if(p != null){
            percursoEmOrdem(p.esquerda);
            System.out.print(p.info + ", ");
            percursoEmOrdem(p.direita);
        }
    }

    public void print(){
        System.out.print("Percurso pre-ordem: ");
        percursoPreOrdem(raiz);
        System.out.println("");
        System.out.print("Percurso pos-ordem: ");
        percursoPosOrdem(raiz);
        System.out.println("");
        System.out.print("Percurso em-ordem: ");
        percursoEmOrdem(raiz);
        System.out.println("");
    }

    private int AlturaNo(No<Comparable> p){
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
