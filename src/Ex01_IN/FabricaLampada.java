package Ex01_IN;

public class FabricaLampada {
    public Object construir(String tipoLampada){
        if (tipoLampada.equalsIgnoreCase("fluorescente")){
            return new Fluorescente();
        } else if (tipoLampada.equalsIgnoreCase("incandescente")){
            return new Incandescente();
        } else {
            return null;
        }
    }
}
