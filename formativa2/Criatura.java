package formativa2;

public abstract class Criatura {

    private String nome;
    private int poderAtaque;

    public Criatura(String nome, int poderAtaque) {
        this.nome = nome;
        this.poderAtaque = poderAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPoder de Ataque: " + poderAtaque;
    }

    public abstract String getHabilidadeEspecial();
}
