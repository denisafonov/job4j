package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Denis Safonov (desafono@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 
public class Calculate {
	/**
	*Main - метод для вывода на консоль Not Hello World.
	*@param args - arg.
	*/
	public static void main(String[] args) {
		System.out.println("Not Hello World");
	
	}
	
	/**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}