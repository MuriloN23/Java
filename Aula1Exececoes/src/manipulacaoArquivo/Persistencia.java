package manipulacaoArquivo;


public class Persistencia {
    // Versão checada (usando throws)
    public static void lerDadosChecado(String nomeArquivo) throws ArquivoNaoEncontradoException {
        ManipulacaoArquivo.verificarArquivo(nomeArquivo);
        // Lógica para ler dados do arquivo
        System.out.println("Lendo dados do arquivo: " + nomeArquivo);
    }

    // Versão não checada (usando try-catch)
    public static void lerDadosNaoChecado(String nomeArquivo) {
        try {
            ManipulacaoArquivo.verificarArquivo(nomeArquivo);
            // Lógica para ler dados do arquivo
            System.out.println("Lendo dados do arquivo: " + nomeArquivo);
        } catch (ArquivoNaoEncontradoException e) {
            // Tratamento da exceção
            System.err.println(e.getMessage());
        }
    }
}
