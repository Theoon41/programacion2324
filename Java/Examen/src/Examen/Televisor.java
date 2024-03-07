package Examen;

import java.util.Random;

public class Televisor {
    private int width;
    private int height;
    private final String conexiones;
    private final String protocolos;
    private String[][] imagenDefectuosa;
    private final int[][] imagenColoreada;
    private final int NUM_MAX_PIXELES_DEFECTUOSOS = getWidth()*getHeight()*3/100;
    private int contadorDePixelesMuertos;

    public Televisor(int ancho, int alto, String conexiones, String protocolos) {
        this.width = ancho;
        this.height = alto;
        this.conexiones = conexiones;
        this.protocolos = protocolos;
        this.imagenDefectuosa = new String[ancho][alto];
        this.imagenColoreada = new int[ancho][alto];
        iniciarImagen();
    }
    //Inicio la imagen pixel a pixel y contabilizo los que van muriendo
    private void iniciarImagen(){
        Random random = new Random();
        for(int i = 0; i < imagenDefectuosa.length; i++){
            for (int j = 0; j < imagenDefectuosa[i].length; j++){
                int pixel = random.nextInt(99);
                if (pixel < 3){
                    contadorDePixelesMuertos++;
                    imagenDefectuosa[i][j] = String.valueOf(false);
                }
                imagenDefectuosa[i][j] = String.valueOf(true);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setImagen(String[][] imagen){
        for(int i = 0; i < imagen.length; i++){
            for ( int j = 0; j < imagen[i].length; j++){
                imagenColoreada[i][j] = Integer.parseInt(imagen[i][j], 16);
            }
        }
    }
    //Calcula si es defectuosa la pantalla vien
    public boolean isDefectuoso(){
        return contadorDePixelesMuertos >= NUM_MAX_PIXELES_DEFECTUOSOS;
    }
    //calcular el color promedio sumando los valores de cada posición y dividiendolo por el total de pixeles.
    public String getColorPromedio(){
        int numPixeles = width*height;
        int sum = 0;
        String colorPromedio;
        for (int[] strings : imagenColoreada) {
            for (int string : strings) {
                sum += Integer.parseInt(String.valueOf(string));
            }
        }
        return colorPromedio = String.valueOf(sum / numPixeles);
    }

    public boolean conectar(Dispositivo n) throws DispositivoNoCompatibleException{

        String[] conexionesDispositivo = n.getConexiones().split("\\s+");
        String[] conexionesTelevisor = conexiones.split("\\s+");
        String[] protocolosDispositivo = n.getProtocolos().split("\\s+");
        String[] protocolosTelevisor = protocolos.split("\\s+");

        boolean coincidenciaConexiones = false;
        boolean coincidenciaProtocolos = false;

        for (int i = 0; i<conexionesTelevisor.length; i++){
            for (int j=0; j<conexionesDispositivo.length; j++){
                if (conexionesDispositivo[j].equals(conexionesTelevisor[i])){
                    coincidenciaConexiones = true;
                    break;
                }
            }
        }
        if (!coincidenciaConexiones){
            throw new DispositivoNoCompatibleException("No coinciden las conexiones del dispositivo con las de la pantalla");
        }

        for (int i = 0; i<protocolosTelevisor.length; i++){
            for (int j=0; j<protocolosDispositivo.length; j++){
                if (protocolosDispositivo[j].equals(protocolosTelevisor[i])){
                    coincidenciaProtocolos = true;
                    break;
                }
            }
        }
        if (!coincidenciaProtocolos){
            throw new DispositivoNoCompatibleException("No coinciden los protocolos de conectividad del dispositivo con los de la pantalla");
        }


        return coincidenciaConexiones && coincidenciaProtocolos == true;
    }
}
