package Lanchonete;

public class Solution {
    public static void main(String[] args) {
        int a = 0;

        int b = 1;

        int c = 1;

        int d = 1;

        int e = 1;

        int f = 0;

        int g = 1;

        int h = 1;

        int i = 1;

        int j = 1;

        Fila<Integer> estudantes = new Fila<>();

        Fila<Integer> sanduiches = new Fila<>();

        estudantes.enqueue(a);
        estudantes.enqueue(b);
        estudantes.enqueue(c);
        estudantes.enqueue(d);
        estudantes.enqueue(e);

        sanduiches.enqueue(f);
        sanduiches.enqueue(g);
        sanduiches.enqueue(h);
        sanduiches.enqueue(i);
        sanduiches.enqueue(j);

        int resultado = Result.contarEstudantes(estudantes, sanduiches);

        System.out.println(resultado);

    }
}