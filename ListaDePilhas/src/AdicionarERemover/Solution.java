package AdicionarERemover;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        CustomStack stack = new CustomStack();

        while(scan.hasNextLine()) {
            String nextLine = scan.nextLine();
            if(nextLine.isEmpty()) {
                break;
            }
            Integer n = Integer.parseInt(nextLine);
            if (n < 0) {
                stack.remove();
                System.out.println("Remove: " + stack.display());
            } else {
                stack.add(n);
                System.out.println("Insert: " + stack.display());
            }
        }
    }
}