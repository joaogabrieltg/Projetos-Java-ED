package FilaPrioridade;

public class Queue<T>{

    private Node<T> inicio, fim;
    private int qtd;

    public void enqueue(T novo) {
        Node<T> novoNo = new Node<>(novo);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.next = novoNo;
            fim = novoNo;
        }
        qtd++;
    }

    public void receberString(String entrada){
        if(entrada.charAt(entrada.length()-1)!=';'){
            entrada+=";";
        }
        String s = entrada.substring(0, entrada.indexOf(";"));
        enqueue((T)Integer.valueOf(s));
        if(entrada.substring(entrada.indexOf(";")+1).contains(";")){
            receberString(entrada.substring(entrada.indexOf(";")+1));
        }
    }

    public T dequeue() {
        T r = null;
        if (inicio != null) {
            r = inicio.info;
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
            qtd--;
        }
        return r;
    }

    public T consultarInicio() {
        T r = null;
        if (inicio != null) {
            r = inicio.info;
        }
        return r;
    }

    public int size() {
        return qtd;
    }

    public String toString() {
        String s = "";
        Node<T> aux = inicio;
        while (aux != null) {
            s += aux + " ";
            aux = aux.next;
        }
        return s;
    }

    public void print() {
        System.out.println(this);
    }
}