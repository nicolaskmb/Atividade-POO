class ProgressaoAritmetica extends Progressao {
    private int diferenca;
    private int inicialValor;

    public ProgressaoAritmetica(int inicialValor, int diferenca) {
        super(inicialValor);
        this.diferenca = diferenca;
        this.inicialValor = inicialValor;
    }

    @Override
    public int getNext() {
        int proximoValor = atualValor;
        atualValor += diferenca;
        return proximoValor;
    }

    @Override
    public void restart() {
        atualValor = inicialValor;
    }
}
