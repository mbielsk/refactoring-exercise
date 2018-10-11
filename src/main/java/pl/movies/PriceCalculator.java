package pl.movies;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PriceCalculator {

    private double initialCost;
    private double costPerDay;
    private int freeRentalPeriodInDays;

    public double getValueFor(int periodInDays) {
        return initialCost + getValueForPaidDays(periodInDays);
    }

    private double getValueForPaidDays(int periodInDays) {
        return (periodInDays - freeRentalPeriodInDays) * costPerDay;
    }

}
