public class PepperoniPizza extends Pizza {
    
    public PepperoniPizza() {
            name = "Pepperoni Pizza";
            dough = "Crust";
            sauce = "Marinara sauce";
            //YOUR CODE to add toppings: "Diced onion", "Sliced mushrooms",  and "Sliced red pepper".
            toppings.add("Diced onion");
            toppings.add("Sliced mushrooms");
            toppings.add("Sliced red pepper");
    }

      @Override
      public void prepare() {
        //Display the following output:
        //Add Pepporonie !!
        System.out.println("Add Pepporonie !!");
      }
    
      @Override
      public void bake() {
      //Display the following output:
        //Bake Pepporonie Pizza !!;
        System.out.println("Bake Pepporonie Pizza !!");
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