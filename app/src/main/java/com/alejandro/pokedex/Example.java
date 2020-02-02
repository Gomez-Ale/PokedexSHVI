//package com.alejandro.pokedex;
//
//import me.sargunvohra.lib.pokekotlin.client.PokeApi;
//import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
//import me.sargunvohra.lib.pokekotlin.model.Pokemon;
//import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;
//
////public class Example {
//    public static void main(String args[]) {
//
//        PokeApi pokeApi = new PokeApiClient();
//        Pokemon[] pokedex1 = new Pokemon[151];
//        for(int n=0; n <=150; n++)
//        {
//            pokedex1[n] = pokeApi.getPokemon(n+1);
////            System.out.println(pokedex1[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex2 = new Pokemon[100];
//        for(int n=0; n <=99; n++)
//        {
//            pokedex2[n] = pokeApi.getPokemon(n+152);
////            System.out.println(pokedex2[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex3 = new Pokemon[135];
//        for(int n=0; n <=134; n++)
//        {
//            pokedex3[n] = pokeApi.getPokemon(n+252);
////            System.out.println(pokedex3[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex4 = new Pokemon[106];
//        for(int n=0; n <=105; n++)
//        {
//            pokedex4[n] = pokeApi.getPokemon(n+387);
////            System.out.println(pokedex4[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex5 = new Pokemon[155];
//        for(int n=0; n <=154; n++)
//        {
//            pokedex5[n] = pokeApi.getPokemon(n+494);
////            System.out.println(pokedex5[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex6 = new Pokemon[71];
//        for(int n=0; n <=70; n++)
//        {
//            pokedex5[n] = pokeApi.getPokemon(n+650);
////            System.out.println(pokedex6[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex7 = new Pokemon[85];
//        for(int n=0; n <=84; n++)
//        {
//            pokedex5[n] = pokeApi.getPokemon(n+722);
////            System.out.println(pokedex7[n]);
////            System.out.println();
//        }
//    }
////}
package com.alejandro.pokedex;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;

public class Example {
    public static void main(String[] args) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon[] pokedex1 = new Pokemon[151];
        for(int n=0; n <=150; n++)
        {
            pokedex1[n] = pokeApi.getPokemon(n+1);
//            System.out.println(pokedex1[n]);
//            System.out.println();
        }
        Pokemon[] pokedex2 = new Pokemon[100];
        for(int n=0; n <=99; n++)
        {
            pokedex2[n] = pokeApi.getPokemon(n+152);
//            System.out.println(pokedex2[n]);
//            System.out.println();
        }
        Pokemon[] pokedex3 = new Pokemon[135];
        for(int n=0; n <=134; n++)
        {
            pokedex3[n] = pokeApi.getPokemon(n+252);
//            System.out.println(pokedex3[n]);
//            System.out.println();
        }
        Pokemon[] pokedex4 = new Pokemon[107];
        for(int n=0; n <=106; n++)
        {
            pokedex4[n] = pokeApi.getPokemon(n+387);
            System.out.println(pokedex4[n]);
            System.out.println();
        }
        Pokemon[] pokedex5 = new Pokemon[156];
        for(int n=0; n <=155; n++)
        {
            pokedex5[n] = pokeApi.getPokemon(n+494);
            System.out.println(pokedex5[n]);
            System.out.println();
        }
        Pokemon[] pokedex6 = new Pokemon[72];
        for(int n=0; n <=71; n++)
        {
            pokedex6[n] = pokeApi.getPokemon(n+650);
            System.out.println(pokedex6[n]);
            System.out.println();
        }
        Pokemon[] pokedex7 = new Pokemon[86];
        for(int n=0; n <=85; n++)
        {
            pokedex7[n] = pokeApi.getPokemon(n+722);
            System.out.println(pokedex7[n]);
            System.out.println();
        }
        int i = 0;


    }
}