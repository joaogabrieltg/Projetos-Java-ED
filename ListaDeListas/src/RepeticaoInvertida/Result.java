package RepeticaoInvertida;


public class Result {
    public static Lista<Integer> novaLista(Lista<Integer> lista){
        int a = 0;
        while (a<7) {
            for(int i = 0; i <= lista.getQtd(); i++){
                for(int j = 0; j <= lista.getQtd(); j++){
                    if(i != j && lista.consultar(i) == (lista.consultar(j))){
                        lista.remover(lista.consultar(j));
                    }
                }
            }
            a++;
        }
        int aux;
        for(int i = lista.getQtd()-1; i >= 0; i--){
            aux = lista.consultar(i);
            lista.remover(aux);
            lista.add(aux);
        }
        return lista;
    }
}