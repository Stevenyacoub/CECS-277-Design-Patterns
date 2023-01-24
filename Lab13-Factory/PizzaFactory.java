public class PizzaFactory {

    public static Pizza orderPizza(String type) {
        //YOUR CODE to create a pizza based on the type.
        Pizza pizza = new PepperoniPizza();   
        
        if(type.equalsIgnoreCase("Cheese")){
            pizza = new CheesePizza();
        }else if(type.equalsIgnoreCase("Pepperoni")){
            pizza = new PepperoniPizza();
        } 
           
           
        pizza.pizzaPrepare();
        return pizza;
      }

}