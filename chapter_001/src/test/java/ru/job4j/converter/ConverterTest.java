package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */

public class ConverterTest {

    /**
     * Test convert ruble to dollar.
     */

    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test convert dollar to ruble.
     */

    @Test
    public void when60DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(60);
        assertThat(result, is(3600));
    }

    /**
     * Test convert ruble to euro.
     */

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test convert euro to ruble.
     */

    @Test
    public void when70EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(70);
        assertThat(result, is(4900));
    }
}