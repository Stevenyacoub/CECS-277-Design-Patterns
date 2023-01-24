public class Staff extends Employee {
    private double hourlyRate;

    //Default constructor
    public Staff(){
        hourlyRate = 10;
    }

    //Argument constructors
    public Staff(double rate){
        this.hourlyRate = rate;
    }
    public Staff(String last, String first, String IDNumber, double hourlyRate) {
        super(last, first, IDNumber);
        setHourlyRate(hourlyRate);
    }

    /**
     * Required abstract method that
     * returns this Staff object's 
     * monthly earning
     * @return a double representing the
     * monthly earning
     */
	public double monthlyEarning(){
        return hourlyRate * 160;
    }

    /**
     * @return a double representing the
     * monthly earning
     */
    public double getHourlyRate(){
        return hourlyRate;
    }

    /**
     * Change's this Staff object's
     * hourly rate to 
     * @param rate , a double representing 
     * the hourly rate
     */
    public void setHourlyRate(Double rate){
        this.hourlyRate = rate;
    }

    /**
     * @Override toString method
     * @return a string of the employee's ID number, name, and salary
     */
    public String toString(){
        return String.format("ID Employee Number: " + this.getIDNumber() + 
        ".%n" + "Employee Name: " + this.getFirstName() + " " + this.getLastName()
         + ".%n" + "Full Time Monthly Salary: " + Double.toString(monthlyEarning()));
    }

}
