package CalculoPercurso;

public class Arvore<T>{

    private NoArvore<Comparable> raiz;

    public void inserir(T novo){
        if(!existe(novo)){
            NoArvore<Comparable> novoNoArvore = new NoArvore(novo);
            if(raiz == null){
                raiz = novoNoArvore;
            }
            else{
                NoArvore<Comparable> aux = raiz;
                while(aux != null){
                    int flag = aux.info.compareTo(novo);
                    if(flag < 0){
                        if(aux.direita != null){
                            aux = aux.direita;
                        }
                        else{
                            aux.direita = novoNoArvore;
                            break;
                        }
                    }
                    else{
                        if(aux.esquerda != null){
                            aux = aux.esquerda;
                        }
                        else{
                            aux.esquerda = novoNoArvore;
                            break;
                        }
                    }
                }
            }
        }
    }

    public T consultar(T e){
        T r = null;
        NoArvore<Comparable> aux = raiz;
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

    private double percurso(NoArvore<Comparable> p){
        double resultado = 1;
        if(p != null){
            resultado = (((double) p.info) * (percurso(p.esquerda) / percurso(p.direita)));
        }
        return resultado;
    }

    private double percursoReverso(NoArvore<Comparable> p){
        double resultado = 1;
        if(p != null){
            resultado = (((double) p.info) * (percursoReverso(p.direita) / percursoReverso(p.esquerda)));
        }
        return resultado;
    }

    public String percursos(){
        String p = String.format("%.3f", percurso(raiz));
        String pR = String.format("%.3f", percursoReverso(raiz));
        return (p + "\n" + pR).replaceAll(",", ".");
    }
}
