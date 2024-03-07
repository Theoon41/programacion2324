package Examen;

public class Dispositivo {
    private String nombre;
    private String conexiones;
    private String protocolos;

    public Dispositivo(String nombre, String conexiones, String protocolos) {
        this.nombre = nombre;
        this.conexiones = conexiones;
        this.protocolos = protocolos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getConexiones() {
        return conexiones;
    }

    public String getProtocolos() {
        return protocolos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
