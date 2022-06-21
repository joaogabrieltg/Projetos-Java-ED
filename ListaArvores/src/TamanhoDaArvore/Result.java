package TamanhoDaArvore;

public class Result{
    public static void receberString(String entrada, Arvore arvore){
        if(!entrada.isEmpty() && !entrada.matches("[a-zA-Z]+")){
            if(entrada.charAt(entrada.length() - 1) != ';'){
                entrada += ";";
            }
            while(entrada.length() > 0){
                arvore.inserir(Integer.valueOf(entrada.substring(0, entrada.indexOf(";")).trim()));
                entrada = entrada.substring(entrada.indexOf(";") + 1);
            }
        }
    }

    public static int retornarAltura(Arvore arvore){
        return arvore.alturaArvore();
    }

    public static String retornarNumerosOrdenados(Arvore arvore){
        return arvore.percursoEmOrdem();
    }
}