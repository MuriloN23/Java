package validadorDeIdade;

import java.time.LocalDate;
import java.time.Period;


class IdadeInvalidaRuntimeExceptiondois extends RuntimeException {
 
	private static final long serialVersionUID = 1L;

	public IdadeInvalidaRuntimeExceptiondois(String mensagem) {
        super(mensagem);
    }
}


public class ValidadorIdadeNaoChecada {
    public static void validarIdadeNaoChecada(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaRuntimeExceptiondois("Idade inválida: " + idade);
        }
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1992, 12, 3);
        int idade = calcularIdade(dataNascimento);

        try {
            validarIdadeNaoChecada(idade);
            System.out.println("Idade válida: " + idade + " anos");
        } catch (IdadeInvalidaRuntimeExceptiondois e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
