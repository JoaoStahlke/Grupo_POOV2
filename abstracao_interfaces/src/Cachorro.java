public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("au au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro anda!");
    }
}