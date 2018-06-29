package loudandproud.coffeeapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import loudandproud.coffeeapp.Model.DrinkClass;
import loudandproud.coffeeapp.R;

public class MainActivity extends AppCompatActivity
{
    private EditText searchBar;
    private TextView suggestionText1;

    //The string used to hold the drink typed in the search bar.
    private String drinkTyped="";
    private ConstraintLayout background;
    private DrinkClass drinkClass;

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

        //The drink class object
        drinkClass = new DrinkClass();

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

            //The method to update the drink typed.
            @Override
            public void onTextChanged(CharSequence updatedText, int i, int i1, int i2)
            {

//                drinkTyped = updatedText.toString().toLowerCase();
//                drinkClass.checkDrinkSuggestions(drinkTyped);
//                suggestionText1.setText("Search for "+drinkClass.getSugDrink1());
//                setDrinkTyped(drinkTyped);
//                if(updatedText.length()== 0)
//                {
//                    suggestionText1.setText("");
//                }

            }

            @Override
            public void afterTextChanged(Editable editable)
            {

            }
        });
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
