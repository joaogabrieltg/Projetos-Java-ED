package FilaPrioridade;

public class Solution {
    public static void main(String[] args) {

            String entrada = "-16;";
            Queue fila = new Queue();
            fila.receberString(entrada);
            Result result = new Result();
            //fila.print();
            System.out.println(result.trocas(fila));
            //note que, a funcao trocas deve retornar um Integer, porem por um bug do hackerranks eh necessario transformalo em uma String
    }
}