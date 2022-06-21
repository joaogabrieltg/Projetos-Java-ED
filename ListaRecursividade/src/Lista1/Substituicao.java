package Lista1;
import java.util.Scanner;

public class Substituicao {
    public static String trocaRecursiva(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s","");
        s = s.replaceAll("\\,","");
        s = s.replaceAll("\\.","");
        s = s.replaceAll("pi","3.14");
        return s;
    }
    public static void main(String[] args){
        System.out.println("texto com pi");
        Scanner scan = new Scanner(System.in);
        System.out.println(trocaRecursiva(scan.nextLine()).toLowerCase());
    }
}