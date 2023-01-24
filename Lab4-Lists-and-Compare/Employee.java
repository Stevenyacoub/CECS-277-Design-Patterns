public abstract class Employee implements EmployeeInfo, Comparable<Employee>{
    //Instance variables
    private String lastName;
    private String firstName;
    private String IDNumber;
    
    //Default constructor
    public Employee(){
        this.lastName = "Last";
        this.firstName = "First";
        this.IDNumber = "000000000";
    }

    //Argument constructor
    public Employee(String last, String first, String ID){
        setLastName(last);
        setFirstName(first);
        setIDNumber(ID);
    }

    /**
     * all children must contain a method
     * that returns the type's monthly
     * earning
     */
    public abstract double monthlyEarning();

    /**
     * @Override toString method
     * @return a string of the employee's name and ID Number
     */
    public String toString(){
       return String.format("ID Employee Number: " + IDNumber + ".%n" + "Employee Name: " + firstName + " " + lastName); 
    }

    /**
     * @return a string of the employee's last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * A mutator that changes the given 
     * Employee object's lastName
     * @param last
     */
    public void setLastName(String last){
        this.lastName = last;
    }
    
    /**
     * @return a string of the employee's first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * A mutator that changes the given 
     * Employee object's firstName
     * @param first
     */
    public void setFirstName(String first){
        this.firstName = first;
    }

    /**
     * @return a string of the employee's ID Number
     */
    public String getIDNumber(){
        return IDNumber;
    }

    /**
     * A mutator that changes the given 
     * Employee object's IDNumber
     * @param id
     */
    public void setIDNumber(String id){
        this.IDNumber = id;
    }

    /**
     * A function that compares the
     * two given Employee objects'
     * IDNumber and returns whether
     * one is greater or not 
     * @param o
     */
    public int compareTo(Employee o){
        if(Integer.parseInt(o.getIDNumber()) > Integer.parseInt(this.getIDNumber())){
            return -1;
        }else if(Integer.parseInt(o.getIDNumber()) < Integer.parseInt(this.getIDNumber())){
            return 1;
        }else{
            return 0;
        }
    }
}
