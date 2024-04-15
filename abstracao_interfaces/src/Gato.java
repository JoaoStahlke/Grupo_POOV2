public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato anda!");
    }
}