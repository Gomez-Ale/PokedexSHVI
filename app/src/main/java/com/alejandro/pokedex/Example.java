package com.alejandro.pokedex;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.EggGroup;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;
import me.sargunvohra.lib.pokekotlin.model.Type;

public class Example {

    public static void main(String[] args) {
        PokeApi pokeApi = new PokeApiClient();

        EggGroup[] pokeTypes = new EggGroup[151];
        for (int n = 0; n <= 150; n++) {
            pokeTypes[n] = pokeApi.getEggGroup(n+1);
            System.out.println(pokeTypes[n]);

        }
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
//        Pokemon[] pokedex4 = new Pokemon[107];
//        for(int n=0; n <=106; n++)
//        {
//            pokedex4[n] = pokeApi.getPokemon(n+387);
//            System.out.println(pokedex4[n]);
//            System.out.println();
//        }
//        Pokemon[] pokedex5 = new Pokemon[156];
//        for(int n=0; n <=155; n++)
//        {
//            pokedex5[n] = pokeApi.getPokemon(n+494);
//            System.out.println(pokedex5[n]);
//            System.out.println();
//        }
//        Pokemon[] pokedex6 = new Pokemon[72];
//        for(int n=0; n <=71; n++)
//        {
//            pokedex6[n] = pokeApi.getPokemon(n+650);
//            System.out.println(pokedex6[n]);
//            System.out.println();
//        }
//        Pokemon[] pokedex7 = new Pokemon[86];
//        for(int n=0; n <=85; n++)
//        {
//            pokedex7[n] = pokeApi.getPokemon(n+722);
//            System.out.println(pokedex7[n]);
//            System.out.println();
//        }
//        int i = 0;
//

    }
    public static Pokemon[] getDex(int gen) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon[] safeTest = new Pokemon[1];


        switch (gen) {
            case 1:
                Pokemon[] pokedex1 = new Pokemon[151];
                for (int n = 0; n <= 150; n++) {
                    pokedex1[n] = pokeApi.getPokemon(n + 1);

                }
                return pokedex1;
            case 2:
                Pokemon[] pokedex2 = new Pokemon[100];
                for (int n = 0; n <= 99; n++) {
                    pokedex2[n] = pokeApi.getPokemon(n + 152);

                }
                return pokedex2;
            case 3:
                Pokemon[] pokedex3 = new Pokemon[135];
                for (int n = 0; n <= 134; n++) {
                    pokedex3[n] = pokeApi.getPokemon(n + 252);

                }
                return pokedex3;
            case 4:
                Pokemon[] pokedex4 = new Pokemon[107];
                for (int n = 0; n <= 106; n++) {
                    pokedex4[n] = pokeApi.getPokemon(n + 387);

                }
                return pokedex4;
            case 5:
                Pokemon[] pokedex5 = new Pokemon[156];
                for (int n = 0; n <= 155; n++) {
                    pokedex5[n] = pokeApi.getPokemon(n + 494);

                }
                return pokedex5;
            case 6:
                Pokemon[] pokedex6 = new Pokemon[72];
                for (int n = 0; n <= 71; n++) {
                    pokedex6[n] = pokeApi.getPokemon(n + 650);

                }
                return pokedex6;
            case 7:
                Pokemon[] pokedex7 = new Pokemon[86];
                for (int n = 0; n <= 85; n++) {
                    pokedex7[n] = pokeApi.getPokemon(n + 722);

                }
                return pokedex7;
            default:
                break;
        }
        return safeTest;
    }



    public static Type[] getTypes(int gen) {
        PokeApi pokeApi = new PokeApiClient();
        Type[] safeTest = new Type[1];


        switch (gen) {
            case 1:
                Type[] pokedex1 = new Type[151];
                for (int n = 0; n <= 150; n++) {
                    pokedex1[n] = pokeApi.getType(n + 1);

                }
                return pokedex1;
            case 2:
                Type[] pokedex2 = new Type[100];
                for (int n = 0; n <= 99; n++) {
                    pokedex2[n] = pokeApi.getType(n + 152);

                }
                return pokedex2;
            case 3:
                Type[] pokedex3 = new Type[135];
                for (int n = 0; n <= 134; n++) {
                    pokedex3[n] = pokeApi.getType(n + 252);

                }
                return pokedex3;
            case 4:
                Type[] pokedex4 = new Type[107];
                for (int n = 0; n <= 106; n++) {
                    pokedex4[n] = pokeApi.getType(n + 387);

                }
                return pokedex4;
            case 5:
                Type[] pokedex5 = new Type[156];
                for (int n = 0; n <= 155; n++) {
                    pokedex5[n] = pokeApi.getType(n + 494);

                }
                return pokedex5;
            case 6:
                Type[] pokedex6 = new Type[72];
                for (int n = 0; n <= 71; n++) {
                    pokedex6[n] = pokeApi.getType(n + 650);

                }
                return pokedex6;
            case 7:
                Type[] pokedex7 = new Type[86];
                for (int n = 0; n <= 85; n++) {
                    pokedex7[n] = pokeApi.getType(n + 722);

                }
                return pokedex7;
            default:
                break;
        }
        return safeTest;
    }
    }
