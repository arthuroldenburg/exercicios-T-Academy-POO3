public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto() {}

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    private void atualizarEstoque(int quantidade) {
        setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
    }

    public void exibirDetalhes() {
        System.out.println("Nome do Produto" + getNome());
        System.out.println("Preco do Produto" + getPreco());
    }

    public String comprar(int quantidade) {
        if (quantidade <= 0) {
            return "Nao tem mais do produto em estoque";
        } else {
            atualizarEstoque(quantidade);
            double total = preco * quantidade;
            return "O valor total da compra ficou: " + total;
        }
    }

    public String adicionarAoEstoque(int quantidade) {
        setQuantidadeEmEstoque(getQuantidadeEmEstoque() + quantidade);
        return "Agora tem em estoque: " + getQuantidadeEmEstoque();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
