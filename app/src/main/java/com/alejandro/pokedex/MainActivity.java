package com.alejandro.pokedex;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;




import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;
import me.sargunvohra.lib.pokekotlin.model.Type;


public class MainActivity extends AppCompatActivity {


    public void init(){
        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        for(int i = 1; i <= 7; i++) {
            TableRow tbrow0 = new TableRow(this);
            TextView t0v = new TextView(this);
            t0v.setText("Generation " + i);
            t0v.setTextColor(Color.WHITE);
            t0v.setTextSize(40);
            t0v.setGravity(Gravity.CENTER);
            tbrow0.addView(t0v);
            stk.addView(tbrow0);
            TableRow tbrow1 = new TableRow(this);
            TextView tv0 = new TextView(this);
            tv0.setText(" Pokemon");
            tv0.setTextColor(Color.WHITE);
            tbrow1.addView(tv0);
            TextView tv2 = new TextView(this);
            tv2.setText(" Dex Number ");
            tv2.setTextColor(Color.WHITE);
            tbrow1.addView(tv2);
            TextView tv3 = new TextView(this);
            tv3.setText("     ");
            tv3.setTextColor(Color.WHITE);
            tbrow1.addView(tv3);
            stk.addView(tbrow1);
            Pokemon[] pokeList= Example.getDex(i);
            for (int n = 0; n < pokeList.length; n++) {
                TableRow tbrow = new TableRow(this);
                TextView t1v = new TextView(this);
                t1v.setPadding(25, 2, 0, 23);
                t1v.setText(pokeList[n].getName().substring(0, 1).toUpperCase() + pokeList[n].getName().substring(1).toLowerCase());
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.LEFT);
                tbrow.addView(t1v);
                TextView t2v = new TextView(this);
                t2v.setText("Dex#: " + pokeList[n].getId());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.LEFT);
                tbrow.addView(t2v);
//                Image I3v = pokeList[n].getSprites().getFrontDefault();
//                I3v.
//                t3v.setTextColor(Color.WHITE);
//                t3v.setGravity(Gravity.CENTER);
//                tbrow.addView(t3v);
                stk.addView(tbrow);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new
                StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
