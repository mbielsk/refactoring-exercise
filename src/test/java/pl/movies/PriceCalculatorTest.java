package pl.movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceCalculatorTest {

    private static final int  PERIOD_IN_DAYS = 6;

    private PriceCalculator priceCalculator = new PriceCalculator(2, 1.5, 2);

    @Test
    public void shouldCalculateRegularMoviePrice() {
        double price = priceCalculator.getValueFor(PERIOD_IN_DAYS);
        assertEquals(8.0, price);
    }

}
