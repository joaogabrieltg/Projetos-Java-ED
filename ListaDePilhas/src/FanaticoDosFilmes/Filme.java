package FanaticoDosFilmes;

public class Filme {

    String titulo;
    int ano;
    public Filme(String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAno(){
        return ano;
    }

}
