package Ex02_CA;

public class Circulo extends Forma{
    private Float raio;

    public Circulo(Float raio) {
        this.raio = raio;
    }

    @Override
    public Float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public Float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    public String mostrarInformacao() {
        return "Circulo | Raio: " + getRaio();
    }

    public Float getRaio() {
        return raio;
    }

    public void setRaio(Float raio) {
        this.raio = raio;
    }
}
