package formativa2;

public class Armadura extends Item {

    private int defesa;

    public Armadura(String nome, int quantidade, int defesa) {
        super(nome, quantidade);
        this.defesa = defesa;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDefesa: " + defesa;
    }
}
