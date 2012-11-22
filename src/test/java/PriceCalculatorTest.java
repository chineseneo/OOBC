import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriceCalculatorTest {
    @Test
    public void shouldPriceBe6WhenDistanceIs2()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(2), is(6.0));
    }

    @Test
    public void shouldPriceBe6WhenDistanceIs1(){
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(1.5), is(6.0));
    }

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

    @Test
    public void shouldPriceBe15dot5WhenDistanceIs8AndWaitTimeIs1Minute(){
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(8, 1), is(15.5));
    }

    @Test
    public void shouldPriceBe16WhenDistanceIs8AndWaitTimeIs2Minute(){
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(8, 2), is(16.0));
    }

    @Test
    public void shouldPaymentBe16WhenPriceIs15Dot5(){
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPayment(15.5), is(16L));
    }

    @Test
    public void shouldPaymentBe15WhenPriceIs15Dot4(){
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPayment(15.4), is(15L));
    }

    @Test
    public void shouldPriceBe0WhenDistanceIs0() throws Exception {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getPrice(0), is(0.0));
    }
}
