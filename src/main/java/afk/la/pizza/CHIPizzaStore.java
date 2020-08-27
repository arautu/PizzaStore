package afk.la.pizza;

public class CHIPizzaStore extends PizzaStore
{
  public Pizza createPizza(String type)
  {
    if (type.equals("cheese"))
    {
      return new CHIStyleCheesePizza();
    }
    else if (type.equals("veggie"))
    {
      return new CHIStyleVeggiePizza();
    } 
    else if (type.equals("clam"))
    {
      return new CHIStyleClamPizza();
    } 
    else if (type.equals("pepperoni"))
    {
      return new CHIStylePepperoniPizza();
    } 
    else return null;
  }
}
