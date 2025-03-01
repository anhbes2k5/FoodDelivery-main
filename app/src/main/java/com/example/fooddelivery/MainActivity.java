package com.example.fooddelivery;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fooddelivery.adapters.CategoryAdapter;
import com.example.fooddelivery.adapters.FoodAdapter;
import com.example.fooddelivery.models.Category;
import com.example.fooddelivery.models.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCategories;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo danh sách danh mục
        recyclerViewCategories = findViewById(R.id.recyclerViewCategories);
        recyclerViewCategories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        categoryList = new ArrayList<>();
        categoryList.add(new Category("Fast Food", R.drawable.fast_food));
        categoryList.add(new Category("Asian Cuisine", R.drawable.asian_cuisine));
        categoryList.add(new Category("Desserts", R.drawable.desserts));
        categoryList.add(new Category("Beverages", R.drawable.beverages));

        categoryAdapter = new CategoryAdapter(categoryList);
        recyclerViewCategories.setAdapter(categoryAdapter);

        // Khởi tạo danh sách món ăn
        RecyclerView recyclerViewFoods = findViewById(R.id.recyclerViewFoods);
        recyclerViewFoods.setLayoutManager(new LinearLayoutManager(this));

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Cheese Burger", 5.99, R.drawable.cheese_burger));
        foodList.add(new Food("French Fries", 2.99, R.drawable.french_fries));
        foodList.add(new Food("Bubble Tea", 3.49, R.drawable.bubble_tea));

        FoodAdapter foodAdapter = new FoodAdapter(foodList);
        recyclerViewFoods.setAdapter(foodAdapter);
    }
}
