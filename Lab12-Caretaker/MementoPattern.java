/**MementoPattern main method
 * 
 */

public class MementoPattern {
    public static void main(String[]args) {
        int num1 = 2;
        int num2 = 3;
        Calculator calc = new Calculator();
        calc.setnumbers(num1, num2);
        int sum = calc.add();
        //Code to backup the above addition operation
        MementoCalc c = calc.backUplastCalc();
        
        System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
        num1 = 5;
        num2 = 6;
        calc.setnumbers(num1, num2);
        sum = calc.add();
        System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
        //Code to restore the previous addition operation
        calc.restorePreviousCalc(c);
        
        System.out.println("The last calculation was: " + c.getnum1() + " + " + c.getnum2() + " = " + calc.add());
    }
}