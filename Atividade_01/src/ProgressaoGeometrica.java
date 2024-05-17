class ProgressaoGeometrica extends Progressao {
    private int razao;
    private int inicialValor;

    public ProgressaoGeometrica(int inicialValor, int razao) {
        super(inicialValor);
        this.razao = razao;
        this.inicialValor = inicialValor;
    }

    @Override
    public int getNext() {
        int proximoValor = atualValor;
        atualValor *= razao;
        return proximoValor;
    }

    @Override
    public void restart() {
        atualValor = inicialValor;
    }
}