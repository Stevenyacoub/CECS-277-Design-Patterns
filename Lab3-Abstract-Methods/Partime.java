public class Partime extends Staff{
    private int weeklyHourTotal;

    //default constructor
    public Partime(){
        super();
        this.weeklyHourTotal = 0;
    }

    //argument constructor
    public Partime(String last, String first, String IDNumber, double hourlyRate, int weeklyHourTotal) {
        super(last, first, IDNumber, hourlyRate);
        setWeeklyHourTotal(weeklyHourTotal);
    }

    /**
     * @return an int representing the total hours
     * this part-timer worked in a week
     */
    public int getWeeklyHourTotal() {
        return weeklyHourTotal;
    }

    /**
     * Change's this partime's weekly
     * hour total to
     * @param an int representing the total hours
     * this part-timer worked in a week
     */
    public void setWeeklyHourTotal(int weeklyHourTotal) {
        this.weeklyHourTotal = weeklyHourTotal;
    }

    /**
     * Required abstract method that
     * returns this Staff object's 
     * monthly earning
     * @return a double representing the
     * monthly earning
     */
    public double monthlyEarning() {
        return getHourlyRate()*(weeklyHourTotal*4);
    }

    public String toString() {
        return "ID Employee Number: " + getIDNumber() + "\nEmployee Name: " +
                getFirstName() + " " + getLastName() + "\nHours Works Per Month: " +
                weeklyHourTotal + "\nMonthly Salary: " + monthlyEarning();
    }
}
