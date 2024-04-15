package formativa2;

public class Poção extends Item {

    private int cura;

    public Poção(String nome, int quantidade, int cura) {
        super(nome, quantidade);
        this.cura = cura;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCura: " + cura;
    }
}
