package loudandproud.coffeeapp;

import android.arch.persistence.room.Room;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import loudandproud.coffeeapp.Local.DrinkDao;
import loudandproud.coffeeapp.Local.DrinkDatabase;
import loudandproud.coffeeapp.Model.Drinks;
import loudandproud.coffeeapp.Model.PopulateDrinksClass;


public class MainActivity extends AppCompatActivity
{
    private EditText searchBar;
    private TextView suggestionText1;

    //The string used to hold the drinks typed in the search bar.
    private String drinkTyped="";
    private ConstraintLayout background;
    private DrinkClass drinkClass;

    //The drinks database
    private DrinkDatabase db;
    private PopulateDrinksClass populateDrinksClass;
    private Drinks drinks;
    private DrinkDao drinkDao;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Finds the search bar, and sets its colors
        searchBar = findViewById(R.id.SearchBar);
        searchBar.setHintTextColor(Color.parseColor("#FFFFFF"));
        searchBar.setTextColor(Color.parseColor("#FFFFFF"));

        //The edit texts that holds suggestions for drinks
        suggestionText1 = findViewById(R.id.SuggestionTextView1);

        //The background layout
        background = findViewById(R.id.Bg);

        //The drinks class object
        drinkClass = new DrinkClass();

        //Builds the database used to hold drinks and drinks descriptions
        db = Room.databaseBuilder(getApplicationContext(), DrinkDatabase.class, "DrinkDatabase").build();
        drinks = new Drinks();

        setupTextWatcher();
    }

    private void setupTextWatcher()
    {
        searchBar.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {

            }

            //The method to update the drinks typed.
            @Override
            public void onTextChanged(CharSequence updatedText, int i, int i1, int i2)
            {
                getAllDrinks();
            }

            @Override
            public void afterTextChanged(Editable editable)
            {

            }
        });
    }

    public void getAllDrinks()
    {
        //Multi threading for running database stuff.
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {

            }
        }).start();

    }

    public String getDrinkTyped()
    {
        return drinkTyped;
    }

    public void setDrinkTyped(String drinkTyped)
    {
        this.drinkTyped = drinkTyped;
    }
}
