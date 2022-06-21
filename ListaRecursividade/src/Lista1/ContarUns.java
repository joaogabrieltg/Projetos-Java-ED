package Lista1;
import java.util.Scanner;

public class ContarUns {
    static int count = 0;
    static String num = "";
    public static int contarDigitoUm(int n){
        if(n != 0){
            System.out.println(n);
            num = Integer.toString(n);
            count = loop(num, num.length());
            n = contarDigitoUm(n - 1);
        }
        return count;
    }
    public static int loop(String num, int l){
        if(l > 0){
            if(num.charAt(l - 1) == '1'){
                count++;
            }
            l = loop(num, l - 1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("numero pra contar o 1");
        int n = scan.nextInt();
        System.out.println(contarDigitoUm(n));
    }
}