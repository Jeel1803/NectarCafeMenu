package com.jack.cafe;



import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOnPlates(View view) {
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "onPlates");
        startActivity(categoryListActivity);
    }
    public void onClickMilkshakes(View view) {
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "milkshakes");
        startActivity(categoryListActivity);

    }
    public void onClickSmoothies(View view) {
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "smoothies");
        startActivity(categoryListActivity);
    }

    public void onClickBeverage(View view) {
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "bevrages");
        startActivity(categoryListActivity);
    }
}