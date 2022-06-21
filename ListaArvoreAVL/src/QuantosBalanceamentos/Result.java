package QuantosBalanceamentos;

public class Result{
    static AvlTree tree = new AvlTree();

    public static Integer balanceamentos(String values){
        if(values.charAt(values.length() - 1) != ' '){
            values += " ";
        }
        while(values.length() > 0){
            tree.inserir(Integer.parseInt(values.substring(0, values.indexOf(" ")).trim()));
            values = values.substring(values.indexOf(" ") + 1);
        }
        return tree.getCount();
    }
}