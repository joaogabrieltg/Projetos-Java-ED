package Balanceamento;

public class Solution{
    public static void main(String[] args){

        String entrada = "3;2;4;1;";
        Arvore a = new Arvore();
        Result r = new Result();
        r.inserir(entrada, a);
        System.out.println(r.estaBalanceada(a));
    }
}