public class Student {
    private String name;

    //default constructor
    public Student(){
        name = "No Name";
    }

    //argument constructor
    public Student(String name){
        this.name = name;
    }

    /**
     * @return a String representing the
     * student's full name
     */
    public String getName(){
        return name;
    }
}
