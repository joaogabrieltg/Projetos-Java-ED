package CalcBinario;

public class Result {
    public static Queue<String> binaryNumbers(int n){
        Queue<String> fila = new Queue<>();
        String binario = "";
        int j = 1;
        int i;
        while (j<=n) {
            i=j;
            while (i > 0) {
                binario = i % 2 + binario;

                if(i % 2 == 0){
                    i = i / 2;
                }
                else{
                    i = ((i - 1) / 2);
                }
            }
            fila.enqueue(binario);
            binario = "";
            j++;
        }
        return fila;
    }
}