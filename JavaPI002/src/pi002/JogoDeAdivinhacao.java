package pi002;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                System.out.println("Muito baixo. Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
