package loudandproud.coffeeapp;

import android.app.Application;
import android.arch.persistence.room.Room;

import loudandproud.coffeeapp.Local.DrinkDatabase;

public class DrinkClass extends Application
{
    private DrinkDatabase drinkDatabase;


    @Override
    public void onCreate()
    {
        super.onCreate();

        drinkDatabase = Room.databaseBuilder(getApplicationContext(), DrinkDatabase.class, "DrinkTable").build();

    }

    public DrinkClass()
    {

    }
}
