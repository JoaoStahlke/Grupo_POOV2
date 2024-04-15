public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}