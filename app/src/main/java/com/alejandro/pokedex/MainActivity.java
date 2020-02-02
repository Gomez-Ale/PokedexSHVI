package com.alejandro.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;

public class MainActivity extends AppCompatActivity {

//    public void dexGen() {
//        PokeApi pokeApi = new PokeApiClient();
//        Pokemon[] pokedex1 = new Pokemon[160];
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
//            pokedex6[n] = pokeApi.getPokemon(n+650);
////            System.out.println(pokedex6[n]);
////            System.out.println();
//        }
//        Pokemon[] pokedex7 = new Pokemon[85];
//        for(int n=0; n <=84; n++)
//        {
//            pokedex7[n] = pokeApi.getPokemon(n+722);
////            System.out.println(pokedex7[n]);
////            System.out.println();
//        }
////        init(pokedex1,pokedex2,pokedex3,pokedex4,pokedex5,pokedex6,pokedex7);
//    }


    public void init(Pokemon[] pokedex1, Pokemon[] pokedex2, Pokemon[] pokedex3, Pokemon[] pokedex4, Pokemon[] pokedex5, Pokemon[] pokedex6, Pokemon[] pokedex7){

        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
//        Example.main();
//        TableRow tbrow0 = new TableRow(this);
//        TextView tv0 = new TextView(this);
//        tv0.setText(" Sl.No ");
//        tv0.setTextColor(Color.WHITE);
//        tbrow0.addView(tv0);
//        TextView tv1 = new TextView(this);
//        tv1.setText(" Product ");
//        tv1.setTextColor(Color.WHITE);
//        tbrow0.addView(tv1);
//        TextView tv2 = new TextView(this);
//        tv2.setText(" Unit Price ");
//        tv2.setTextColor(Color.WHITE);
//        tbrow0.addView(tv2);
//        TextView tv3 = new TextView(this);
//        tv3.setText(" Stock Remaining ");
//        tv3.setTextColor(Color.WHITE);
//        tbrow0.addView(tv3);
//        stk.addView(tbrow0);
        for(int n=0; n <=150; n++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText(pokedex1[n]+ "");
            t1v.setTextColor(Color.WHITE);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
//            TextView t2v = new TextView(this);
//            t2v.setText("Product " + i);
//            t2v.setTextColor(Color.WHITE);
//            t2v.setGravity(Gravity.CENTER);
//            tbrow.addView(t2v);
//            TextView t3v = new TextView(this);
//            t3v.setText("Rs." + i);
//            t3v.setTextColor(Color.WHITE);
//            t3v.setGravity(Gravity.CENTER);
//            tbrow.addView(t3v);
//            TextView t4v = new TextView(this);
//            t4v.setText("" + i * 15 / 32 * 10);
//            t4v.setTextColor(Color.WHITE);
//            t4v.setGravity(Gravity.CENTER);
//            tbrow.addView(t4v);
//            stk.addView(tbrow);
        }
        for(int n=0; n <=99; n++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText(pokedex2[n]+ "");
            t1v.setTextColor(Color.WHITE);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
//            TextView t2v = new TextView(this);
//            t2v.setText("Product " + i);
//            t2v.setTextColor(Color.WHITE);
//            t2v.setGravity(Gravity.CENTER);
//            tbrow.addView(t2v);
//            TextView t3v = new TextView(this);
//            t3v.setText("Rs." + i);
//            t3v.setTextColor(Color.WHITE);
//            t3v.setGravity(Gravity.CENTER);
//            tbrow.addView(t3v);
//            TextView t4v = new TextView(this);
//            t4v.setText("" + i * 15 / 32 * 10);
//            t4v.setTextColor(Color.WHITE);
//            t4v.setGravity(Gravity.CENTER);
//            tbrow.addView(t4v);
//            stk.addView(tbrow);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        dexGen();


    }


}
