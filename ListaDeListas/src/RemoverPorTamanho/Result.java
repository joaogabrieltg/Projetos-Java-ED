package RemoverPorTamanho;

class Result {
    public void receberString(List listaDeListas, String entrada) {
        while (entrada.indexOf(';')!=-1) {
            String[] str=entrada.split(";");
            int valor = Integer.parseInt(str[0]);
            listaDeListas.inserir(valor);
            entrada = entrada.substring(entrada.indexOf(";")+1);
        }
    }
    public void removerPorTamanho(List listaDeListas) {
        int tamanho = listaDeListas.getQtd();
        if(listaDeListas.indexOf(tamanho)+1 != -1){
            while (listaDeListas.remover(tamanho)!=false) {
                listaDeListas.remover(tamanho);
            }
        }
        System.out.println(retornarString(listaDeListas));
    }
    public String retornarString(List listaDeListas) {
        return listaDeListas.toString();
    }
}
