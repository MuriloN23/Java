package heranca;

public class Exercicio2 {
    private int codigo;
    private String nome;
    private double orcamento;
    private Engenheiro engenheiroResponsavel;


    public Exercicio2(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }


    public Exercicio2(int codigo, String nome, double orcamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.orcamento = orcamento;
    }


    public Exercicio2(int codigo, String nome, double orcamento, Engenheiro engenheiroResponsavel) {
        this.codigo = codigo;
        this.nome = nome;
        this.orcamento = orcamento;
        this.engenheiroResponsavel = engenheiroResponsavel;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public Engenheiro getEngenheiroResponsavel() {
        return engenheiroResponsavel;
    }

    public static void main(String[] args) {

        Exercicio2 projeto1 = new Exercicio2(1, "Projeto A");
        Exercicio2 projeto2 = new Exercicio2(2, "Projeto B", 500000.0);
        
        Engenheiro engenheiro = new Engenheiro("123ABC", "Murilo");
        Exercicio2 projeto3 = new Exercicio2(3, "Projeto C", 100000.0, engenheiro);


        System.out.println("Projeto 1: " + projeto1.getNome());
        System.out.println("Projeto 2: " + projeto2.getNome() + ", Orçamento: " + projeto2.getOrcamento());
        System.out.println("Projeto 3: " + projeto3.getNome() + ", Orçamento: " + projeto3.getOrcamento() +
                ", Engenheiro: " + projeto3.getEngenheiroResponsavel().getNome());
    }
}

class Engenheiro {
    private String crea;
    private String nome;

    public Engenheiro(String crea, String nome) {
        this.crea = crea;
        this.nome = nome;
    }

    public String getCrea() {
        return crea;
    }

    public String getNome() {
        return nome;
    }
}
