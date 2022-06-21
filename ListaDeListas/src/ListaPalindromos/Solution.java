package ListaPalindromos;

public class Solution {
    public static void main(String[] args){
        Lista lista = new Lista();

        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s5 = "c";
        String s6 = "b";
        String s7 = "a";


        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);
        lista.add(s6);
        lista.add(s7);

        String result = Result.verificarPalindromo(lista);
        System.out.println(result);
    }
}
