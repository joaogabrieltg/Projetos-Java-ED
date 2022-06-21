package MensagensCriptografadas;

class Result{
    public static String encrypt(String dictionary, String phrase){

        TabelaHashFechado hashtable = new TabelaHashFechado(dictionary.length());

        if(dictionary.charAt(dictionary.length() - 1) != ' '){
            dictionary += " ";
        }
        hashtable.inserir(" -0");
        while(dictionary.length() > 0){
            hashtable.inserir(dictionary.substring(0, dictionary.indexOf(" ")).trim());
            dictionary = dictionary.substring(dictionary.indexOf(" ") + 1);
        }
        phrase = phrase.toLowerCase();
        dictionary = "";
        for(int i = 0; i < phrase.length(); i++){
            while(true){
                String a = hashtable.consultar(hashtable.IndexOf(Character.toString(phrase.charAt(i))));
                String aux[] = a.split("-");
                if(aux[0].equals(Character.toString(phrase.charAt(i)))){
                    dictionary += aux[1] + " ";
                    break;
                }
            }
        }
        return dictionary;
    }
}