import javax.swing.*;
import java.util.Random;

public class Televisor {
    private int widht;
    private int height;
    private String protocolos;
    private String conexiones;
    private Pixel[][] pantalla;
    private int contadorDePixelesMuertos;

    public Televisor(int widht, int height, String protocolos, String conexiones) {
        this.widht = widht;
        this.height = height;
        this.protocolos = protocolos;
        this.conexiones = conexiones;
        pantalla = new Pixel[height][widht];
    }

    public int getWidth() {
        return widht;
    }

    public int getHeight() {
        return height;
    }

    public void iniciarImagen(){
        Random random = new Random();
        for(int i = 0; i < height; i++){
            for (int j = 0; j < widht; j++){
                int pixel = random.nextInt(99);
                pantalla[i][j] = new Pixel(pixel < 3);
                if (pixel < 3){
                    contadorDePixelesMuertos++;
                }
            }
        }
    }

    public boolean isDefectuoso(){
        return contadorDePixelesMuertos>=(widht*height*3/100);
    }

    public void setImagen(String[][] imagen){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < widht; j++){
                int rojo = Integer.parseInt(imagen[i][j].substring(1,3), 16);
                int verde = Integer.parseInt(imagen[i][j].substring(3, 5), 16);
                int azul = Integer.parseInt(imagen[i][j].substring(5), 16);

                pantalla[i][j].setR(rojo);
                pantalla[i][j].setG(verde);
                pantalla[i][j].setB(azul);
            }
        }
    }


    public String getColorPromedio() {
        long rojo = 0, verde = 0, azul = 0;

        for(int i = 0; i < height; i++){
            for (int j = 0; j < widht; j++){
                rojo+= pantalla[i][j].getR();
                verde+= pantalla[i][j].getG();
                azul+= pantalla[i][j].getB();
            }
        }

        int colorPromedioRojo = (int) (rojo / (height*widht));
        int colorPromedioVerde = (int) (verde / (height*widht));
        int colorPromedioAzul = (int) (azul  / (height*widht));

        return String.format("#%02X%02X%02X", colorPromedioRojo, colorPromedioVerde, colorPromedioAzul);
    }

    public String conectar(Dispositivo cacharro) throws DispositivoNoCompatibleException {
        String[] tipoConexionesTele = conexiones.split("\\s+");
        String[] tipoConexionesCacharro = cacharro.getConexiones().split("\\s+");
        String conexiónCompatible = null;

        for (int i = 0; i < tipoConexionesTele.length && conexiónCompatible == null; i++){
            for (int j =0; j < tipoConexionesCacharro.length && conexiónCompatible == null; j++){
                if (tipoConexionesTele[i].equals(tipoConexionesCacharro[j])){
                    conexiónCompatible = tipoConexionesCacharro[j];
                }
            }
        }
        if (conexiónCompatible == null){throw new DispositivoNoCompatibleException("El dispositivo" + cacharro.getNombre() + "no es tiene conexiones compatibles.");}

        String[] tipoProtocolosTele = conexiones.split("\\s+");
        String[] tipoProtocolosCacharro = cacharro.getConexiones().split("\\s+");
        String protocolosCompatible = null;

        for (int i = 0; i < tipoProtocolosTele.length && protocolosCompatible == null; i++){
            for (int j =0; j < tipoProtocolosCacharro.length && protocolosCompatible == null; j++){
                if (tipoProtocolosTele[i].equals(tipoProtocolosCacharro[j])){
                    protocolosCompatible = tipoProtocolosCacharro[j];
                }
            }
        }
        if (protocolosCompatible == null){throw new DispositivoNoCompatibleException("El dispositivo" + cacharro.getNombre() + "no es tiene protocolos compatibles.");}

        return String.format("El dispositivo %s es compatible mediante el puerto %s y el protocolo %s", cacharro.getNombre(), conexiónCompatible, protocolosCompatible);
    }
}
