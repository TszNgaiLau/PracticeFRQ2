public class StepTracker {

    private int min;
    private int activeDays;
    private int totalSteps;
    private int days;


    public StepTracker(int min) {
        this.min = min;
    }

    public void addDailySteps(int add) {
		if (add >= min) {
        activeDays++;
    }
    totalSteps += add;
    days++;
}

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (days == 0) {
            return 0.0;
        }
        return (double) totalSteps / days;
    }
}
