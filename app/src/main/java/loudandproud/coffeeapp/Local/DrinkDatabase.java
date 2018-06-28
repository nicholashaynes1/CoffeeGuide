package loudandproud.coffeeapp.Local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import loudandproud.coffeeapp.Model.Drinks;

@Database(entities = {Drinks.class}, version = 1, exportSchema = false)
public abstract class DrinkDatabase extends RoomDatabase
{
    public abstract DrinkDao drinkDao();
}
