import java.util.ArrayList;

public class Celular {
    private String marca;
    private String modelo;
    private int armazenamento;
    private ArrayList<String> aplicativosInstalados = new ArrayList<>();

    public Celular(){}

    public Celular(int armazenamento, String modelo, String marca) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Armazenamento: " + getArmazenamento());
    }

    public void instalarAplicativo(String aplicativo) {
        setAplicativosInstalados(aplicativo);
        System.out.println("Aplicativo instalado com sucesso!");
    }

    public void getAplicativosInstalados() {
        for (String aplicativo : aplicativosInstalados) {
            System.out.println(aplicativo);
        }
    }

    private void setAplicativosInstalados(String aplicativo) {
        aplicativosInstalados.add(aplicativo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
