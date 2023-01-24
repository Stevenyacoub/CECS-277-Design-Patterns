import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args){
        long start = System.nanoTime();

        ArrayList<Employee> Employees = new ArrayList<Employee>();

        Employees.add(new Staff("Allen", "Paita", "123", 50.00));
        Employees.add(new Staff("Zapata", "Steven", "456", 35.00));
        Employees.add(new Staff("Rios", "Enrique", "789", 40.00));

        Employees.add(new Faculty("Johnson", "Anne", "243", Faculty.Level.FU, "Ph.D", "Engineering", 3));
        Employees.add(new Faculty("Bouris", "William", "791", Faculty.Level.AO, "Ph.D", "English", 1));
        Employees.add(new Faculty("Andrade", "Christopher", "623", Faculty.Level.AS, "MS", "Physical Education", 0));

        Employees.add(new Partime("Guzman", "Augusto", "455", 35.00, 30));
        Employees.add(new Partime("Depirro", "Martin", "678", 30.00, 15));
        Employees.add(new Partime("Aldaco", "Marque", "945", 20.00, 35));

        for(int j = 0; j < Employees.size(); j++){
            System.out.println("Last Name: " + Employees.get(j).getLastName());
            System.out.println("First Name: " + Employees.get(j).getFirstName());
            System.out.println("ID Number: " + Employees.get(j).getIDNumber());
            if(Employees.get(j) instanceof Staff ){
                System.out.printf("Hourly Rate: $%.2f", ((Staff) Employees.get(j)).getHourlyRate());
            }
            else if(Employees.get(j) instanceof Partime ){
                System.out.printf("Hourly Rate: $$%.2f", ((Partime) Employees.get(j)).getHourlyRate());
                System.out.println("Hrs Worked Per Week: " + ((Partime) Employees.get(j)).getWeeklyHourTotal());
            } else if(Employees.get(j) instanceof Faculty){
                System.out.println("" + ((Faculty) Employees.get(j)).getString());
            } else{
                System.out.println("Done");
            }
            System.out.println("\n");
        }

        System.out.println("Problem A)"); 
        System.out.println("Display employee's information using the method toString\n");

        for(int j = 0; j < Employees.size(); j++){
            System.out.println(Employees.get(j).toString());
            System.out.println("\n");
        }

        double totalPartTime = 0.00;
        double totalSalary = 0.00;
        for(int i = 0; i < Employees.size(); i++){
            if(Employees.get(i) instanceof Partime){
                totalPartTime += Employees.get(i).monthlyEarning();
            }
            totalSalary += Employees.get(i).monthlyEarning();
        }
        Collections.sort(Employees);
        
        System.out.print("Problem B)");
        System.out.printf("\nTotal monthly salary for all of the Part-time Staff: $%.2f",totalPartTime);
        System.out.println("");
        System.out.print("Problem C)");
        System.out.printf("\nTotal monthly salary for sll of the Employee: $%.2f", totalSalary);
        System.out.println("");
        System.out.println("");
        System.out.println("Problem D)");
        System.out.println("Employees sorted by ascending order ID Numbers: ");
        System.out.println(Employees);
        System.out.println("");

        Collections.sort(Employees, new Comparator<Employee>(){
            public int compare(Employee o1, Employee o2) {
                return o2.getLastName().compareTo(o1.getLastName());            
            }
        });

        System.out.println("Problem E)");
        System.out.println("Employees sorted by descending order last names: ");
        System.out.println(Employees);



        long end = System.nanoTime();
        long time = end - start;
        System.out.println("");
        System.out.println("Runtime: " + time);
    }
}
