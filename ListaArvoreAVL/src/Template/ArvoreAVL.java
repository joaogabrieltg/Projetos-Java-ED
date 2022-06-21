package Template;

public class ArvoreAVL<T extends Comparable> extends Arvore<T>{

    private boolean isAVL;
    private No<Comparable> x, y, z;
    private No<Comparable> t0, t1, t2, t3;
    private int a, b, c;
    private int count = 0;


    public void inserir(T novo){
        super.inserir(novo);
    }

    public boolean remover(T e){
        boolean r = super.remover(e);
        while(!isAVL()){
            balancear();
        }
        return r;
    }

    public boolean isAVL(){
        isAVL = true;
        z = y = x = null;
        t0 = t1 = t2 = t3 = null;
        a = b = c = 0;
        AlturaNo(raiz);
        return isAVL;
    }

    private void RSD(){
        x = y.esquerda;
        t0 = x.esquerda;
        t1 = x.direita;
        t2 = y.direita;
        t3 = z.direita;
        a = (Integer) x.info;
        b = (Integer) y.info;
        c = (Integer) z.info;
    }
    private void RDD(){
        x = y.direita;
        t0 = y.esquerda;
        t1 = x.esquerda;
        t2 = x.direita;
        t3 = z.direita;
        a = (Integer) y.info;
        b = (Integer) x.info;
        c = (Integer) z.info;
    }
    private void RSE(){
        x = y.direita;
        t0 = z.esquerda;
        t1 = y.esquerda;
        t2 = x.esquerda;
        t3 = x.direita;
        a = (Integer) z.info;
        c = (Integer) x.info;
        b = (Integer) y.info;
    }
    private void RDE(){
        x = y.esquerda;
        t0 = z.esquerda;
        t1 = x.esquerda;
        t2 = x.direita;
        t3 = y.direita;
        a = (Integer) z.info;
        c = (Integer) y.info;
        b = (Integer) x.info;
    }
        public void balancear(){
        count = 0;
        while(!isAVL()){
            if(AlturaNo(z.esquerda) > AlturaNo(z.direita)){
                y = z.esquerda;
                if(AlturaNo(y.esquerda) >= AlturaNo(y.direita)){
                    RSD();
                }
                else{
                    RDD();
                }
            }
            else{
                y = z.direita;
                if(AlturaNo(y.esquerda) <= AlturaNo(y.direita)){
                    RSE();
                }
                else{
                    RDE();
                }
            }
            z.info = b;
            z.esquerda = new No<Comparable>(a);
            z.direita = new No<Comparable>(c);
            z.esquerda.esquerda = t0;
            z.esquerda.direita = t1;
            z.direita.esquerda = t2;
            z.direita.direita = t3;
            z = null;
            count++;
        }
        isAVL();
    }

    public int getCount(){
        return count;
    }

    private int AlturaNo(No<Comparable> p){
        int altura = 0;
        if(p != null){
            int altNoEsquerdo = AlturaNo(p.esquerda);
            int altNoDireito = AlturaNo(p.direita);
            altura = (altNoEsquerdo > altNoDireito)? (altNoEsquerdo + 1) : (altNoDireito + 1);
            if(Math.abs(altNoEsquerdo - altNoDireito) > 1 && isAVL){
                isAVL = false;
                z = p;
            }
        }
        return altura;
    }

}
