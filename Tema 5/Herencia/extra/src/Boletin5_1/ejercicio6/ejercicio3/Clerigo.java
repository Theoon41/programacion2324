package Boletin5_1.ejercicio6.ejercicio3;

public class Clerigo extends Personaje {
    public static final int STR_MIN = 18;
    public static final int INT_MIN = 12;
    public static final int INT_MAX = 16;
    public static final int CURACION = 10;
    private final String dios;

    public Clerigo(String nombre, Raza raza, int fuerza, int inteligencia, int vida, String dios) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vida);
        this.dios = dios;
    }

    public String getDios() {
        return dios;
    }

    public void curar (Personaje personaje) throws PersonajeException {
        if (this == personaje){
           throw new PersonajeException("No puedes curarte a ti mismo");
        }
        if (personaje.getVidaActual() == Personaje.PUNTOS_VIDA_MINIMOS){
            throw new PersonajeException("Está muerto, no puedes revivirlo");
        }
        personaje.setVidaActual(personaje.getVidaActual()+CURACION);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clerigo{");
        sb.append("dios='").append(dios).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
