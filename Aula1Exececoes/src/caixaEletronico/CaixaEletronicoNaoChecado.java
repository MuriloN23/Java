package caixaEletronico;


class ValorInvalidoRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValorInvalidoRuntimeException(String mensagem) {
        super(mensagem);
    }
}


public class CaixaEletronicoNaoChecado {
    public static void sacarNaoChecado(int valor) {
        if (valor % 10 != 0) {
            throw new ValorInvalidoRuntimeException("Valor inválido. O valor deve ser múltiplo de 10.");
        }

        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public static void main(String[] args) {

        try {
            sacarNaoChecado(35); 
        } catch (ValorInvalidoRuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
