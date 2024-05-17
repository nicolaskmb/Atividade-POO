class ProgressaoFibonacci extends Progressao {
    private int anteriorValor;
    private int inicialValor1;
    private int inicialValor2;

    public ProgressaoFibonacci(int inicialValor1, int inicialValor2) {
        super(inicialValor1);
        this.anteriorValor = inicialValor2 - inicialValor1;
        this.inicialValor1 = inicialValor1;
        this.inicialValor2 = inicialValor2;
    }

    @Override
    public int getNext() {
        int proximoValor = atualValor;
        int novoAnterior = atualValor;
        atualValor += anteriorValor;
        anteriorValor = novoAnterior;
        return proximoValor;
    }

    @Override
    public void restart() {
        atualValor = inicialValor1;
        anteriorValor = inicialValor2 - inicialValor1;
    }
}