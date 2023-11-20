import java.util.Scanner;

public class Main {
        public static void main(String[]args){
            Scanner tc = new Scanner(System.in);

            System.out.println("Introduce el tipo de vehiculo");
            String tipoVehiculo = tc.nextLine();

            if(tipoVehiculo.equals("coche")){
                System.out.println("120 km/h");
            }
            else if (tipoVehiculo.equals("moto")){
                System.out.println("90 km/h");
            }
            else if (tipoVehiculo.equals("camión")){
                System.out.println("80 km/h");
            }
            else{
                System.out.println("No conozco su velocidad");
            }

        }
}
