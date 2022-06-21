package InverterArvore;

public class Solution{
    public static void main(String[] args){

        ArvoreBinaria<Integer> a = new ArvoreBinaria<>();
        String s = "7 5 4 3 6 10 8 9 12 13";
        String[] ar = s.split(" ");

        for(String s1: ar) {
            a.add(Integer.parseInt(s1));
        }
        a.inverterArvore();
        a.percursoEmOrdem();
    }
}