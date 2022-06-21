package Lista1;
import java.util.Scanner;

public class RetirarParenteses {
    public static String encontrarTermos(String a){
        if(a.contains("(") && a.contains(")") && a.indexOf("(") < a.indexOf(")")){
            a = a.substring(a.indexOf("(")+1, a.indexOf(")")+1);
            if(a.contains("(")){
                return encontrarTermos(a);
            }
            else if(!a.contains("(")){
                return "("+a;
            }
        }
        else{
            return "";
        }
        return "";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("texto");
        String a = scan.nextLine();
        System.out.println(encontrarTermos(a));
    }
}