package loudandproud.coffeeapp.Model;

import loudandproud.coffeeapp.MainActivity;


public class DrinkClass
{

    //The array that holds the drinks
    private static String[] drinksArray;

    //The MainActivity Object
    private MainActivity mainActivity;

    //Strings that hold the suggested drink text
    private String sugDrink1 ="";


    public DrinkClass()
    {
        //The array that holds all the drinks.
        drinksArray = new String[]{"cappuccino", "americano","mocha", "Coco"};
        mainActivity = new MainActivity();

    }

    public void checkDrinkSuggestions(String drinkTyped)
    {

        //Loops through the array of drinks
        for(String drink:drinksArray)
        {
            //Loops through the length of the drink typed
            for(int i = 0;i <drinkTyped.length(); i++)
            {
                //Checks to make sure the only drinks being evaluated are the possible suggestion
                if(drink.contains(drinkTyped))
                {
                    if(drinkTyped.charAt(i) == drink.charAt(i))
                    {
                        setSugDrink1(drink);
                    }
                }
            }

        }

    }


    public String getSugDrink1()
    {
        return sugDrink1;
    }

    public void setSugDrink1(String sugDrink1)
    {
        this.sugDrink1 = sugDrink1;
    }

    public static String[] getDrinksArray()
    {
        return drinksArray;
    }

}
