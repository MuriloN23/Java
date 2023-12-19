package veiculodois;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem(true);

        Veiculo veiculo = new Veiculo("Veiculo Genérico", "Preto", 2022, false);
        Carro carro = new Carro("Civic", "Prata", 2021, 4, false);
        Moto moto = new Moto("CBR", "Vermelha", 2023, true, true);

        System.out.println("### Veículo Genérico ###");
        veiculo.estacionar(garagem);

        System.out.println("\n### Carro ###");
        carro.estacionar(garagem);
        carro.abrirPorta();

        System.out.println("\n### Moto ###");
        moto.estacionar(garagem);
        moto.empinar();
    }
}
