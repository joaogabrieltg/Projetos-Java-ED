package FanaticoDosFilmes;

public class Result {

    public static String visitaDoFilho(Pilha<Filme> estanteDeFilmes){
        Filme f = estanteDeFilmes.pop();
        return f.getTitulo() + "(" + f.getAno() + ")";
    }

    public static Pilha<Filme> inserirFilme(Pilha<Filme> estanteDeFilmes, Filme novoFilme){
        Pilha<Filme> maior = new Pilha<>();
        maior.push(novoFilme);
        while (!estanteDeFilmes.isEmpty()) {
            Filme f = estanteDeFilmes.pop();
            if(!maior.isEmpty() && maior.peek().getAno() > f.getAno()){
                estanteDeFilmes.push(maior.pop());
            }
                maior.push(f);
        }
        return maior;
    }
}