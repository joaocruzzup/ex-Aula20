package Ex02_CA;

public class Retangulo extends Forma{
    private Float lado;
    private Float altura;

    public Retangulo(Float lado, Float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Retangulo(Float lado){
        this.lado = lado;
        this.altura = lado;
    };


    @Override
    public Float calcularArea() {
        return lado * altura;
    }

    @Override
    public Float calcularPerimetro() {
        return (lado * 2) + (altura * 2);
    }

    @Override
    public String mostrarInformacao() {
        return "Retângulo | Lado: " + getLado() + " | Altura: " + getAltura();
    }

    public Float getLado() {
        return lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}

