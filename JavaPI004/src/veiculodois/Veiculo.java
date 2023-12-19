package veiculodois;

public class Veiculo {
    String modelo;
    String cor;
    int ano;
    boolean eletrico;

    public Veiculo(String modelo, String cor, int ano, boolean eletrico) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.eletrico = eletrico;
    }

    public void acelerar() {
        System.out.println("Veículo acelerando");
    }

    public void ligar() {
        System.out.println("Veículo ligado");
    }

    public void parar() {
        System.out.println("Veículo parado");
    }

    public void estacionar(Garagem garagem) {
        garagem.adicionarVeiculo(this);
        System.out.println("Veículo estacionado!");
        if (garagem.temTomada() && eletrico) {
            System.out.println("Veículo carregando");
        }
    }
}
