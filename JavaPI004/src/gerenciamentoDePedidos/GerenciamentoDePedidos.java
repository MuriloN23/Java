package gerenciamentoDePedidos;

import java.util.ArrayList;

class ItemPedido {
    String descricao;
    double preco;

    public ItemPedido(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
}

public class GerenciamentoDePedidos {
    int numeroPedido;
    String cpfCliente;
    ArrayList<ItemPedido> itens = new ArrayList<>();

    public GerenciamentoDePedidos(int numeroPedido, String cpfCliente) {
        this.numeroPedido = numeroPedido;
        this.cpfCliente = cpfCliente;
    }

    public void adicionarItem(String descricao, double preco) {
        itens.add(new ItemPedido(descricao, preco));
    }

    public void adicionarItem(ArrayList<ItemPedido> listaDeItens) {
        itens.addAll(listaDeItens);
    }

    public double calcularTotal(double percentualDesconto) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }
        return total - (total * percentualDesconto / 100);
    }

    public double calcularTotal(int numeroPrestacoes, double juros) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }
        return total + (total * juros / 100 * numeroPrestacoes);
    }

    public void exibirInformacoes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("CPF do Cliente: " + cpfCliente);
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println("- " + item.descricao + ": R$" + item.preco);
        }
    }

    public static void main(String[] args) {
        GerenciamentoDePedidos pedidoDesconto = new GerenciamentoDePedidos(1, "123.456.789-01");
        pedidoDesconto.adicionarItem("Produto A", 50.0);
        pedidoDesconto.adicionarItem("Produto B", 30.0);

        double desconto = 10.0; // 10% de desconto à vista
        double totalComDesconto = pedidoDesconto.calcularTotal(desconto);

        System.out.println("Pedido com desconto à vista:");
        pedidoDesconto.exibirInformacoes();
        System.out.println("Total com desconto: R$" + totalComDesconto);

        GerenciamentoDePedidos pedidoPrazo = new GerenciamentoDePedidos(2, "987.654.321-00");
        pedidoPrazo.adicionarItem("Produto C", 70.0);
        pedidoPrazo.adicionarItem("Produto D", 40.0);

        int prestacoes = 3;
        double juros = 5.0; // 5% de juros a prazo
        double totalAPrazo = pedidoPrazo.calcularTotal(prestacoes, juros);

        System.out.println("\nPedido a prazo:");
        pedidoPrazo.exibirInformacoes();
        System.out.println("Total a prazo: R$" + totalAPrazo);
    }
}
