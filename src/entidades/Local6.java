package entidades;


public class Local6 extends Locales {
    public Local6() {
    }

    @Override
    public String toString() {
        return "\n******************************\n******************************\n*  " +
                "Local 6: " + Locales.getLocal6() + "\n*  Tipo de local: " +Locales.getTipo6() +
                "\n*  Impuesto a pagar: " + String.format("%.2f",(Impuesto.impuestos(Locales.getTipo6()) * Locales.getTamanyoLocal6())) +
                "€\n*  Tasa base: " + Impuesto.impuestos(Locales.getTipo6()) +
                "€\n*  Tamaño del local: " + Locales.getTamanyoLocal6() + "m2\n******************************";
    }

}