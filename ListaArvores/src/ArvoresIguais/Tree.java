package ArvoresIguais;

public class Tree<T>{

    private Node<Comparable> raiz;

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

    public String percurso(){
        return percurso(raiz);
    }

    private String percurso(Node<Comparable> p){
        if(p != null){
            return p + ";" + percurso(p.esquerda) + percurso(p.direita);
        }
        return "";
    }
}