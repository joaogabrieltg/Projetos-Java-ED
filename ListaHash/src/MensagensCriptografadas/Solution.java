package MensagensCriptografadas;

public class Solution{
    public static void main(String[] args){
        String dictionary = "a-83 d-75 e-72 i-52 m-38 o-11 p-14 r-71 t-51 u-8";
        String phrase = "o rAto rOeu A roupA dO rEi de rOma";
        String result = Result.encrypt(dictionary, phrase);
        System.out.println(result);
        String acerto = "11 0 71 83 51 11 0 71 11 72 8 0 83 0 71 11 8 14 83 0 75 11 0 71 72 52 0 75 72 0 71 11 38 83";
        if(result.trim().equals(acerto.trim())){
            System.out.println("nice");
        }
    }
}
