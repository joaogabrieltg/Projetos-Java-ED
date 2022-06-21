package Template;

public class Solution{
    public static void main(String[] args) {

        ArvoreAVL arvore = new ArvoreAVL();

        /* Constructing tree given in the above figure */
        arvore.inserir( 1);
        arvore.inserir( 2);
        arvore.inserir( 3);
        arvore.inserir( 4);
        arvore.inserir( 5);
        arvore.inserir( 6);


/*
        The constructed AVL Tree would be
                  30
                 /  \
               20   40
              /  \     \
             10  25    50
*/
        arvore.print();
        System.out.println(arvore.isAVL());
        arvore.balancear();
        arvore.print();
        System.out.println(arvore.isAVL());
        System.out.println(arvore.getCount());
    }
}