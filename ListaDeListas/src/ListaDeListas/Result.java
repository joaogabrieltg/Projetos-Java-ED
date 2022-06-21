package ListaDeListas;

public class Result{
    public String printMatriz(List listaDeListas){
        List linhas = new List();
        String s = listaDeListas.toString();
        String saida = "";
        if(s.length() >= 64){
            s = s.substring(0, 64);
        }
        for(int i = 0; i < 8; i++){
            List colunas = new List();
            linhas.receberString(colunas);
            for(int j = 8*i; j < 8*(i+1); j++){
                colunas.receberString(s.charAt(j));
            }
            saida += colunas +"\n";
        }
        System.out.println(saida);
        return saida;
    }
}
