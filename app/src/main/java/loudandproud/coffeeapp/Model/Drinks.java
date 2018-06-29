package loudandproud.coffeeapp.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "DrinksTable")
public class Drinks
{

    @PrimaryKey()
    @NonNull()
    @ColumnInfo(name = "drink_name")
    private String drinkName;

    public String getDrinkName()
    {
        return drinkName;
    }

    public void setDrinkName(String drinkName)
    {
        this.drinkName = drinkName;
    }

}
