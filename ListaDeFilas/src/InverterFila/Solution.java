package InverterFila;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 1;//scanner.nextInt();

        int b = 2;//scanner.nextInt();

        int c = 3;//scanner.nextInt();

        int d = 4;//scanner.nextInt();

        int e = 5;//scanner.nextInt();

        int f = 6;//scanner.nextInt();

        int n = 10;//scanner.nextInt();

        Fila<Integer> oFilas = new Fila<>();
        oFilas.enqueue(a);
        oFilas.enqueue(b);
        oFilas.enqueue(c);
        oFilas.enqueue(d);
        oFilas.enqueue(e);
        oFilas.enqueue(f);

        oFilas.inverterFila(n);
        oFilas.print();

    }
}