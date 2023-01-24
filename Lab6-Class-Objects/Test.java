import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Student student = new Student("Claude von Riegan");

        ArrayList<Class> classes = new ArrayList<Class>();
        classes.add(new Class("PSYCH 101", new Grade("A")));
        classes.add(new Class("HIST 173", new Grade("C")));
        classes.add(new Class("MAE 453", new Grade("B")));
        classes.add(new Class("KIN 100A", new Grade("A")));

        System.out.println(new ReportCard(student, classes).toString());
    }
}
