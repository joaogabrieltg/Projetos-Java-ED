package Template;

public class TestePilha {

    public static String converterDecimalBinario(int n) {
        String r = "";

        // calcula a sequencia binaria correspondente
        Pilha<Integer> pilha = new Pilha<Integer>();
        while (n >= 2) {
            pilha.push(n%2);
            n = n/2;
        }
        pilha.push(n);

        // formata a sequencia binaria na String
        while (! pilha.isEmpty()) {
            r += pilha.pop();
        }
        return r;
    }

    public static boolean expressaoBemFormada(String s) {
        boolean r = true;
        Pilha<String> pilha = new Pilha<String>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                pilha.push("(");
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    r = false;
                    break;
                } else {
                    pilha.pop();
                }
            }
        }
        if (! pilha.isEmpty()) {
            r = false;
        }
        return r;
    }

    public static int calcularExpressaoPosfixa(String s) {
        int r = 0;
        Pilha<Integer> pilha = new Pilha<Integer>();
        String[] termos = s.split(" ");
        for (int i = 0; i < termos.length; i++) {
            String t = termos[i];
            if (Character.isDigit(t.charAt(0))) {
                pilha.push(Integer.valueOf(t));
            } else {
                // faz operacao e empilha resultado
                int n2 = pilha.pop();
                int n1 = pilha.pop();
                pilha.push(calcular(n1, n2, t));
            }
        }
        if (pilha.size() == 1)
            r = pilha.pop();
        else
            throw new RuntimeException("Expressao mal formada!");
        return r;
    }

    private static Integer calcular(int n1, int n2, String t) {
        int r = 0;
        if (t.equals("*"))
            r = n1 * n2;
        else if (t.equals("+"))
            r = n1 + n2;
        else if (t.equals("-"))
            r = n1 - n2;
        else if (t.equals("/"))
            r = n1 / n2;
        return r;
    }

    public static void main(String[] args) {
        //		TADPilha<String> pilha = new CustomStack<String>();
        //		pilha.print();
        //		pilha.push("A");
        //		pilha.push("B");
        //		pilha.push("C");
        //		pilha.push("D");
        //		pilha.push("E");
        //		pilha.print();
        //		pilha.pop();
        //		pilha.pop();
        //		pilha.print();

        System.out.println(converterDecimalBinario(35456654));
        System.out.println(expressaoBemFormada("((A+B"));
        System.out.println(expressaoBemFormada("A+B("));
        System.out.println(expressaoBemFormada(")A+B(-C"));
        System.out.println(expressaoBemFormada("(A+B))-(-C+D"));
        System.out.println(expressaoBemFormada("((A+B)-(-C+D))"));

        String e = "4 5 * 50 + 6 5 * +";
        System.out.println(e + " = " + calcularExpressaoPosfixa(e));
    }

}