abstract class Progressao {
    protected int atualValor;

    public Progressao(int inicialValor) {
        this.atualValor = inicialValor;
    }

    public abstract int getNext();

    public abstract void restart();
}