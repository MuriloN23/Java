package manipulacaoArquivo;


public class ArquivoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ArquivoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
