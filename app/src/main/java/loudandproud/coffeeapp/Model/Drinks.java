package loudandproud.coffeeapp.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Drinks
{

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "drink_name")
    private String drinkName;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDrinkName()
    {
        return drinkName;
    }

    public void setDrinkName(String drinkName)
    {
        this.drinkName = drinkName;
    }

}
