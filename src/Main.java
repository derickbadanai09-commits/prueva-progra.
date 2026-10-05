public class Main {
    public static void main(String[] args) {
       ejercicio5();
       /* String COCHE_BMW_7plaza= "50.2€/dia";
        String MOTO_Hornet_2plaza= "20.8€/dia";
        String Patinete_Xiomi_1plaza=" 9.5€/dia";
        String FORGONETA_Renault_7plaza= " 55.4€/dia";*/
    }
        public static void ejercicio2(){
        String total= "10 vehiculos";
        double COCHE_BMW_7plaza = 50.2 * 3;
        double MOTO_Hornet_2plaza= 20.8 * 4;
        double Patinete_Xiomi_1plaza =9.5 * 2;
        double FORGONETA_Renault_7plaza=  55.4;
        double resultado= COCHE_BMW_7plaza + MOTO_Hornet_2plaza +Patinete_Xiomi_1plaza+FORGONETA_Renault_7plaza ;
            System.out.println("ingresos totales "+resultado+"€");
        }
            public static void ejercicio3 (){
        String veiculo= "FORGONETA_Renault_7plaza";
        int unidades= 6;
        double subtotal= 332.4;
        String descuento= "10%";
        double resultado= 332.4/ 10;
                System.out.println("el descuento es de "+resultado);
    }
    public static void ejercicio4(){
        double media= 50.2+20.8+9.5+55.4;
        double resultado= media /4;
        System.out.println("la media es " + resultado);
    }
    public static void ejercicio5 (){
        int vehiculos= 10;
        double COCHE= 3/10*100;
        double MOTO=
        double PATINETE= 10/2;
        double FORGONETA= 1;
        System.out.println("COCHE "+ COCHE+ "%");
        System.out.println("MOTO "+ MOTO+ "%");
        System.out.println("PATINETE "+ PATINETE+ "%");
        System.out.println("FORGONETA "+FORGONETA+ "%");
    }
}

