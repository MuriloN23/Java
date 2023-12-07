
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }

    public float dividir(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {

            int resultadoInteiro = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão inteira: " + resultadoInteiro);

            float resultadoFloat = calculadora.dividir(10.0f, 0.0f);
            System.out.println("Resultado da divisão float: " + resultadoFloat);
        } catch (DivisionByZeroException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
