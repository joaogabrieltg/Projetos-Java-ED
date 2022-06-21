package Lista1;
import java.util.Scanner;

public class Fibonacci {
    static int a=0, b=1, f=0;
    static String s = "0,1";
    public static String loop(Integer n) {
        if(n > 0){
            s += "," + fibonacci(f);
            loop(n -1);
        }
        if(n+1==0){
            s="0";
        }
        return s;
    }
    public static Integer fibonacci(Integer f) {
        f = a + b;
        a = b;
        b = f;
        return f;
    }
    public static void main(String[] args){
        System.out.println("tamanho da sequencia");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(loop(n-1));
    }
}