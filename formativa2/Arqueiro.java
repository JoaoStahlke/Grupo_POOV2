package formativa2;

public class Arqueiro extends Personagem {

    private int precisao;

    public Arqueiro(String nome, int vida, int precisao) {
        super(nome, vida);
        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrecisão: " + precisao;
    }

    public String atirarFlecha() {
        return "O arqueiro atira uma flecha com precisão mortal";
    }
}
