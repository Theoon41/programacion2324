package model;

import enums.WeatherCondition;
import exceptions.PokemonException;
import interfaces.Atacable;
import interfaces.Atacar;

public class PokemonElectrico extends Pokemon implements Atacar, Atacable {
    private int resitenciaAtaques;

    public PokemonElectrico(String nombre, int hp, int atq_lvl, int def_lvl, int resitenciaAtaques) throws PokemonException {
        super(nombre, hp, atq_lvl, def_lvl);
        this.resitenciaAtaques = resitenciaAtaques;
    }

    public int getResitenciaAtaques() {
        return resitenciaAtaques;
    }

    public void atacar(Pokemon p, WeatherCondition w) throws PokemonException {
        while (w == WeatherCondition.TOMENTAELECTRICA) {
            this.setAtq_lvl(this.getAtq_lvl() * (int) (Math.random() * 2));
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
