package pl.movies;

public class LoyaltyPointsCalculator {

    private static final int DEFAULT_POINTS = 1;
    private static final int EXTRA_POINTS = 1;
    private static final int EXTRA_POINTS_PERIOD_IN_DAYS = 2;

    public int getPoints(boolean isNewRelease, int periodInDays) {
        return isExtraScored(isNewRelease, periodInDays) ? DEFAULT_POINTS + EXTRA_POINTS : DEFAULT_POINTS;
    }

    private boolean isExtraScored(boolean isNewRelease, int periodInDays) {
        return isNewRelease && periodInDays >= EXTRA_POINTS_PERIOD_IN_DAYS;
    }

}
