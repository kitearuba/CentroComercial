package entidades;

public class Local1 extends Locales {
    public Local1() {
    }

    @Override
    public String toString() {
        return "\n******************************\n******************************\n*  " +
                "Local 1: " + Locales.getLocal1() + "\n*  Tipo de local: " +Locales.getTipo1() +
                "\n*  Impuesto a pagar: " + String.format("%.2f",(Impuesto.impuestos(Locales.getTipo1()) * Locales.getTamanyoLocal1())) +
                "€\n*  Tasa base: " + Impuesto.impuestos(Locales.getTipo1()) +
                "€\n*  Tamaño del local: " + Locales.getTamanyoLocal1() + "m2\n******************************";
    }

}
