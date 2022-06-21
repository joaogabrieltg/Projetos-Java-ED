package ArvoresIguais;

public class Result{
    static boolean areIdenticalTrees(String arr1, String arr2){
        Tree tree = new Tree();
        Tree outra = new Tree();
        boolean letra1 = true;
        boolean letra2 = true;
        arr1 = arr1.trim() + " ";
        arr2 = arr2.trim() + " ";
        if(arr1.equals(arr2)){
            return true;
        }
        if(arr1.trim().isEmpty() || arr2.trim().isEmpty()){
            return false;
        }
        for(int i = 0; i < arr1.length(); i++){
            if((arr1.charAt(i) >= 65 && arr1.charAt(i) <= 90)||(arr1.charAt(i) >= 97 && arr1.charAt(i) <= 122)){
                letra1 = false;
            }
        }
        for(int i = 0; i < arr2.length(); i++){
            if((arr2.charAt(i) >= 65 && arr2.charAt(i) <= 90)||(arr2.charAt(i) >= 97 && arr2.charAt(i) <= 122)){
                letra2 = false;
            }
        }
        if(letra1){
            while(arr1.length() > 0){
                tree.inserir(Integer.parseInt(arr1.substring(0, arr1.indexOf(" ")).trim()));
                arr1 = arr1.substring(arr1.indexOf(" ") + 1);
            }
        }
        else{
            while(arr1.length() > 0){
                tree.inserir(arr1.substring(0, arr1.indexOf(" ")).trim());
                arr1 = arr1.substring(arr1.indexOf(" ") + 1);
            }
        }
        if(letra2){
            while(arr2.length() > 0){
                outra.inserir(Integer.parseInt(arr2.substring(0, arr2.indexOf(" ")).trim()));
                arr2 = arr2.substring(arr2.indexOf(" ") + 1);
            }
        }
        else{
            while(arr2.length() > 0){
                outra.inserir(arr2.substring(0, arr2.indexOf(" ")).trim());
                arr2 = arr2.substring(arr2.indexOf(" ") + 1);
            }
        }
        return tree.percurso().trim().equals(outra.percurso().trim());
    }
}


//    class Result{
//        static boolean areIdenticalTrees(String arr1, String arr2){
//            Tree tree = new Tree();
//            Tree outra = new Tree();
//            arr1 = arr1.trim();
//            arr2=arr2.trim();
//            arr1 += " ";
//            arr2 += " ";
//            while(arr1.length() > 0){
//                tree.add(arr1.substring(0, arr1.indexOf(" ")).trim());
//                arr1 = arr1.substring(arr1.indexOf(" ") + 1);
//            }
//            while(arr2.length() > 0){
//                outra.add(arr2.substring(0, arr2.indexOf(" ")).trim());
//                arr2 = arr2.substring(arr2.indexOf(" ") + 1);
//            }
//            return tree.percurso().trim().equalsIgnoreCase(outra.percurso().trim());
//        }
//    }
//
//    class Result{
//        static boolean areIdenticalTrees(String arr1, String arr2){
//            Tree tree = new Tree();
//            Tree outra = new Tree();
//            if(arr1.charAt(arr1.length() - 1) != ' '){
//                arr1 += " ";
//            }
//            if(arr2.charAt(arr2.length() - 1) != ' '){
//                arr2 += " ";
//            }
//            while(arr1.length() > 0){
//                tree.add(arr1.substring(0, arr1.indexOf(" ")).trim());
//                arr1 = arr1.substring(arr1.indexOf(" ") + 1);
//            }
//            while(arr2.length() > 0){
//                outra.add(arr2.substring(0, arr2.indexOf(" ")).trim());
//                arr2 = arr2.substring(arr2.indexOf(" ") + 1);
//            }
//            return tree.percurso().trim().equals(outra.percurso().trim());
//        }
//    }
//
//    class Result{
//        static boolean areIdenticalTrees(String arr1, String arr2){
//            arr1 = arr1.trim();
//            arr2 = arr2.trim();
//            arr1 += " ";
//            arr2 += " ";
//            boolean apenasNum1 = false;
//            boolean apenasNum2 = false;
//            for (int i = 0; i < arr1.length(); i++) {
//                if ((arr1.charAt(i) >= '0' && arr1.charAt(i) <= '9')||arr1.charAt(i) == ' '){
//                    apenasNum1 = true;
//                }
//                if ((arr2.charAt(i) >= '0' && arr2.charAt(i) <= '9')||arr2.charAt(i) == ' '){
//                    apenasNum2 = true;
//                }
//            }
//            if(!apenasNum1 && !apenasNum2){
//                Tree<Integer> tree = new Tree();
//                Tree<Integer> outra = new Tree();
//                while(arr1.length() > 0){
//                    tree.add(Integer.parseInt(arr1.substring(0, arr1.indexOf(" ")).trim()));
//                    arr1 = arr1.substring(arr1.indexOf(" ") + 1);
//                }
//                while(arr2.length() > 0){
//                    outra.add(Integer.parseInt(arr2.substring(0, arr2.indexOf(" ")).trim()));
//                    arr2 = arr2.substring(arr2.indexOf(" ") + 1);
//                }
//                return tree.percurso().trim().equalsIgnoreCase(outra.percurso().trim());
//            }
//            else{
//                Tree<String> tree = new Tree();
//                Tree<String> outra = new Tree();
//                while(arr1.length() > 0){
//                    tree.add(arr1.substring(0, arr1.indexOf(" ")).trim());
//                    arr1 = arr1.substring(arr1.indexOf(" ") + 1);
//                }
//                while(arr2.length() > 0){
//                    outra.add(arr2.substring(0, arr2.indexOf(" ")).trim());
//                    arr2 = arr2.substring(arr2.indexOf(" ") + 1);
//                }
//                return tree.percurso().trim().equalsIgnoreCase(outra.percurso().trim());
//            }
//        }
//    }
//
//    class Result{
//        static boolean areIdenticalTrees(String arr1, String arr2){
//            Tree<Comparable> tree = new Tree();
//            Tree<Comparable> outra = new Tree();
//            arr1 = arr1.trim();
//            arr2=arr2.trim();
//            arr1 += " ";
//            arr2 += " ";
//            while(arr1.length() > 0){
//                tree.add(arr1.substring(0, arr1.indexOf(" ")).trim());
//                arr1 = arr1.substring(arr1.indexOf(" ") + 1);
//            }
//            while(arr2.length() > 0){
//                outra.add(arr2.substring(0, arr2.indexOf(" ")).trim());
//                arr2 = arr2.substring(arr2.indexOf(" ") + 1);
//            }
//            return tree.percurso().trim().equalsIgnoreCase(outra.percurso().trim());
//        }
//    }