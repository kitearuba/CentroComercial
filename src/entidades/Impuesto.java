package entidades;

public class Impuesto {
    public Impuesto() {}

    static double impuestos(String tipo){

        String bar = "bar";
        String comedor = "comedor";
        String libreria = "libreria";
        String ropaMixta = "ropa mixta";
        String deportes = "deportes";
        double tarifa = 0;
        double tarifaBar = 1.2;
        double tarifaComedor = 1.3;
        double tarifaLibre = 1.0;
        double tarifaMixta = 1.0;
        double tarifaDeportes = 1.4;

        if (bar.equalsIgnoreCase(tipo)){
            tarifa= tarifaBar;
        } else if (comedor.equalsIgnoreCase(tipo)) {
            tarifa= tarifaComedor;
        } else if (libreria.equalsIgnoreCase(tipo)) {
            tarifa = tarifaLibre;
        } else if (ropaMixta.equalsIgnoreCase(tipo)) {
            tarifa = tarifaMixta;
        }else if (deportes.equalsIgnoreCase(tipo)) {
            tarifa = tarifaDeportes;
        }
        return tarifa;
    }

    Locales local1 = new Local1();
    Locales local2 = new Local2();
    Locales local3 = new Local3();
    Locales local4 = new Local4();
    Locales local5 = new Local5();
    Locales local6 = new Local6();

    @Override
    public String toString() {
        return local1.toString() + local2.toString() +
                local3.toString() + local4.toString() +
                local5.toString() + local6.toString();
    }
}
