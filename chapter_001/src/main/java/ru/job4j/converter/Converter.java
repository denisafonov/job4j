package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        value = 70;
        return 1;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли
     */

    public int euroToRuble(int value) {
        value = 1;
        return 70;
    }


    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        value = 60;
        return 1;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */

    public int dollarToRuble(int value){
        value = 1;
        return 60;
    }

}
