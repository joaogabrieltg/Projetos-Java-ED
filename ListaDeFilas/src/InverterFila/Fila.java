package InverterFila;

public class Fila<T> {

    private No<T> inicio, fim;
    private int qtd;

    public void enqueue(T novo){
        No<T> novoNo = new No<T>(novo);
        if(inicio == null){
            inicio = fim = novoNo;
        }
        else{
            fim.next = novoNo;
            fim = novoNo;
        }
        qtd++;
    }

    public T dequeue(){
        T r = null;
        if(inicio != null){
            r = inicio.info;
            inicio = inicio.next;
            if(inicio == null){
                fim = null;
            }
            qtd--;
        }
        return r;
    }

    public int size(){
        return qtd;
    }

    public String toString(){
        String s = "";
        No<T> aux = inicio;
        while (aux != null) {
            s += aux + " ";
            aux = aux.next;
        }
        return s;
    }

    public void print(){
        System.out.println(this);
    }

    public T consultarInicio(){
        T r = null;
        if(inicio != null){
            r = inicio.info;
        }
        return r;
    }

    public T consultarFim(){
        T r = null;
        if(fim != null){
            r = fim.info;
        }
        return r;
    }

    public void inverterFila(int n){
        if(n <= 0){
            n = 0;
        }
        if(n >= size()){
            n = size();
        }
        Fila<Object> f1 = new Fila<>();
        Fila<Object> f2 = new Fila<>();
        Fila<Object> f3 = new Fila<>();
        for(int i = 0; i < size(); i++){
            T x = dequeue();
            enqueue(x);
            f1.enqueue(x);
            f2.enqueue(x);
            f3.enqueue(x);
        }
        for(int i = 0; i < size(); i++){
            f1.dequeue();
            f3.dequeue();
        }
        for(int i = 0; i < size() - (size() - n); i++){
            T x = (T) f2.dequeue();
            f1.enqueue(x);
            f3.enqueue(x);
        }
        while (f1.size() != 0) {
            for(int i = 0; i < f1.size()-1; i++){
                T x = (T) f1.dequeue();
                f1.enqueue(x);
            }
            T x = (T) f1.dequeue();
            f3.dequeue();
            f3.enqueue(x);
        }
        int m = f3.size();
        int o = f2.size();
        T x;
        while (size()!=0){
            dequeue();
        }
        while (size()<m){
            x = (T) f3. dequeue();
            enqueue(x);
        }
        while (size()<o+m){
            x = (T) f2. dequeue();
            enqueue(x);
        }
    }
}

/* Graveyard

    public void inverterFila(int n){
        if(n<=0){
            n = 0;
        }
        if(n>=size()){
            n = size();
        }
        String lista = toString();
        String[] s = lista.split(" ");
        String[] aux = new String[s.length];
        for(int i = 0; i < n; i++){
            aux[i] = s[(n-1) - i];
            dequeue();
            enqueue((T) aux[i]);
        }
        for(int i = n; i < s.length; i++){
            aux[i] = s[i];
            dequeue();
            enqueue((T) aux[i]);
        }
    }

    public void inverterFila(int n){
        if(n<=0){
            n = 0;
        }
        Fila<T> aux = new Fila<>();
        for(int i = 0; i < n; i++){
            aux.enqueue(consultar(i));
        }
        T realocar;
        int t = aux.size();
        for(int i = aux.size()-1; i >= 0; i--){
            realocar = aux.consultar(i);
            aux.enqueue(realocar);
        }
        for(int i = t-1; i >= 0; i--){
            aux.dequeue();
        }
        int s = size();
        for(int i = n; i < s; i++){
            realocar = consultar(i);
            aux.enqueue(realocar);
        }
        t = aux.size();
        for(int i = 0; i <= t-1; i++){
            enqueue(aux.consultar(i));
            dequeue();
        }
    }
*/