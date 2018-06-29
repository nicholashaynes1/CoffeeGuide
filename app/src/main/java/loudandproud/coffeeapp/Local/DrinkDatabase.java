package loudandproud.coffeeapp.Local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import loudandproud.coffeeapp.Model.Drinks;

@Database(entities = {Drinks.class}, version = 1, exportSchema = false)
public abstract class DrinkDatabase extends RoomDatabase
{
    private static DrinkDatabase INSTANCE;

    public abstract DrinkDao drinkDao();


}
