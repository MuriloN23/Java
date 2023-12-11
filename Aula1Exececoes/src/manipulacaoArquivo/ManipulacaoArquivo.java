package manipulacaoArquivo;

import java.io.File;


public class ManipulacaoArquivo {
    public static void verificarArquivo(String nomeArquivo) throws ArquivoNaoEncontradoException {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            throw new ArquivoNaoEncontradoException("Arquivo não encontrado: " + nomeArquivo);
        }
    }
}
