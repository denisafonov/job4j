package ru.job4j.condition;

/**
 * Программа для расчёта расстояния между точками.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        /*
         * координаты по оси x.
         */
        this.x = x;
        /*
         * координаты по оси у.
         */
        this.y = y;
    }
    /**
     * Метод измерения дистанции.
     * @param that точка.
     * @return дистанция.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
    /**
     * Main.
     * @param args user in.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // Вызовем метод.
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
    /*
    * Выведем полученный результат.
    */
        double result = a.distanceTo(b);
        System.out.println(result);
    }
}