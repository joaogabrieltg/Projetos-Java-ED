package Template;

public class Solution{
    public static void main(String[] args) {
        Arvore<Comparable> arvore = new Arvore();
        String entrada = "8 3 6 10 14 1";
        if(entrada.charAt(entrada.length() - 1) != ' '){
            entrada += " ";
        }
        while(entrada.length() > 0){
            arvore.inserir((entrada.substring(0, entrada.indexOf(" ")).trim()));
            entrada = entrada.substring(entrada.indexOf(" ") + 1);
        }
        arvore.print();
        System.out.println("Altura da árvore: " + arvore.alturaArvore());

        Arvore<Comparable> outra = new Arvore();
        String outraE = "8 3 10 1 6 14";
        if(outraE.charAt(outraE.length() - 1) != ' '){
            outraE += " ";
        }
        while(outraE.length() > 0){
            outra.inserir((outraE.substring(0, outraE.indexOf(" ")).trim()));
            outraE = outraE.substring(outraE.indexOf(" ") + 1);
        }
        outra.print();
        System.out.println("Altura da árvore: " + outra.alturaArvore());
    }
}