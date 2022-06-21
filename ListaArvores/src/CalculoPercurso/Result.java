package CalculoPercurso;

public class Result{
    public static String calculos(String N){
        Arvore<Double> arvore = new Arvore<>();
        if(!N.isEmpty() && !N.matches("[a-zA-Z]+")){
            if(N.charAt(N.length() - 1) != ' '){
                N += " ";
            }
            while(N.length() > 0){
                arvore.inserir((double) Integer.parseInt(N.substring(0, N.indexOf(" ")).trim()));
                N = N.substring(N.indexOf(" ") + 1);
            }
        }
        return arvore.percursos();
    }
}