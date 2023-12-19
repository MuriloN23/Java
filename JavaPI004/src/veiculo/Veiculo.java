package veiculo;

public class Veiculo {
    String modelo;
    String cor;
    int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
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
}
