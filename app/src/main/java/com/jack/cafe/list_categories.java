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

        if(select.equals("bevrages")){
            showBevragesOption();
            getSupportActionBar().setTitle("Bevrages Options");
        }

    }

    
    private void showonPlatesOptions() {
        final ArrayList<Selection> selectionOnPlate = new ArrayList<Selection>();
        selectionOnPlate.add(new Selection("Free- Range Eggs on Toast ", "Cooked any style, Served on Mixed Grain or Organic Toasted Sourdough with Butter and our own Nectar Relish (V)(GF)", R.string.egg_toast, R.drawable.egg_toast));
            selectionOnPlate.add(new Selection("Organic  Quinoa Porridge", "Topped with Pumpkin Seeds, Pineapple, Berry Compote &Coconut Flakes (VGN) (GF) (DF)", R.string.white_quinoa, R.drawable.white_quinoa));
        selectionOnPlate.add(new Selection("Oats Porridge ", "Cooked in Organic Milk Served with Banana & Drizzled Honey", R.string.oats_porridge, R.drawable.oats_porridge));
        selectionOnPlate.add(new Selection("Eggs Benedict ", "Free Range Eggs with Baby Spinach, topped with fresh Hollandaise & Served on Toasted Sourdough (GF Opt. Avail)", R.string.egg_benedict, R.drawable.egg_benedict));
        selectionOnPlate.add(new Selection("Toasted Bagels ", "Served with Nectar’s Strawberry Jam and Butter", R.string.toast_bagels, R.drawable.toast_bagels));
        selectionOnPlate.add(new Selection("Turkish Baked Eggs ", "Free Range Eggs served Poached In Organic Green Lentils & Red Quinoa with Organic Sourdough and Cream Cheese (V or GF Opt. Avail)", R.string.turkish_baked_egg, R.drawable.turkish_baked_egg));
        selectionOnPlate.add(new Selection("Nectar Classic Corn Fritters ", "With Zucchini and Cheddar, served with Free Range Poached Egg, Sour Cream, Baby Spinach and Red Pesto", R.string.corn_fritters, R.drawable.corn_fritters));
        selectionOnPlate.add(new Selection("Toasted Sandwich", "Ham, Cheese & Tomato / Chicken, Cheese & Tomato / Mushroom, Cheese & Tomato with Cream Cheese & Mesclun (Pineapple$2.00opt.)", R.string.toasted_sandwich, R.drawable.toasted_sandwich));
        selectionOnPlate.add(new Selection("Nectar’s Chocolate Waffles ", "With mixed Berries Compote Dark Chocolate Ice Cream, Garnished with Chocolate Ghana and topped with Vanilla Bean Cream", R.string.chocolate_waffle, R.drawable.chocolate_waffle));
        selectionOnPlate.add(new Selection("Nectar Brioche Burgers Beef ", "Beetroot or Peri- Peri Chicken with Fries", R.string.burger, R.drawable.burger));


        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, selectionOnPlate);

        ListView listView = findViewById(R.id.dishesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Selection selection = selectionOnPlate.get(position);
                Intent i = new Intent(getBaseContext(),details.class);
                i.putExtra("name",selection.getName());
                i.putExtra("image",selection.getImage());
                i.putExtra("info", selection.getDescription());
                startActivity(i);
            }
        });
    }

    private void showmilkshakesOptions() {
        final ArrayList<Selection> selectionMilkshake = new ArrayList<Selection>();
        selectionMilkshake.add(new Selection("Chocolate Protien Shake", "Thick and delicious protein chocolate shake", R.string.chocolate_shake, R.drawable.chocolate_shake));
        selectionMilkshake.add(new Selection("Peanut Butter Brownie Milkshake", "Thick and delicious peanut butter and brownie milk shake", R.string.peanut_shake, R.drawable.peanut_shake));
        selectionMilkshake.add(new Selection("Strawberry Shortcake Milkshake ", "A good old-fashioned strawberry milkshake", R.string.strawberry_shake, R.drawable.strawberry_shake));
        selectionMilkshake.add(new Selection("Mango Shake ", "Refreshing Mango Shake", R.string.mango_shake, R.drawable.mango_shake));
        selectionMilkshake.add(new Selection("Milk and Honey Banana Shake ", "Sweet and luscious Banana and honey milkshake", R.string.milk_honey_shake, R.drawable.milk_honey_shake));
        selectionMilkshake.add(new Selection("Vanilla Milkshakes", "A truly singular sensation-Classic Vanilla Milkshake", R.string.vanilla_shake, R.drawable.vanilla_shake));
        selectionMilkshake.add(new Selection("Chocolate and Caramel ", "Thick and delicious chocolate shake with caramel", R.string.chocolate_caremel_shake, R.drawable.chocolate_caremel_shake));
        selectionMilkshake.add(new Selection("Avocado Shake", "Original and healthy avocado shake", R.string.avocado_shake, R.drawable.avocado_shake));
        selectionMilkshake.add(new Selection("Oreo Shake", "Milkshake made with vanilla ice cream, milk, and Oreo cookies!", R.string.oreo_shake, R.drawable.oreo_shake));
        selectionMilkshake.add(new Selection("Kiwi Milk Shake ", "Healthy shake made with fresh Kiwis", R.string.kiwi_shake, R.drawable.kiwi_shake));


        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, selectionMilkshake);

        ListView listView = findViewById(R.id.dishesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Selection selection = selectionMilkshake.get(position);
                Intent i = new Intent(getBaseContext(),details.class);
                i.putExtra("name",selection.getName());
                i.putExtra("image",selection.getImage());
                i.putExtra("info", selection.getDescription());
                startActivity(i);
            }
        });
        
    }

    private void showSmoothiesOption() {
        final ArrayList<Selection> selectionSmoothies = new ArrayList<Selection>();
        selectionSmoothies.add(new Selection("Coco Protein Smoothie", "Our protein-packed smoothie with great taste.",R.string.coco_protien, R.drawable.coco_protien));
        selectionSmoothies.add(new Selection("Berry Vitamin Smoothie", "High in Antioxidant Berry Blaze!", R.string.berry_smoothie, R.drawable.berry_smoothie));
        selectionSmoothies.add(new Selection("Vitamin C Smoothie", "Contains Pineapple, Coconut, Vitamin C and LSA", R.string.vitamin_c_smoothie, R.drawable.vitamin_c_smoothie));
        selectionSmoothies.add(new Selection("Blueberry Spirulina", "Health benefits of Spirulina added to your morning smoothie.", R.string.blueberry_smoothie, R.drawable.blueberry_smoothie));
        selectionSmoothies.add(new Selection("Mango Coconut and Lime Smoothie", "Delicious, refreshing, naturally sweet!", R.string.mango_coconut_smoothie, R.drawable.mango_coconut_smoothie));
        selectionSmoothies.add(new Selection("Banana Berry Smoothie", "Our healthy and tasty Banana–Berry Smoothie", R.string.banana_berry_smoothie, R.drawable.banana_berry_smoothie));
        selectionSmoothies.add(new Selection("Calming Smoothie", "Our protein-packed smoothie with great taste.", R.string.calming_smoothie, R.drawable.calming_smoothie));
        selectionSmoothies.add(new Selection("Immune Smoothie", "This sweet-tart smoothie is packed with nutrient rich, immune boosting ingredients.", R.string.immune_smoothie, R.drawable.immune_smoothie));
        selectionSmoothies.add(new Selection("Cleansing Smoothie", "Reset your appetite & eating habits and detox with our food based smoothie cleanse!", R.string.cleanising_smoothie, R.drawable.cleanising_smoothie));
        selectionSmoothies.add(new Selection("Complete Smoothie", "Reset your appetite & eating habits and detox with our food based smoothie cleanse!", R.string.complete_smoothie, R.drawable.complete_smoothie));


        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, selectionSmoothies);

        ListView listView = findViewById(R.id.dishesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Selection selection = selectionSmoothies.get(position);
                Intent i = new Intent(getBaseContext(),details.class);
                i.putExtra("name",selection.getName());
                i.putExtra("image",selection.getImage());
                i.putExtra("info", selection.getDescription());
                startActivity(i);
            }
        });
    }

    private void showBevragesOption() {
        final ArrayList<Selection> selectionBevrages = new ArrayList<Selection>();
        selectionBevrages.add(new Selection("Cafe Latte", "Fresh brewed coffee and steamed milk", R.string.latte_coffee, R.drawable.latte_coffee));
        selectionBevrages.add(new Selection("Mocha", "Bittersweet Mocha sauce and steamed milk", R.string.mocha_coffee, R.drawable.mocha_coffee));
        selectionBevrages.add(new Selection("Flat White", "Fresh brewed coffee and creamy steamed milk", R.string.flate_white_coffee, R.drawable.flate_white_coffee));
        selectionBevrages.add(new Selection("Cappucino", "Fresh brewed coffee and steamed milk with chocolate powder", R.string.cappuccino_coffee, R.drawable.cappuccino_coffee));
        selectionBevrages.add(new Selection("Hot Chocolate", "Chocolate powder and steamed milk with marshmallow", R.string.hot_chocolate, R.drawable.hot_chocolate));
        selectionBevrages.add(new Selection("Americano", "Double shot espresso", R.string.americano_coffee, R.drawable.americano_coffee));
        selectionBevrages.add(new Selection("Short Black", "Single shot espresso", R.string.short_black_coffee, R.drawable.short_black_coffee));
        selectionBevrages.add(new Selection("Chai Latte", "Bittersweet chai sauce and steamed milk", R.string.chai_latte_coffee, R.drawable.chai_latte_coffee));
        selectionBevrages.add(new Selection("Indian Tea", "Tea made in creamy milk with ginger, mint and chai masala", R.string.indian_tea, R.drawable.indian_tea));
        selectionBevrages.add(new Selection("Green Tea", "Tea made from Camellia sinensis leaves and buds", R.string.green_tea, R.drawable.green_tea));


        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, selectionBevrages);

        ListView listView = findViewById(R.id.dishesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Selection selection = selectionBevrages.get(position);
                Intent i = new Intent(getBaseContext(),details.class);
                i.putExtra("name",selection.getName());
                i.putExtra("image",selection.getImage());
                i.putExtra("info", selection.getDescription());
                startActivity(i);
            }
        });
    }
    


}
