package Lanchonete;

public class Result {

    public static int contarEstudantes(Fila<Integer> estudantes, Fila<Integer> sanduiches){
        int naodeu;
        int repetiu = 0;
        int S;
        int E;
        while(sanduiches.size()!=0){
            E = estudantes.size();
            S = sanduiches.size();
            if(estudantes.consultarInicio() != sanduiches.consultarInicio()){
                int a = estudantes.consultarInicio();
                estudantes.dequeue();
                estudantes.enqueue(a);
            }
            else{
                estudantes.dequeue();
                sanduiches.dequeue();
            }
            if(E == estudantes.size() || S == sanduiches.size()){
                repetiu++;
                if(repetiu>=5){
                    break;
                }
            }
            else {
                repetiu = 0;
            }
        }
        naodeu = sanduiches.size();
        return naodeu;
    }
}