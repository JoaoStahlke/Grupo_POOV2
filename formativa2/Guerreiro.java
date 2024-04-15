package formativa2;

public class Guerreiro extends Personagem {

    private String arma;

    public Guerreiro(String nome, int vida, String arma) {
        super(nome, vida);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArma: " + arma;
    }
}
