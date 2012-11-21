public class PriceCalculator {
    public Double getPrice(int distance) {
        double basicPrice = 6.0;
        double additionalPrice = 0.0;

        double extraPrice = (distance - 2) * 1.5;
        if (distance == 3){
            additionalPrice = extraPrice;
        }
        else if (distance == 4) {
            additionalPrice = extraPrice;

        }
        else if (distance == 9) {
            additionalPrice = 11.25;

        }
        else if (distance == 8) {
            additionalPrice = extraPrice;

        }

        return basicPrice + additionalPrice;
    }
}
