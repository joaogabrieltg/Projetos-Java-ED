package TamanhoDaArvore;

public class Solution{
    public static void main(String[] args){
        Arvore<Integer> arvore = new Arvore<>();
        Result result = new Result();
        String entrada = "a";
        result.receberString(entrada, arvore);
        int altura = result.retornarAltura(arvore);
        String numeros = result.retornarNumerosOrdenados(arvore);
        System.out.println(String.valueOf(altura));
        System.out.println(numeros);
    }
}