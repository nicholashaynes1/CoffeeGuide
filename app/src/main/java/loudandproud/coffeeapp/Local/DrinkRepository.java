package loudandproud.coffeeapp.Local;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import loudandproud.coffeeapp.Model.Drinks;

public class DrinkRepository
{
    private DrinkDao drinkDao;
    private List<Drinks> allDrinks;


    public DrinkRepository(Application application)
    {
       DrinkDatabase database = DrinkDatabase.getDatabase(application);

       drinkDao = database.drinkDao();
       allDrinks = drinkDao.getAll();
    }

    List<Drinks> getAllDrinks()
    {
        return allDrinks;
    }

    public void insert(Drinks drink)
    {
        new insertAsyncTask(drinkDao).execute(drink);
    }

    private static class insertAsyncTask extends AsyncTask<Drinks, Void, Void>
    {
        private DrinkDao asyncDrinkTaskDao;

        insertAsyncTask(DrinkDao drinkDao)
        {
            asyncDrinkTaskDao = drinkDao;
        }

        @Override
        protected Void doInBackground(final Drinks... drinks)
        {
            asyncDrinkTaskDao.insertDrink(drinks[0]);
            return null;
        }
    }


}
