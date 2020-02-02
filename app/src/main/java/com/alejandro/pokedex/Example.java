package com.alejandro.pokedex;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;

public class Example {
    public static void main(String[] args) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon[] pokedex = new Pokemon[806];
        for(int n=0; n <=806; n++)
        {
            pokedex[n] = pokeApi.getPokemon(n+1
            );
            System.out.println(pokedex[n]);
            System.out.println();
        }


    }
}
