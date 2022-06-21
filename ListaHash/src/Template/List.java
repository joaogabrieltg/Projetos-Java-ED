package Template;

public class List<T> implements TADLista<T>{

    protected NoLista<T> inicio;
    protected int qtd;

    public void inserir(T novo){
        NoLista<T> novoNo = new NoLista<T>(novo);
        if(inicio == null){
            inicio = novoNo;
        }
        else{
            NoLista<T> aux = inicio;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = novoNo;
        }
        qtd++;
    }

    public boolean remover(T e){
        boolean r = false;
        if(inicio != null){
            if(inicio.info.equals(e)){
                inicio = inicio.next;
                r = true;
                qtd--;
            }
            else{
                NoLista<T> aux = inicio;
                while(aux.next != null){
                    if(aux.next.info.equals(e)){
                        // encontrei o elemento que deve ser removido!
                        aux.next = aux.next.next; // removido o elemento
                        r = true;
                        qtd--;
                        break;
                    }
                    aux = aux.next;
                }
            }
        }
        return r;
    }

    public T consultar(int index){
        if(index < qtd){
            int i = 0;
            NoLista<T> aux = inicio;
            while(i != index){
                aux = aux.next;
                i++;
            }
            return aux.info;
        }
        else{
            return null;
        }
    }

    public String toString(){
        String s = "";
        NoLista<T> aux = inicio;
        while(aux != null){
            s += " -> " + aux;
            aux = aux.next;
        }
        return s;
    }

    public void print(){
        System.out.println(this);
    }

    public int indexOf(T e){
        int i = 0;
        int r = -1;
        NoLista<T> aux = inicio;
        while(aux != null){
            if(aux.info.equals(e)){
                r = i;
                break;
            }
            aux = aux.next;
            i++;
        }
        return r;
    }

    public boolean procurar(T e){
        int i = 0;
        int r = -1;
        NoLista<T> aux = inicio;
        while(aux != null){
            if(aux.info.equals(e)){
                return true;
            }
            aux = aux.next;
            i++;
        }
        return false;
    }
}
