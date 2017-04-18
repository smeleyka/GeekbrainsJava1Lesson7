package lesson7;

import lesson7.*;
/**
 * Created by smeleyka on 17.04.17.
 */
public class Main {

    static Cat[] arrCat;
    static Plate plate;

    public static void main(String[] args) {
        plate = new Plate(100,300);
        arrCat = new Cat[4];
        arrCat[0]= new Cat("Мурзик");
        arrCat[1]= new Cat("Барсик");
        arrCat[2]= new Cat("Снежок");
        arrCat[3]= new Cat("Рыжик");

        infoArrCat();
        feedArrCat();

    }
    public static void infoArrCat() {//инфо о котах в массиве
        for (int i = 0; i < arrCat.length; i++) {
            arrCat[i].info();
        }
    }
    public static void feedArrCat() {//покормить котов в массиве
        for (int i = 0; i < arrCat.length; i++) {
            arrCat[i].eat(plate);
        }
    }
}
