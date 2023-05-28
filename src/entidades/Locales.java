package entidades;

public class Locales extends CC{
    private static String local1;
    private static String local2;
    private static String local3;
    private static String local4;
    private static String local5;
    private static String local6;
    private static String tipo1;
    private static String tipo2;
    private static String tipo3;
    private static String tipo4;
    private static String tipo5;
    private static String tipo6;
    private static int tamanyoLocal1;
    private static int tamanyoLocal2;
    private static int tamanyoLocal3;
    private static int tamanyoLocal4;
    private static int tamanyoLocal5;
    private static int tamanyoLocal6;

    public Locales() {
    }
    public Locales(String local6, String tipo6, int tamanyoLocal6) {

        this.local6 = local6;
        this.tipo6 = tipo6;
        this.tamanyoLocal6 = tamanyoLocal6;
    }
    public Locales(String local1, String tipo1, int tamanyoLocal1, String local2,
                   String tipo2, int tamanyoLocal2, String local3, String tipo3,
                   int tamanyoLocal3, String local4, String tipo4, int tamanyoLocal4,
                   String local5, String tipo5, int tamanyoLocal5) {

        this.local1 = local1;
        this.tipo1 = tipo1;
        this.tamanyoLocal1 = tamanyoLocal1;
        this.local2 = local2;
        this.tipo2 = tipo2;
        this.tamanyoLocal2 = tamanyoLocal2;
        this.local3 = local3;
        this.tipo3 = tipo3;
        this.tamanyoLocal3 = tamanyoLocal3;
        this.local4 = local4;
        this.tipo4 = tipo4;
        this.tamanyoLocal4 = tamanyoLocal4;
        this.local5 = local5;
        this.tipo5 = tipo5;
        this.tamanyoLocal5 = tamanyoLocal5;
    }

    public static String getLocal1() {
        return local1;
    }
    public static void setLocal1(String local1) {
        Locales.local1 = local1;
    }
    public static String getLocal2() {
        return local2;
    }
    public static void setLocal2(String local2) {
        Locales.local2 = local2;
    }
    public static String getLocal3() {
        return local3;
    }
    public static void setLocal3(String local3) {
        Locales.local3 = local3;
    }
    public static String getLocal4() {
        return local4;
    }
    public static void setLocal4(String local4) {
        Locales.local4 = local4;
    }
    public static String getLocal5() {
        return local5;
    }
    public static void setLocal5(String local5) {
        Locales.local5 = local5;
    }
    public static String getTipo1() {
        return tipo1;
    }
    public static void setTipo1(String tipo1) {
        Locales.tipo1 = tipo1;
    }
    public static String getTipo2() {
        return tipo2;
    }
    public static void setTipo2(String tipo2) {
        Locales.tipo2 = tipo2;
    }
    public static String getTipo3() {
        return tipo3;
    }
    public static void setTipo3(String tipo3) {
        Locales.tipo3 = tipo3;
    }
    public static String getTipo4() {
        return tipo4;
    }
    public static void setTipo4(String tipo4) {
        Locales.tipo4 = tipo4;
    }
    public static String getTipo5() {
        return tipo5;
    }
    public static void setTipo5(String tipo5) {
        Locales.tipo5 = tipo5;
    }
    public static int getTamanyoLocal1() {
        return tamanyoLocal1;
    }
    public static void setTamanyoLocal1(int tamanyoLocal1) {
        Locales.tamanyoLocal1 = tamanyoLocal1;
    }
    public static int getTamanyoLocal2() {
        return tamanyoLocal2;
    }
    public static void setTamanyoLocal2(int tamanyoLocal2) {
        Locales.tamanyoLocal2 = tamanyoLocal2;
    }
    public static int getTamanyoLocal3() {
        return tamanyoLocal3;
    }
    public static void setTamanyoLocal3(int tamanyoLocal3) {
        Locales.tamanyoLocal3 = tamanyoLocal3;
    }
    public static int getTamanyoLocal4() {
        return tamanyoLocal4;
    }
    public static void setTamanyoLocal4(int tamanyoLocal4) {
        Locales.tamanyoLocal4 = tamanyoLocal4;
    }
    public static int getTamanyoLocal5() {
        return tamanyoLocal5;
    }
    public static void setTamanyoLocal5(int tamanyoLocal5) {
        Locales.tamanyoLocal5 = tamanyoLocal5;
    }
    public static String getLocal6() {
        return local6;
    }
    public static void setLocal6(String local6) {
        Locales.local6 = local6;
    }
    public static String getTipo6() {
        return tipo6;
    }
    public static void setTipo6(String tipo6) {
        Locales.tipo6 = tipo6;
    }
    public static int getTamanyoLocal6() {
        return tamanyoLocal6;
    }
    public static void setTamanyoLocal6(int tamanyoLocal6) {
        Locales.tamanyoLocal6 = tamanyoLocal6;
    }

    @Override
    public String toString() {
        String tab="\t\t\t";
        return tab+ local1 +" - "+ tipo1+ '\n' + tab +
                local2+" - "+ tipo2+ '\n'+tab + local3 +" - "+
                tipo3+ '\n'+ tab + local4 +" - "+ tipo4+ '\n'
                +tab + local5+" - "+ tipo5 + '\n' +tab + local6+
                " - "+ tipo6 + '\n';
    }

}
