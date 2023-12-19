package veiculodois;

public class Moto extends Veiculo {
    boolean possuiBau;

    public Moto(String modelo, String cor, int ano, boolean possuiBau, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
        this.possuiBau = possuiBau;
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    public void empinar() {
        System.out.println("Moto empinando");
    }
}
