package ParEImpar;

public class Result {
        public static void receberString(String entrada, Pilha pilhaOriginal){
                if(entrada.charAt(entrada.length()-1)!=';'){
                        entrada+=";";
                }
                String s = entrada.substring(0, entrada.indexOf(";"));
                pilhaOriginal.push(Integer.valueOf(s));
                if(entrada.substring(entrada.indexOf(";")+1).contains(";")){
                        receberString(entrada.substring(entrada.indexOf(";")+1), pilhaOriginal);
                }
        }
        public static String retornarPares(Pilha pilhaOriginal, Pilha pilhaPares){
                Pilha<Integer> aux = new Pilha<>();
                while (!pilhaOriginal.isEmpty()){
                        Object i = pilhaOriginal.pop();
                        aux.push((Integer)i);
                }
                while (!aux.isEmpty()) {
                        int n = aux.pop();
                        if(n % 2 == 0){
                                pilhaPares.push(n);
                        }
                        pilhaOriginal.push(n);
                }
                return pilhaPares.toString()+"\n";
        }
        public static String retornarImpares(Pilha pilhaOriginal, Pilha pilhaImpares){
                Pilha<Integer> aux = new Pilha<>();
                while (!pilhaOriginal.isEmpty()){
                        Object i = pilhaOriginal.pop();
                        aux.push((Integer)i);
                }
                while (!aux.isEmpty()) {
                        int n = aux.pop();
                        if(n % 2 != 0){
                                pilhaImpares.push(n);
                        }
                        pilhaOriginal.push(n);
                }
                return pilhaImpares.toString()+"\n";
        }
        public static String stringPilhaOriginal(Pilha pilhaOriginal){
                Pilha pilha = new Pilha();
                Pilha aux = new Pilha();
                while (!pilhaOriginal.isEmpty()){
                        Object i = pilhaOriginal.pop();
                        pilha.push(i);
                        aux.push(i);
                }
                while (!aux.isEmpty()){
                        pilhaOriginal.push(aux.pop());
                }
                return pilha.toString()+"\n";
        }
}