public class Main {
    public static void main(String[] args) {
        Retangulo simples = new RetanguloSimples(8, 3);
        Retangulo arredondada = new RetanguloBordaArredondada(8, 3);
        Retangulo dupla = new RetanguloLinhaDupla(8, 3);
        Retangulo ascii = new RetanguloAsciiArt(8, 3);
        Retangulo colorido = new RetanguloColorido(8, 3, "\u001B[31m");

        System.out.println("Retângulo Simples:");
        simples.desenhar();
        System.out.println();

        System.out.println("Retângulo Borda Arredondada:");
        arredondada.desenhar();
        System.out.println();

        System.out.println("Retângulo Linha Dupla:");
        dupla.desenhar();
        System.out.println();

        System.out.println("Retângulo ASCII Art:");
        ascii.desenhar();
        System.out.println();

        System.out.println("Retângulo Colorido:");
        colorido.desenhar();
        System.out.println();
    }
}