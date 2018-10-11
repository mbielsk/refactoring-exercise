package pl.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Collections;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RentalServiceTest {

    @Mock
    private PriceCalculator priceCalculator;
    @Mock
    private LoyaltyPointsCalculator loyaltyPointsCalculator;
    private RentalService rentalService = new RentalService(priceCalculator, loyaltyPointsCalculator);

    @BeforeEach
    public void init() {
        when(priceCalculator.getValueFor(any(MovieType.class), anyInt())).thenReturn(10.0);
    }

    @Test
    public void shouldCalculateTotalStatementValue() {
        Rental rental = new Rental(MovieType.NEW_RELEASE, LocalDate.now());
        Statement statement = rentalService.createStatement(singletonList(rental));
        assertEquals(10.0, statement.getTotalValue());
    }

}
