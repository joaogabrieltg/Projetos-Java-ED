package ParEImpar;

public class Solution {
    public static void main(String[] args){

        String expressao = "1;2;3;4;5;6;";
        // 2;4;6;
        // 1;3;5;
        // 6;5;4;3;2;1;

        Pilha pilhaOriginal = new Pilha();
        Pilha pilhaPares = new Pilha();
        Pilha pilhaImpares = new Pilha();
        Result result = new Result();

        result.receberString(expressao, pilhaOriginal);
        String resultadoPar = result.retornarPares(pilhaOriginal, pilhaPares);
        String resultadoImpar = result.retornarImpares(pilhaOriginal, pilhaImpares);
        String resultadoInvertido = result.stringPilhaOriginal(pilhaOriginal);

        System.out.println(resultadoPar);
        System.out.println(resultadoImpar);
        System.out.println(resultadoInvertido);

    }
}