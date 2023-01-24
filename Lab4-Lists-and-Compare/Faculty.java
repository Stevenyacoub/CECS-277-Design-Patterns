public class Faculty extends Employee{
    public enum Level {AS, AO, FU, NA};
    private Education ed = new Education();
    private Level currLevel;
    
    //Default constructor
    public Faculty(){
        super();
        ed = new Education();
        currLevel = Level.NA;
    }

    //Argument constructor
    public Faculty(String last, String first, String IDNumber, Level currLevel, String degree, String major, int research){
        super(last, first, IDNumber);
        setLevel(currLevel);
        this.ed = new Education(degree, major, research);
    }

    /**
     * @return ed, the Faculty's
     * education level
     */
    public Education getEducation(){
        return ed;
    } 

    /**
     * Change's this Faculty object's
     * education level to 
     * @param ed the faculty's 
     * education level
     */
    public void setEducation(Education ed){
        this.ed = ed; 
    }

    /**
     * @return currLevel, the Faculty's
     * current education level
     */
    public Level getLevel(){
        return currLevel;
    }

    /**
     * Change's this Faculty object's
     * level to 
     * @param ed a Level representening 
     * the Faculty's current level
     */
    public void setLevel(Level ed){
        currLevel = ed;
    }

    /**
     * Required abstract method that
     * returns this Staff object's 
     * monthly earning
     * @return a double representing the
     * monthly earning
     */
    public double monthlyEarning() {
        switch (currLevel){
            case AS:
                return FACULTY_MONTHLY_SALARY;
            case AO:
                return FACULTY_MONTHLY_SALARY * 1.5;
            case FU:
                return FACULTY_MONTHLY_SALARY * 2.0;
            default:
                return 0;
        }
    }

    /**
     * @return a string representing the faculty's
     * degree, level, major, and number of researches
     */
    public String getString() {
        return "Level: " + currLevel + "\nDegree: " + ed.getDegree() + "\nMajor: " + ed.getMajor() + "\nResearches: " + ed.getResearch();
    }

    /**
     * @Override toString method
     * @return a string of the faculty's ID number,
     * name, and salary, and level
     */
    public String toString(){
        switch (currLevel){
            case AS:
                return super.toString() + "\nLevel: Assistant" + "\nMonthly Salary: " + monthlyEarning();
            case AO:
                return super.toString() + "\nLevel: Associate" + "\nMonthly Salary: " + monthlyEarning();
            case FU:
                return super.toString() + "\nLevel: Full" + "\nMonthly Salary: " + monthlyEarning();
            default:
                return super.toString() + "\nLevel: " + currLevel + "\nMonthly Salary: " + monthlyEarning();
        
        }
    }

}
