public class Main {
    public static void main(String[] args) {
        Progressao aritmetica = new ProgressaoAritmetica(1, 2);
        Progressao geometrica = new ProgressaoGeometrica(1, 2);
        Progressao fibonacci = new ProgressaoFibonacci(0, 1);

        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 5; i++) {
            System.out.print(aritmetica.getNext() + " ");
        }
        System.out.println();
        aritmetica.restart();

        System.out.println("Progressão Geométrica:");
        for (int i = 0; i < 5; i++) {
            System.out.print(geometrica.getNext() + " ");
        }
        System.out.println();
        geometrica.restart();

        System.out.println("Progressão Fibonacci:");
        for (int i = 0; i < 5; i++) {
            System.out.print(fibonacci.getNext() + " ");
        }
        System.out.println();
        fibonacci.restart();
    }
}