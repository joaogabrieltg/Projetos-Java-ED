package FanaticoDosFilmes;

public class Solution {
    public static void main(String[] args){

        String v1 = "Caes de Aluguel";

        int s1 = 1992;

        String v2 = "Pulp Fiction: Tempo de Violencia";

        int s2 = 1994;

        String v3 = "Bastardos Inglorios";

        int s3 = 2009;

        String v4 = "Django Livre";

        int s4 = 2012;


        Pilha<Filme> estanteDeFilmes = new Pilha<Filme>();
        Filme filme1 = new Filme(v1,s1);
        Filme filme2 = new Filme(v2,s2);
        Filme filme3 = new Filme(v3,s3);
        Filme filme4 = new Filme(v4,s4);
        estanteDeFilmes.push(filme1);
        estanteDeFilmes = Result.inserirFilme(estanteDeFilmes, filme2);
        estanteDeFilmes = Result.inserirFilme(estanteDeFilmes, filme3);
        estanteDeFilmes = Result.inserirFilme(estanteDeFilmes, filme4);
        System.out.println(Result.visitaDoFilho(estanteDeFilmes));
    }
}