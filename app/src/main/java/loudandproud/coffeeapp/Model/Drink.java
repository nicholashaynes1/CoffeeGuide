package loudandproud.coffeeapp.Model;

public class Drink
{
//    holds the drink name
    private String drinkName;
//    Holds the drink description
    private String drinkDesc;
//    Holds the drinks Ingredients
    private String drinkIngr;

    public Drink(String drinkName, String drinkDesc, String drinkIngr)
    {
        this.drinkName = drinkName;
        this.drinkDesc = drinkDesc;
        this.drinkIngr = drinkIngr;
    }


    public String getDrinkName()
    {
        return drinkName;
    }

    public void setDrinkName(String drinkName)
    {
        this.drinkName = drinkName;
    }

    public String getDrinkDesc()
    {
        return drinkDesc;
    }

    public void setDrinkDesc(String drinkDesc)
    {
        this.drinkDesc = drinkDesc;
    }

    public String getDrinkIngr()
    {
        return drinkIngr;
    }

    public void setDrinkIngr(String drinkIngr)
    {
        this.drinkIngr = drinkIngr;
    }

}
