package aplicacion;
import entidades.*;

public class Main {
    public static void main(String[] args) {
        CC cc = new CC("Las Delicias",6);
        Impuesto impuesto = new Impuesto();

        Locales locales= new Locales("LA CASCADA","Bar",80,"LA FAVORITA",
                "Ropa mixta",55,"ADVICE","Libreria",
                35,"EL FOGON", "Comedor", 125, "CASTELAR DEL SOL",
                "Comedor",70);
        Locales localeExtra = new Locales("FAST", "Deportes", 73);

        System.out.println(cc.toString() + locales.toString() + impuesto.toString());


    }
}
