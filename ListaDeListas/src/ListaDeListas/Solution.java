package ListaDeListas;

public class Solution {
    public static void main(String[] args){
        String entrada = "000000000000a000000000000b0000000000a000000000000000000000000b00";
        List lista = new List();
        lista.receberString(entrada);
        Result result = new Result();
        result.printMatriz(lista);
    }
}