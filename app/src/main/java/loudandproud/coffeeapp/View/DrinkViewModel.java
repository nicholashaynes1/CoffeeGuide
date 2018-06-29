package loudandproud.coffeeapp.View;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import java.util.List;

import loudandproud.coffeeapp.Local.DrinkRepository;
import loudandproud.coffeeapp.Model.Drinks;

public class DrinkViewModel extends AndroidViewModel
{
    private DrinkRepository drinkRepository;
    private List<Drinks> allDrinks;

    public DrinkViewModel(Application application)
    {
        super(application);
//        https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#8 number 4
    }
}
