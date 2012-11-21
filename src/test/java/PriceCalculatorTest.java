import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriceCalculatorTest {
    @Test
    public void shouldPriceBe6WhenDistanceIs2()
    {
        int distance = 2;
        PriceCalculator priceCalculator = new PriceCalculator();

        double expectedPrice = 6;

        assertThat(priceCalculator.getPrice(distance), is(expectedPrice));
    }

//    @Test
//    public void shouldPriceBe6WhenDistanceIs1(){
//        int
//    }

    @Test
    public void shouldPriceBe7Point5WhenDistanceIs3(){

        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(3), is(7.5));
    }

    @Test
    public void shouldPriceBe9WhenDistanceIs4()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(4), is(9.0));
    }

    @Test
    public void shouldPriceBe17Point25WhenDistanceIs9()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(9), is(17.25));
    }

    @Test
    public void shouldPriceBe15WhenDistanceIs8()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(8), is(15.0));
    }

}
