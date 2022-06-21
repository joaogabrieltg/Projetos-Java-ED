package FolhaBinaria;

public class Result{
    public static int computoDeFolha(String a, ArvoreBinaria<String> arvore){
        if(a.charAt(a.length() - 1) != ' '){
            a += " ";
        }
        while(a.length() > 0){
            arvore.inserir(a.substring(0, a.indexOf(" ")).trim());
            a = a.substring(a.indexOf(" ") + 1);
        }
        return arvore.folha(arvore.getRaiz());
    }
}