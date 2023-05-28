package entidades;

public class Local4 extends Locales {
    public Local4() {}

    @Override
    public String toString() {
        return "\n******************************\n*  Local 4: " + Locales.getLocal4() +
                "\n*  Tipo de local: " +Locales.getTipo4() +
                "\n*  Impuesto a pagar: " + String.format("%.2f",(Impuesto.impuestos(Locales.getTipo4()) * Locales.getTamanyoLocal4())) +
                "€\n*  Tasa base: " + Impuesto.impuestos(Locales.getTipo4()) +
                "€\n*  Tamaño del local: " + Locales.getTamanyoLocal4() + "m2\n******************************";
    }

}