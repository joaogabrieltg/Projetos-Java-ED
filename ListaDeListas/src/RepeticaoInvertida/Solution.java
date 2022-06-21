package RepeticaoInvertida;


public class Solution {
    public static void main(String[] args){

        int a = 2;
        int b = 1;
        int c = 4;
        int d = 4;
        int e = 2;
        int f = 8;
        int g = 2;

        //2 8 4 1

        Lista<Integer> lista = new Lista<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        String result = Result.novaLista(lista).toString();
        System.out.println(result);

    }
}
