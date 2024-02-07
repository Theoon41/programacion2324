package ExResuelto;

public class Dispositivo {
    private String nombre;
    private String protocolo;
    private String conexiones;

    public Dispositivo(String nombre, String protocolo, String conexiones) {
        this.nombre = nombre;
        this.protocolo = protocolo;
        this.conexiones = conexiones;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getConexiones() {
        return conexiones;
    }

    public String getNombre() {
        return nombre;
    }
}
