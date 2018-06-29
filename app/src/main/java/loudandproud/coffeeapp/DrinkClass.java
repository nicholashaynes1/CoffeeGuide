package loudandproud.coffeeapp;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import loudandproud.coffeeapp.Local.DrinkDao;
import loudandproud.coffeeapp.Local.DrinkDatabase;
import loudandproud.coffeeapp.Model.Drinks;

public class DrinkClass extends Application
{
    private DrinkDatabase drinkDatabase;
    private SharedPreferences sharedPreferences;
    private DrinkDao drinkDao;
    Drinks drinks;

    @Override
    public void onCreate()
    {
        super.onCreate();

        drinks = new Drinks();

        drinkDatabase = Room.databaseBuilder(getApplicationContext(), DrinkDatabase.class, "DrinkTable").build();

        //Checks to see if this was the first time the app was run
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(!sharedPreferences.getBoolean("firstTime", false))
        {
            //The method used to pre-load information into the database.
            setupDatabase();

            //Sets the first time ran to true.
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("firstTime", true);
            editor.apply();
        }

    }

    public DrinkClass()
    {

    }

    private void setupDatabase()
    {
        drinks.setDrinkName("americano");
        drinkDatabase.drinkDao().insertDrink(drinks);
    }
}
