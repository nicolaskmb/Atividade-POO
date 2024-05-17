class RetanguloColorido extends Retangulo {
    private String cor;

    public RetanguloColorido(int largura, int altura, String cor) {
        super(largura, altura);
        this.cor = cor;
    }

    private String aplicarCor(String texto) {
        return cor + texto + "\u001B[0m";
    }

    @Override
    public void desenhar() {
        String linhaSuperior = aplicarCor("+" + "-".repeat(largura - 2) + "+");
        String linhaInferior = aplicarCor("+" + "-".repeat(largura - 2) + "+");

        System.out.println(linhaSuperior);
        for (int i = 1; i < altura - 1; i++) {
            String linhaVazia = "|" + " ".repeat(largura - 2) + "|";
            System.out.println(aplicarCor(linhaVazia));
        }
        System.out.println(linhaInferior);
    }
}
