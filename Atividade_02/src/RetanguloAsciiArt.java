class RetanguloAsciiArt extends Retangulo {

    public RetanguloAsciiArt(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public void desenhar() {
        System.out.println("@".repeat(largura));
        for (int i = 1; i < altura - 1; i++) {
            System.out.println("@" + " ".repeat(largura - 2) + "@");
        }
        System.out.println("@".repeat(largura));
    }
}
