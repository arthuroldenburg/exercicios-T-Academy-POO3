public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {}

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void envelhecer() {
        setIdade(getIdade() + 1);
    }

    public void engordar(double pesoGanho) {
        setPeso(getPeso() + pesoGanho);
    }

    public void emagrecer(double pesoPerdido) {
        setPeso(getPeso() - pesoPerdido);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
