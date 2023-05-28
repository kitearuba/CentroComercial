package entidades;

public class Local3 extends Locales {
    public Local3() {}

    @Override
    public String toString() {
        return "\n******************************\n*  Local 3: " + Locales.getLocal3() +
                "\n*  Tipo de local: " +Locales.getTipo3() +
                "\n*  Impuesto a pagar: " + String.format("%.2f",(Impuesto.impuestos(Locales.getTipo3()) * Locales.getTamanyoLocal3())) +
                "€\n*  Tasa base: " + Impuesto.impuestos(Locales.getTipo3()) +
                "€\n*  Tamaño del local: " + Locales.getTamanyoLocal3() + "m2\n******************************";
    }

}
