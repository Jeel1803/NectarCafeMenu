package com.jack.cafe;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import static com.jack.cafe.Selection.*;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class list_categories extends AppCompatActivity {
    String select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_categories);

        Intent intent = getIntent();

        select = intent.getStringExtra("category");

        if(select.equals("onPlates")){
            showonPlatesOptions();
            getSupportActionBar().setTitle("On Plates Options");
        }

        if(select.equals("milkshakes")){
            showmilkshakesOptions();
            getSupportActionBar().setTitle("Milkshakes Options");
        }

        if(select.equals("smoothies")){
            showSmoothiesOption();
            getSupportActionBar().setTitle("Smoothies Options");
        }

    }

    private void showonPlatesOptions() {
        final ArrayList<Selection> selectionOnPlate = new ArrayList<Selection>();
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));
        selectionOnPlate.add(new Selection("Auckland Sky Tower", "Federal Street, City Center", R.string.dish1, R.drawable.done));


        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, selectionOnPlate);

        ListView listView = findViewById(R.id.dishesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Selection attraction = selectionOnPlate.get(position);
                Intent i = new Intent(getBaseContext(), details.class);
                i.putExtra("name",attraction.getName());
                i.putExtra("image",attraction.getImage());
                i.putExtra("info", attraction.getDescription());
                startActivity(i);
            }
        });
    }

    private void showmilkshakesOptions() {
    }

    private void showSmoothiesOption() {
    }

}
