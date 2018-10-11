package pl.movies;

public class PriceCalculator {

    public double getValueFor(MovieType movieType, int periodInDays) {
        return movieType.getInitialCost() + getValueForPaidDays(movieType, periodInDays);
    }

    private double getValueForPaidDays(MovieType movieType, int periodInDays) {
        return (periodInDays - movieType.getFreeRentalPeriodInDays()) * movieType.getCostPerDay();
    }

}
