package model;

import enums.WeatherCondition;
import exceptions.PokemonException;
import interfaces.Atacable;
import interfaces.Atacar;

public class PokemonDivino extends Pokemon implements Atacar, Atacable {
    public PokemonDivino(String nombre, int hp, int atq_lvl, int def_lvl) throws PokemonException {
        super(nombre, hp, atq_lvl, def_lvl);
    }

    @Override
    public boolean atacado() {
        return false;
    }
}
