package model;

import enums.WeatherCondition;
import exceptions.PokemonException;

import java.util.Random;

public class PokemonAgua extends Pokemon {
    private int nivelHidratacion;

    public PokemonAgua(String nombre, int hp, int atq_lvl, int def_lvl, int nivelHidratacion) throws PokemonException {
        super(nombre, hp, atq_lvl, def_lvl);
        this.nivelHidratacion = nivelHidratacion;
    }

    public int getNivelHidratacion() {
        return nivelHidratacion;
    }

    @Override
    public void atacar(Pokemon p, WeatherCondition w) throws PokemonException {
        while (w == WeatherCondition.LLUVIOSO) {
            this.setAtq_lvl(this.getAtq_lvl() * (int) (Math.random() * 2));
        }
        if (p instanceof PokemonFuego) {
            this.setAtq_lvl(this.getAtq_lvl() - ((PokemonFuego) p).getResistenciaAgua());
        }
        super.atacar(p, w);
    }

    public void sanar() throws PokemonException {
        if (getHp() > 0) {
            this.setHp(this.getHp() + nivelHidratacion);
        } else {
            throw new PokemonException("Esta muerto no se puede curar");
        }
    }

    @Override
    public boolean atacado() {
        return true;
    }
}
