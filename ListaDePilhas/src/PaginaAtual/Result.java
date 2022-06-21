package PaginaAtual;

public class Result {
    public static String paginaAtual(String input){
        input = input + " ";
        Stack<String> stack = new Stack<>();
        Stack<String> comandos = new Stack<>();
        Stack<String> aux = new Stack<>();
        while (input.length() > 0){
            stack.push(input.substring(0, input.indexOf(" ")).trim());
            input = input.substring(input.indexOf(" ")+1);
        }
        while(!stack.isEmpty()){
            aux.push(stack.pop());
        }
        stack.print();
        aux.print();
        comandos.print();
        while(!aux.isEmpty()) {
            String s = aux.pop().trim();
            if(!s.equals("voltar") && !s.equals("avancar")){
                stack.push(s);
            }
            else if(s.equals("voltar")&&!stack.isEmpty()){
                comandos.push(stack.pop());
            }
            else if(s.equals("avancar")){
                if(!comandos.isEmpty()){
                    stack.push(comandos.pop());
                }
            }
        }
        return stack.peek();
    }
}