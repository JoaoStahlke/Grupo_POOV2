package formativa2;

public class Grifo extends Criatura {

    private int velocidadeVoo;

    public Grifo(String nome, int poderAtaque, int velocidadeVoo) {
        super(nome, poderAtaque);
        this.velocidadeVoo = velocidadeVoo;
    }

    public int getVelocidadeVoo() {
        return velocidadeVoo;
    }

    public void setVelocidadeVoo(int velocidadeVoo) {
        this.velocidadeVoo = velocidadeVoo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocidade de Voo: " + velocidadeVoo + " km/h";
    }

    @Override
    public String getHabilidadeEspecial() {
        return "Voar e atacar com suas garras afiadas";
    }
}