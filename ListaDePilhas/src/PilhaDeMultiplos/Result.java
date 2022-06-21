package PilhaDeMultiplos;

public class Result {
    public static String organizarPilhas(String valores) {
        String organizado = "";
        Pilha<Integer> multiplos = new Pilha<>();
        Pilha<Integer> naoMultiplos = new Pilha<>();
        Pilha<Integer> aux = new Pilha<>();
        int div = Integer.parseInt(valores.substring(0, valores.indexOf(";")));
        valores = valores.substring(valores.indexOf(";")+1) + " ";
        while (valores.length() > 1){
            aux.push(Integer.parseInt(valores.substring(0, valores.indexOf(" ")).trim()));
            valores = valores.substring(valores.indexOf(" ")+1);
        }
        while (!aux.isEmpty()){
            int n = aux.pop();
            if(n%div==0){
                multiplos.push(n);
            }
            else {
                naoMultiplos.push(n);
            }
        }
        organizado += multiplos.toString() + "\n";
        organizado += naoMultiplos.toString();
        return organizado;
    }
}