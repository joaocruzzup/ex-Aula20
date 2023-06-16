package Ex02_CA;

public class Quadrado extends Retangulo{

    public Quadrado(Float lado) {
        super(lado);
    }

    @Override
    public String mostrarInformacao() {
        return "Quadrado | Lado: " + getLado();
    }

}
