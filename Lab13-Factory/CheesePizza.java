public class CheesePizza extends Pizza{

    public CheesePizza() {
            name = "Cheese Pizza";
            dough = "Regular Crust";
            sauce = "Marinara Pizza Sauce";
            //YOUR CODE to add toppings: "Fresh Mozzarella" and "Parmesan"
            toppings.add("Fresh Mozzarella");
            toppings.add("Parmesan");
      }

      @Override
      public void prepare() {
      //Display the following output:
      //Pizza prepare:
      //Add Cheese!!
        System.out.println("Pizza prepare:");
        System.out.println("Add Cheese!!");
      }

      @Override
      public void bake() {
            //Display the following output:
            //"Bake Cheese Pizza
            System.out.println("Bake Cheese Pizza");
      }  
      
      public String toString()
      {  //YOUR CODE  to display the following output:
         //name, dough, sauce and toppings
         //Using StringBuffer
         StringBuffer str = new StringBuffer();
         str.append("Name: " + name + " Dough: " + dough + " Sauce: " + sauce + " Toppings: " + toppings.toString());
         System.out.println(str);
         return str.toString();
      }  
}