package Examen2122.Ficheros;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Fichero{
    private String name;
    private long size;
    private LocalDateTime date;

    public Fichero(String name) {
        this.name = name;
        this.date = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public abstract long getSize();

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Fichero{");
        sb.append("name='").append(name).append('\'');
        sb.append(", size=").append(size);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
