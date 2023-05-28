package entidades;

public class Local5 extends Locales {
    public Local5() {}

    @Override
    public String toString() {
        return "\n******************************\n*  Local 5: " + Locales.getLocal5() +
                "\n*  Tipo de local: " +Locales.getTipo5() +
                "\n*  Impuesto a pagar: " + String.format("%.2f",(Impuesto.impuestos(Locales.getTipo5()) * Locales.getTamanyoLocal5())) +
                "€\n*  Tasa base: " + Impuesto.impuestos(Locales.getTipo5()) +
                "€\n*  Tamaño del local: " + Locales.getTamanyoLocal5() + "m2\n******************************";
    }

}