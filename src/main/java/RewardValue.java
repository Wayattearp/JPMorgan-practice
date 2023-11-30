public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertFromMilesToCash(milesValue);
    }

    private static int convertFromMilesToCash(int milesValue){
        return (int) (milesValue * 0.0035);
    }

        private static int convertFromCashToMiles(double cashValue){
        return (int) (cashValue / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertFromCashToMiles(this.cashValue);
    }
}
