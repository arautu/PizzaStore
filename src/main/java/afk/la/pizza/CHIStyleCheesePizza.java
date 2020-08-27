package afk.la.pizza;

import java.util.*;

public class CHIStyleCheesePizza extends Pizza
{
  public CHIStyleCheesePizza()
  {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
  }

  void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
