package Lista1;
import java.util.Scanner;

public class EliminacaoRecursiva {
    public static String eliminacaoRecursiva(String s) {
        String novaS = "";
        String aux = s.substring(1);
        if(s.length() <= 1){
            return s;
        }
        if(s.substring(1,2).equals(s.substring(0,1))){
            return eliminacaoRecursiva(aux);
        }
        else{
            novaS += s.charAt(0);
            return novaS + eliminacaoRecursiva(aux);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("tirar repeticoes");
        String s = scan.nextLine();
        System.out.println(eliminacaoRecursiva(s));

    }
}