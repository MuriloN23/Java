package caixaEletronico;

import java.util.Scanner;


class ValorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}


public class CaixaEletronico {
    public static void sacarChecado(int valor) throws ValorInvalidoException {
        if (valor % 10 != 0) {
            throw new ValorInvalidoException("Valor inválido. O valor deve ser múltiplo de 10.");
        }

        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public static void main(String[] args) {

        int valorSaque = obterValorSaqueDoUsuario();


        try {
            sacarChecado(valorSaque);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static int obterValorSaqueDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        int valorSaque = 0;
        boolean entradaValida = false;

        do {
            try {
 
                System.out.print("Digite o valor do saque (múltiplo de 10): ");
                valorSaque = scanner.nextInt();
                entradaValida = true;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Entrada inválida. Digite um valor numérico.");
                scanner.nextLine(); 
            }
        } while (!entradaValida);
    	scanner.close();
        return valorSaque;
    }
}
