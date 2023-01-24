import java.util.ArrayList;

public class ReportCard{
    private Student student;
    private ArrayList<Class> classes; 

    //default constructor
    public ReportCard(){
        student = new Student();
        classes = new ArrayList<Class>();
    }

    //argument constructor
    public ReportCard(Student student, ArrayList<Class> classes){
        this.student = student;
        this.classes = classes;
    }


    /**
     * @return a double representing the
     * average grade achieved on a 5 point
     * scale based on the percents achieved
     */
    public double calculateAverageGrade(){
        int sum = 0;
        for(int i = 0; i < classes.size(); i++){
            sum += classes.get(i).getPercentGrade();
        }

        double avg = sum/classes.size();
        return Math.round(5.00*(avg/100.00));
    }

    /**
     * @return a String representing the
     * student's full report card including
     * their name and all the grades for their
     * respective classes
     */    
    public String toString(){
        String result = "";
        result += "Name: " + student.getName() + "\n";

        for(int i = 0; i < classes.size(); i++){
            result += classes.get(i).toString() + "\n";
        }

        result = result + "Grade Average: " + calculateAverageGrade() + "\n";
        return result;
    }

}