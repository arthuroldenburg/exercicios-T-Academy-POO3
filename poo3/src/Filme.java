import java.util.ArrayList;

public class Filme {
    private String titulo;
    private String autor;
    private int anoDeLancamento;
    private String genero;
    private double duracao;
    private ArrayList<Filme> filmes;

    public Filme(){}

    public Filme(String titulo, String autor, int anoDeLancamento, String genero, double duracao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
        this.duracao = duracao;
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(String titulo, String autor, int anoDeLancamento, String genero, double duracao) {
        filmes.add(new Filme(titulo, autor, anoDeLancamento, genero, duracao));
    }

    public void mostrarDetalhes() {
        System.out.println("Nome do Filme: " + getTitulo());
        System.out.println("Nome do Autor: " + getAutor());
        System.out.println("Ano de Lancamento: " + getAnoDeLancamento());
        System.out.println("Genero do filme: " + getGenero());
        System.out.println("Duracao do filme: " + getDuracao());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
