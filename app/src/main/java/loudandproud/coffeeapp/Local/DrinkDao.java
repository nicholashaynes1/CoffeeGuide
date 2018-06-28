package loudandproud.coffeeapp.Local;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.database.Cursor;

import loudandproud.coffeeapp.Model.Drinks;

import java.util.List;

@Dao
public interface DrinkDao
{
    @Query("SELECT * FROM drinks")
    Cursor getAll();

    @Query("SELECT * FROM drinks WHERE drink_name LIKE :drinkName")
    Drinks findByName(String drinkName);

    @Insert
    void insertDrink(Drinks... drinks);

    @Query("DELETE from drinks")
    void deleteAll();

}
