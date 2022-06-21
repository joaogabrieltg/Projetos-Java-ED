package Balanceamento;

public class Result{
    public static void inserir(String numeros, Arvore ar){
        if(numeros.charAt(numeros.length() - 1) != ';'){
            numeros += ";";
        }
        while(numeros.length() > 0){
            ar.inserir(Integer.parseInt(numeros.substring(0, numeros.indexOf(";")).trim()));
            numeros = numeros.substring(numeros.indexOf(";") + 1);
        }
    }

    public static boolean estaBalanceada(Arvore ar){
        return ar.estaBalanceada();
    }
}