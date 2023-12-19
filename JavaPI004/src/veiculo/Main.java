package veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Veiculo Genérico", "Preto", 2022);
        Carro carro = new Carro("Civic", "Prata", 2021, 4);
        Moto moto = new Moto("CBR", "Vermelha", 2023, true);

        System.out.println("### Veículo Genérico ###");
        veiculo.ligar();
        veiculo.acelerar();
        veiculo.parar();

        System.out.println("\n### Carro ###");
        carro.ligar();
        carro.acelerar();
        carro.parar();
        carro.abrirPorta();

        System.out.println("\n### Moto ###");
        moto.ligar();
        moto.acelerar();
        moto.parar();
        moto.empinar();
    }
}
