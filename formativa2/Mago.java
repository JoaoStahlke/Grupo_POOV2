package formativa2;

public class Mago extends Personagem {

    private int poderMagico;

    public Mago(String nome, int vida, int poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPoder Mágico: " + poderMagico;
    }
}
