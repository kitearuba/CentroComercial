package entidades;

public class CC {
    private String centroComercial;
    private int locales;
    public CC() {
    }
    public CC(String centroComercial,int locales) {
        this.centroComercial = centroComercial;
        this.locales = locales;
    }

    public String getCentroComercial() {
        return centroComercial;
    }
    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
    public int getLocales() {
        return locales;
    }
    public void setLocales(int locales) {
        this.locales = locales;
    }

    @Override
    public String toString() {
        return "\nCentro: " + centroComercial +
        "\nLa cantidad de locales son: "+ locales +
                "\nLocales:\n";
    }
}