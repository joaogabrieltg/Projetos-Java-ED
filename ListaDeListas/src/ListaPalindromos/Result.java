package ListaPalindromos;

import java.util.Objects;
public class Result {
    public static String verificarPalindromo(Lista lista){
        String s1 = lista.consultar(0).toString();
        String s2 = lista.consultar(1).toString();
        String s3 = lista.consultar(2).toString();
        String s5 = lista.consultar(4).toString();
        String s6 = lista.consultar(5).toString();
        String s7 = lista.consultar(6).toString();
        if(Objects.equals(s1, s7) && Objects.equals(s2, s6) && Objects.equals(s3, s5)){
            return "true";
        }
        else{
            return "false";
        }
    }
}