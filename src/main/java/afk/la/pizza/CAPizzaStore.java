package afk.la.pizza;


public class CAPizzaStore extends PizzaStore
{
  public Pizza createPizza(String type)
  {
    if (type.equals("cheese"))
    {
      return new CAStyleCheesePizza();
    }
    else if (type.equals("veggie"))
    {
      return new CAStyleVeggiePizza();
    } 
    else if (type.equals("clam"))
    {
      return new CAStyleClamPizza();
    } 
    else if (type.equals("pepperoni"))
    {
      return new CAStylePepperoniPizza();
    } 
    else return null;
  }
}
