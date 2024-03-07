package model;

import enums.WeatherCondition;
import exceptions.PokemonException;
import interfaces.Atacable;
import interfaces.Atacar;

public class PokemonFuego extends Pokemon implements Atacable, Atacar {
    private int resistenciaAgua;
    public PokemonFuego(String nombre, int hp, int atq_lvl, int def_lvl, int resistenciaAgua) throws PokemonException {
        super(nombre, hp, atq_lvl, def_lvl);
        this.resistenciaAgua = resistenciaAgua;
    }

    public int getResistenciaAgua() {
        return resistenciaAgua;
    }

    public void atacar(Pokemon p, WeatherCondition w) throws PokemonException {
        while (w == WeatherCondition.SOLEADO){
            this.setAtq_lvl(this.getAtq_lvl () *(int) (Math.random()*2));
        }
        if (p instanceof PokemonTierra) {
            this.setAtq_lvl(this.getAtq_lvl() - ((PokemonTierra) p).getResistenciaFuegoElectrico());
        }
        super.atacar(p, w);
    }

    @Override
    public boolean atacado() {
        return true;
    }
}
