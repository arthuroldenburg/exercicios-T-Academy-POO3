public class Casa {
    private String endereco;
    private int quantidadeDeQuartos;
    private double area;
    private double valor;

    public Casa(){}

    public Casa(String endereco, int quantidadeDeQuartos, double area, double valor) {
        this.endereco = endereco;
        this.quantidadeDeQuartos = quantidadeDeQuartos;
        this.area = area;
        this.valor = valor;
    }

    public void exibirDetalhes() {
        System.out.println("A casa fica no endereco: " + getEndereco());
        System.out.println("Tem " + getQuantidadeDeQuartos() + "quartos");
        System.out.println("Tem uma area de " + getArea() + "m²");
        System.out.println("E custa R$" + getValor() + " sem impostos");
    }

    public void calcularValorImposto() {
        double valor = getValor() * 0.1;
        System.out.println("O Valor de imposto fica: R$" + valor);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeDeQuartos() {
        return quantidadeDeQuartos;
    }

    public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
