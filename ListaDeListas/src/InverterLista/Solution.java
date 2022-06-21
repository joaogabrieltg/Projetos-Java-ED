package InverterLista;

import ListaDeListas.List;

public class Solution {
    public static void main(String[] args){
        List lista = new List();

        String componentes = "1 2 3 4 5 6 7 8 9";
        int n = 0;

        String result = Result.reverseList(componentes, n);
        System.out.println(result);
    }
}