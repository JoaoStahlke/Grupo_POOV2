package formativa2;

public class Unicórnio extends Criatura {

    private boolean imortal;

    public Unicórnio(String nome, int poderAtaque, boolean imortal) {
        super(nome, poderAtaque);
        this.imortal = imortal;
    }

    public boolean isImortal() {
        return imortal;
    }

    public void setImortal(boolean imortal) {
        this.imortal = imortal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImortal: " + imortal;
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Curar com o chifre";
    }
}
