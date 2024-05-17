class RetanguloSimples extends Retangulo {

    public RetanguloSimples(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public void desenhar() {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.println("+" + "-".repeat(largura - 2) + "+");
            } else {
                System.out.println("|" + " ".repeat(largura - 2) + "|");
            }
        }
    }
}