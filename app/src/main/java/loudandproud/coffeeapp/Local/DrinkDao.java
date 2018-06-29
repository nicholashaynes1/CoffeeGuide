package loudandproud.coffeeapp.Local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import loudandproud.coffeeapp.Model.Drinks;
import java.util.List;

@Dao
public interface DrinkDao
{
    @Query("SELECT * FROM DrinksTable")
    List<Drinks> getAll();

    @Query("SELECT * FROM DrinksTable WHERE drink_name LIKE :drinkName LIMIT 1")
    Drinks findByName(String drinkName);

    @Insert
    void insertDrink(Drinks drinks);

    @Query("DELETE FROM DrinksTable")
    void deleteAll();

}
