package FolhaBinaria;

public class Solution{
    public static void main(String[] args){
        String a = "1 5 8 10 15 20 30";
        ArvoreBinaria<String> b = new ArvoreBinaria<>();
        int result = Result.computoDeFolha(a,b);
        System.out.println(result);
    }
}