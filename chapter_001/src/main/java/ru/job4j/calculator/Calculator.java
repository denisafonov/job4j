package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Denis Safonov (desafono@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Calculator {
    /**
     * Add - метод сложения.
     * @param first - первая переменная
     * @param second - вторая переменная
     * @return - итог
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * Subtract - метод вычитания.
     * @param first - первая переменная
     * @param second - вторая переменная
     * @return - итог
     */
    public double subtract(double first, double second) {
        return first - second;
    }
    /**
     * Divide - метод деления.
     * @param first - первая переменная
     * @param second - вторая переменная
     * @return - итог
     */
    public double div(double first, double second) {
        return first / second;
    }
    /**
     * Multiple - метод умножения.
     * @param first - первая переменная
     * @param second - вторая переменная
     * @return - итог
     */
    public double miltiple(double first, double second){
        return first * second;
    }
}