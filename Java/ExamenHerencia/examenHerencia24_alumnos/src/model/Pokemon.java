package model;

import enums.WeatherCondition;
import exceptions.PokemonException;
import interfaces.Atacar;
import interfaces.Atacable;

public abstract class Pokemon implements Atacar, Atacable {
    public static final int MAX_HP = 100;
    public static final int MAX_ATQ = 15;
    public static final int MAX_DEF = 25;
    public static final int MIN_HP = 0;
    public static final int MIN_ATQ = 0;
    public static final int MIN_DEF = 0;
    private String nombre;
    private int hp;
    private int atq_lvl;
    private int def_lvl;

    public Pokemon(String nombre, int hp, int atq_lvl, int def_lvl) throws PokemonException {
        this.nombre = nombre;
        setHp(hp);
        setAtq_lvl(atq_lvl);
        setDef_lvl(def_lvl);
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public int getAtq_lvl() {
        return atq_lvl;
    }

    public int getDef_lvl() {
        return def_lvl;
    }

    public void setHp(int hp) throws PokemonException {
        if (hp > MAX_HP) {
            throw new PokemonException("Has superado la vida maxima");
        }
        this.hp = hp;
    }

    public void setAtq_lvl(int atq_lvl) throws PokemonException {
        if (atq_lvl < MIN_ATQ || atq_lvl > MAX_ATQ) {
            throw new PokemonException("El valor del ataque es invalido");
        }
        this.atq_lvl = atq_lvl;
    }

    public void setDef_lvl(int def_lvl) throws PokemonException {
        if (def_lvl < MIN_DEF || def_lvl > MAX_DEF) {
            throw new PokemonException("El valor de la defensa es invalido");
        }
        this.def_lvl = def_lvl;
    }

    public void atacar(Pokemon p, WeatherCondition w) throws PokemonException {
        if (p == this){
           throw new PokemonException("No te puedes atacar a ti mismo");
        }
        int restarHP = this.atq_lvl - p.getDef_lvl() / 100;
        if (w == WeatherCondition.LLUVIOSO && p instanceof PokemonElectrico) {
            restarHP -= ((PokemonElectrico) p).getResitenciaAtaques() / 100;
        }
        p.setHp(p.getHp() - restarHP);

        if (p.getHp() < 1) {
            throw new PokemonException("El pokemon ha muerto");
        }
    }

    public boolean estaVivo() {
        if (getHp() > 0) {
            return true;
        } else {
            return false;
        }
    }


}
