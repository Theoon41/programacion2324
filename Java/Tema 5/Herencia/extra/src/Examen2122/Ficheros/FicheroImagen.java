package Examen2122.Ficheros;

public class FicheroImagen extends Fichero {
    private byte[] contenido;
    private TFormatoImagen formatoImagen;

    public FicheroImagen(String name, byte[] contenido, TFormatoImagen formatoImagen) {
        super(name);
        this.contenido = contenido;
        this.formatoImagen = formatoImagen;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public TFormatoImagen getFormatoImagen() {
        return formatoImagen;
    }

    public long getSize() {
        return contenido.length;
    }
}
