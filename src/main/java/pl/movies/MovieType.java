package pl.movies;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MovieType {

    REGULAR(2, 2, 1.5), CHILDREN(3, 1.5, 1.5), NEW_RELEASE(0, 0, 3);

    private int freeRentalPeriodInDays;
    private double initialCost;
    private double costPerDay;

}
