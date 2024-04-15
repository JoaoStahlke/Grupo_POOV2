package formativa2;

public class Dragão extends Criatura {

    private int tamanho;

    public Dragão(String nome, int poderAtaque, int tamanho) {
        super(nome, poderAtaque);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTamanho: " + tamanho + " metros";
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Cuspir fogo";
    }
}
