package model;

import enums.WeatherCondition;
import exceptions.PokemonException;
import interfaces.Atacable;
import interfaces.Atacar;

public class PokemonTierra extends Pokemon implements Atacar, Atacable {
    private int resistenciaFuegoElectrico;

    public PokemonTierra(String nombre, int hp, int atq_lvl, int def_lvl, int resistenciaFuegoElectrico) throws PokemonException {
        super(nombre, hp, atq_lvl, def_lvl);
        this.resistenciaFuegoElectrico = resistenciaFuegoElectrico;
    }

    public int getResistenciaFuegoElectrico() {
        return resistenciaFuegoElectrico;
    }

    public void atacar(Pokemon p, WeatherCondition w) throws PokemonException {
        while (w == WeatherCondition.TORMENTAARENA) {
            this.setAtq_lvl(this.getAtq_lvl() * (int) (Math.random() * 2));
        }
        super.atacar(p, w);
    }

    @Override
    public boolean atacado() {
        return false;
    }
}
