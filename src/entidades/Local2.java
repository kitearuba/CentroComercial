package entidades;

public class Local2 extends Locales {
    public Local2() {}

    @Override
    public String toString() {
        return "\n******************************\n*  Local 2: " + Locales.getLocal2() +
                "\n*  Tipo de local: " +Locales.getTipo2() +
                "\n*  Impuesto a pagar: " + String.format("%.2f",(Impuesto.impuestos(Locales.getTipo2()) * Locales.getTamanyoLocal2())) +
                "€\n*  Tasa base: " + Impuesto.impuestos(Locales.getTipo2()) +
                "€\n*  Tamaño del local: " + Locales.getTamanyoLocal2() + "m2\n******************************";
    }

}

