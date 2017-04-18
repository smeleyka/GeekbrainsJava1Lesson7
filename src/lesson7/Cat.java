package lesson7;

/**
 * Created by smeleyka on 17.04.17.
 */
public class Cat {
    String name;
    boolean notHungry;
    int appetite;

    public Cat(String name) {
        this.appetite = 30+ (int) (Math.random()*70)+1;
        this.name = name;
        this.notHungry = false;
    }

    public void info() {
        System.out.println(name + ": сытость = "+notHungry+", аппетит = "+appetite);
    }

    public void eat(Plate plate) {
        if (notHungry) System.out.println(name + " не голоден.");
        else if (plate.removeFood(appetite)) {
            System.out.print(name + " покушал. ");
            plate.info();
            notHungry = true;
        }
        else {
            System.out.print(name + "у не хватило еды. ");
            plate.info();
        }
    }
}
