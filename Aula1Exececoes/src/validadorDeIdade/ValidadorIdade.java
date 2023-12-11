package validadorDeIdade;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


class IdadeInvalidaException extends Exception {
	private static final long serialVersionUID = 1L;

	public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}


class IdadeInvalidaRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IdadeInvalidaRuntimeException(String mensagem) {
        super(mensagem);
    }
}


public class ValidadorIdade {
    public static void validarIdadeChecada(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

    public static void main(String[] args) {

        LocalDate dataNascimento = obterDataNascimentoDoUsuario();


        int idade = calcularIdade(dataNascimento);

        try {

            validarIdadeChecada(idade);
            System.out.println("Idade válida: " + idade + " anos");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static LocalDate obterDataNascimentoDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        LocalDate dataNascimento = null;
        boolean entradaValida = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            try {

                System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
                String entradaUsuario = scanner.nextLine();
                dataNascimento = LocalDate.parse(entradaUsuario, formatter);
                entradaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data inválido. Tente novamente.");
            }
        } while (!entradaValida);
    	scanner.close();
        return dataNascimento;
    }
}
