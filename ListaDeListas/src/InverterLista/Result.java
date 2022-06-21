package InverterLista;


class Result{
    public static String reverseList(String componentes, int posicao) {
        if(posicao<=0){
            posicao = 0;
        }
        String s = "";
        List lista = new List();
            String[] str = componentes.split(" ");
            for (String sLista : str){
                lista.inserir(sLista);
            }
        Object retirar;
        for(int i = lista.getQtd()-2; i >= posicao; i--){
         retirar = lista.consultar(i);
         lista.remover(retirar);
         lista.inserir(retirar);
        }
        s = lista.toString().substring(0,lista.toString().length()-2);
        return "["+s+"]";
    }
}