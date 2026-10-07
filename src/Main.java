public class Main {
    public static void main(String[] args) {
        ejercicio3();
        /*String ModeloCoche= "BMWX7";
        int plazasCoche= 7;
        double DiaariaCoche=50.2;
        String ModeloMOTO= "Hornet";
        int plazasMoto= 2;
        double DiaariaMOTO=20.8;
        String ModeloPatinete= "Xiomi";
        int plazaPATINETE= 1;
        double DiaariaPATINETE=9.5;
        String ModeloFORGONETA= "Renault";
        int plazaFORGONETA= 7;
        double DiaariaFORGONETA=55.4;*/
    }

    public static void ejercicio2() {
        String total = "10 vehiculos";
        double Coche= 50.2 * 3;
        double MOTO = 20.8 * 4;
        double PATINETE= 9.5 * 2;
        double FORGONETA= 55.4 * 1;
        double resultado = Coche + MOTO + PATINETE + FORGONETA;
        System.out.println("ingresos totales " + resultado + "€");
    }

    public static void ejercicio3() {
        String veiculo = "FORGONETA_Renault_7plaza";
        int unidades = 6;
        double subtotal = 332.4;
        String descuento = "10%";
        double resultado = subtotal * 10 / 100;
        System.out.println("el descuento es de " + resultado +"€");
    }

    public static void ejercicio4() {
        double media = 50.2 + 20.8 + 9.5 + 55.4;
        double resultado = media / 4;
        System.out.println("la media es " + resultado);
    }

    public static void ejercicio5() {
        int vehiculos = 10;
        double COCHE = 3 * 100.0 / 10;
        double MOTO = 4 * 100.0 / 10;
        double PATINETE = 2 * 100.0 /10;
        double FORGONETA = 1 * 100.0 / 10;
        System.out.println("COCHES " + COCHE + "%");
        System.out.println("MOTOS "+ MOTO + "%");
        System.out.println("PATINETES "+PATINETE+ "%");
        System.out.println("FORGONETA " + FORGONETA + "%");
        System.out.println("Y todos juntos suman 100%");
    }
}

