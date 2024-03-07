package MaquinaCafe;



public class Main {
    public static void main(String[] args) {
        int opcion;

        Maquina maquina = new Maquina();

        do{
            imprimirMenu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Seleccione una opcion", 1, 5);
            switch (opcion) {
                case 1:
                    if (maquina.puedoServirCafe()) {
                        double pago = MiEntradaSalida.leerDoublePositivo("Introduzca el pago");
                        try {
                            maquina.servirCafe();
                            System.out.println(maquina.darCambio(pago, Maquina.PRECIO_CAFE));
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 2:
                    if (maquina.puedoServirLeche()) {
                        double pago = MiEntradaSalida.leerDoublePositivo("Introduzca el pago");
                        try {
                            maquina.servirLeche();
                            System.out.println(maquina.darCambio(pago, Maquina.PRECIO_LECHE));
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 3:
                    if (maquina.puedoServirCafeConLeche()) {
                        double pago = MiEntradaSalida.leerDoublePositivo("Introduzca el pago");
                        try {
                            maquina.servirCafeConLeche();
                            System.out.println(maquina.darCambio(pago, Maquina.PRECIO_CAFE_CON_LECHE));
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 4:
                    System.out.println(maquina);
                    break;
                case 5:
                    System.out.println("Gracias por su tiempo y su dinero");
                    break;
            }

        }while (opcion !=5);




    }
    public static void imprimirMenu(){
        System.out.println("Binvenido elija una de as siguientes opciones");
        System.out.println("1. Servir cafe ("+ Maquina.PRECIO_CAFE + " euros)");
        System.out.println("2. Servir leche ("+ Maquina.PRECIO_LECHE + " euros)");
        System.out.println("3. Servir cafe con leche ("+ Maquina.PRECIO_CAFE_CON_LECHE + " euros)");
        System.out.println("4. Consultar estado de la maquina");
        System.out.println("5. Salir");
    }
}
