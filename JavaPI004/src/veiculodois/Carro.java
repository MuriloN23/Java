package veiculodois;

public class Carro extends Veiculo {
    int numeroPortas;

    public Carro(String modelo, String cor, int ano, int numeroPortas, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void abrirPorta() {
        System.out.println("Porta do carro aberta");
    }
}
