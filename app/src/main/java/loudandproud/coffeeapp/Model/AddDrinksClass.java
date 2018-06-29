package loudandproud.coffeeapp.Model;

import java.util.ArrayList;
import java.util.List;

public class AddDrinksClass
{
//  A reference to my drink class
    private Drink drink;
//  A list that holds all the drinks
    private final List<Drink> drinkList;


    public AddDrinksClass()
    {
//      The array that holds all of the drinks
        drinkList = new ArrayList<Drink>();

//      A method that populates the list
        populateList();
    }

    private void populateList()
    {
//      Adding an americano to my drink list.
        drink = new Drink("Americano"," ","Water & espresso");
        drink.setDrinkDesc("A hot or iced drink that consists of any amount of espresso shots and hot water");
        drinkList.add(drink);

    }

    public List<Drink> getDrinkList()
    {
        return drinkList;
    }

}
