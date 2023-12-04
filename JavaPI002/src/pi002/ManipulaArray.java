package pi002;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
    public static void main(String[] args) {

        int[] arrayLido = lerArrayDoUsuario();
        System.out.println("Array lido do usuário:");
        imprimirArray(arrayLido);
        System.out.println("Soma dos elementos: " + calcularSoma(arrayLido));
        System.out.println("Maior valor: " + encontrarMaiorValor(arrayLido));
        System.out.println("Menor valor: " + encontrarMenorValor(arrayLido));

        int[] arrayAleatorio = criarArrayAleatorio(5, 1, 100);
        System.out.println("\nArray aleatório:");
        imprimirArray(arrayAleatorio);
        System.out.println("Soma dos elementos: " + calcularSoma(arrayAleatorio));
        System.out.println("Maior valor: " + encontrarMaiorValor(arrayAleatorio));
        System.out.println("Menor valor: " + encontrarMenorValor(arrayAleatorio));
    }

    public static int[] lerArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
        
    }
    
    public static int[] criarArrayAleatorio(int tamanho, int valorMinimo, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    
}

