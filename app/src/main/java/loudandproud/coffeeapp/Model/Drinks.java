package loudandproud.coffeeapp.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Drinks")
public class Drinks
{

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "drink_name")
    private String drinkName;

    @ColumnInfo(name = "drink_description")
    private String description;

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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
