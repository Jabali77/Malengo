package com.vijanaweusi.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MahaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahali);

        RecyclerView list = findViewById(R.id.recycler_view_mahali);

        Mahali[] places = {

                new Mahali("Tanzania", "In order to reached my ultimate goals in the Swahili language, TZ is my top priority of places to visit", R.drawable.tanzania2),
                new Mahali("Kenya", "The Swahili there is is much worse than TZ but  the women though ;)", R.drawable.kenya2),
                new Mahali("Ghana", "Maybe because of my Jamaican roots I have always had connection to this country, but otherwise I don't know why I love Ghana!", R.drawable.ghana2),
                new Mahali("Congo", "Kiswahili na Kilingala vitakuzwe!", R.drawable.congo2),
                new Mahali("India", "After doing a DNA test I confirmed that my Great Grandmother was indeed from India, so now I wan to visit lol", R.drawable.india2),
                new Mahali("Senegal", "This is where 'The Door of No Return' is located. Also I want to see Akon City ", R.drawable.senegal2),
                new Mahali("Dubai", "Don't we all want to go to Dubai lol ", R.drawable.dubai2),
                new Mahali("Yemen", "Not sure why but I want to visit there", R.drawable.yemen2),
                new Mahali("Nigeria", "One of the fastest growing countries on Earth", R.drawable.nigeria2)
        };

        MahaliAdapter adapter = new MahaliAdapter(places);
        list.setAdapter(adapter);
    }
}