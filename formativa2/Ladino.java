package formativa2;

public class Ladino extends Personagem {

    private int furtividade;

    public Ladino(String nome, int vida, int furtividade) {
        super(nome, vida);
        this.furtividade = furtividade;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFurtividade: " + furtividade;
    }

    public String atacarFurtivamente() {
        return "O ladino ataca furtivamente, usando sua agilidade e discrição para surpreender o inimigo.";
    }
}
