package lesson7;

/**
 * Created by smeleyka on 17.04.17.
 */
public class Plate {
    int mealInPlate;
    int plateCapacity;
    int mealInStock;


    public Plate(int meal, int mealInStock) {
        this.mealInPlate = meal;
        this.mealInStock = mealInStock;
        this.plateCapacity = meal;
    }

    public void info(){
        System.out.println("В тарелке "+mealInPlate+", на складе "+mealInStock);
    }

    public boolean removeFood (int amount){
        if (amount > mealInPlate) return false;
        mealInPlate -= amount;
        return true;
    }
    public boolean addMeal() {
        int needToFull = plateCapacity - mealInPlate;
        if (mealInStock > 0) {
            if (mealInStock >= needToFull) {
                mealInStock = mealInStock - needToFull;
                mealInPlate = plateCapacity;
                System.out.println("Миска наполнена. На складе осталось " + mealInStock);
                return true;

            }
        }
        System.out.println("На складе еды нет.");
    }
}