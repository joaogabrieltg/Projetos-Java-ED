package FilaPrioridade;

public class Result {
    public String trocas(Queue fila){
        int trocas = 0;
        Queue<Integer> f1 = new Queue<>();
        Queue<Integer> f2 = new Queue<>();
        for(int i = 0; i < fila.size(); i++){
            int x = (int) fila.dequeue();
            fila.enqueue(x);
            f1.enqueue(x);
            f2.enqueue(x);
        }
        f2.dequeue();
        while(f2.size()>0){
            f1.print();
            f2.print();
            if(Integer.valueOf(f1.consultarInicio()) >= Integer.valueOf(f2.consultarInicio())){
                f1.dequeue();
                f2.dequeue();
            }
            else{
                int x = f2.dequeue();
                f1.enqueue(x);
                f2.enqueue(x);
                x = f1.dequeue();
                f2.enqueue(x);
                f1.enqueue(x);
                f1.dequeue();
                f2.dequeue();
                for(int i = 0; i < f1.size(); i++){
                    if(i<f1.size()-1){
                        f2.dequeue();
                    }
                    x = f1.dequeue();
                    f1.enqueue(x);
                    f2.enqueue(x);
                }
                for(int i = 0; i < f1.size()-2; i++){
                    x = f1.dequeue();
                    f1.enqueue(x);
                }
                for(int i = 0; i < f2.size()-2; i++){
                    x = f2.dequeue();
                    f2.enqueue(x);
                }
                f2.dequeue();
                trocas++;
            }
        }
        return Integer.toString(trocas);
    }
}
