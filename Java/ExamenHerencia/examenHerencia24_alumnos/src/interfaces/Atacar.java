package interfaces;

import enums.WeatherCondition;
import exceptions.PokemonException;
import model.Pokemon;

public interface Atacar {
    public void atacar(Pokemon p, WeatherCondition w) throws PokemonException;
}
