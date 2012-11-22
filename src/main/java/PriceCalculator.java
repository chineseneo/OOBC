public class PriceCalculator {

    private double extraPriceRatio = 0.5;
    private double unitPrice = 1.5;
    private double basicPrice = 6.0;
    private double unitTimePrice = 0.5;

    private int baseExtraDistance = 8;
    private int baseDistance = 2;

    public Double getPrice(double distance, double waitTime) {
        if (distance <= 0)
            return 0.0;
        return basicPrice + extraPrice(distance) + moreExtraPrice(distance) + unitTimePrice * waitTime;
    }

    public Double getPrice(double distance) {
        if (distance <= 0)
            return 0.0;
        return basicPrice + extraPrice(distance) + moreExtraPrice(distance);
    }

    private double moreExtraPrice(double distance) {
        if (distance <= baseExtraDistance)
            return 0.0;
        return (distance - baseExtraDistance) * extraUnitPrice();
    }

    private double extraPrice(double distance) {
        if (distance <= baseDistance)
            return 0.0;
        return (distance - baseDistance) * unitPrice;
    }

    private double extraUnitPrice() {
        return unitPrice * extraPriceRatio;
    }


    public long getPayment(double price) {
        return Math.round(price);
    }

}
