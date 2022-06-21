package AdicionarERemover;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        CustomQueue queue = new CustomQueue();

        while(scan.hasNextLine()) {
            String nextLine = scan.nextLine();

            if(nextLine.isEmpty()) {
                break;
            }

            Integer n = Integer.parseInt(nextLine);

            if (n < 0) {
                queue.remove();
                System.out.print("Remove: " + queue.display());
                if(queue.size() == 0){
                    System.out.println("Empty");
                }
                else {
                    System.out.println("");
                }
            } else {
                queue.add(n);
                System.out.println("Insert: " + queue.display());
            }
        }
    }
}