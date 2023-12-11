package manipulacaoArquivo;


public class Main {
    public static void main(String[] args) {
        String nomeArquivoExistente = "arquivo_existente.txt";
        String nomeArquivoNaoExistente = "arquivo_nao_existente.txt";

        try {
            Persistencia.lerDadosChecado(nomeArquivoExistente);
            Persistencia.lerDadosChecado(nomeArquivoNaoExistente);
        } catch (ArquivoNaoEncontradoException e) {
            System.err.println(e.getMessage());
        }

        Persistencia.lerDadosNaoChecado(nomeArquivoExistente);
        Persistencia.lerDadosNaoChecado(nomeArquivoNaoExistente);
    }
}
