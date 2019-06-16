package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */

public class Fit {
    /**
     * Цифра для вычитания у мужчик.
     */
    double men = 100;
    /**
     * Цифра для вычитания у женщин.
     */
    double woman = 110;
    /**
     * Формула.
    */
    double a = 1.15;

     /**
      * Идеальный вес для мужщины.
      * @param height Рост.
      * @return идеальный вес.
      */
     public double manWeight(double height) {
         return (height - men) * a;
     }

     /**
      * Идеальный вес для женщины.
      * @param height Рост.
      * @return идеальный вес.
      */
     public double womanWeight(double height) {
         return (height - woman) * a;
     }
}