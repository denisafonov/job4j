package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */

public class Fit {
    /**
     * Цифра для вычитания у мужчик.
     */
    static final double men = 100;
    /**
     * Цифра для вычитания у женщин.
     */
    static final double woman = 110;
    /**
     * Формула.
    */
    static final double a = 1.15;

     /**
      * Идеальный вес для мужщины.
      * @param height Рост.
      * @return идеальный вес.
      */
     public final double manWeight(double height) {
         return (height - men) * a;
     }

     /**
      * Идеальный вес для женщины.
      * @param height Рост.
      * @return идеальный вес.
      */
     public final double womanWeight(double height) {
         return (height - woman) * a;
     }
}