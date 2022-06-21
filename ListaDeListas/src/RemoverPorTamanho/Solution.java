package RemoverPorTamanho;

public class Solution {
    public static void main(String[] args){

        String entrada = "3;1;3;";
        List<String> lista = new List<>();
        Result result = new Result();
        result.receberString(lista, entrada);
        result.removerPorTamanho(lista);
    }
}