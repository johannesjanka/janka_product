public class Product
{
  private String name = "Coca Cola";
  private float price = 10;
  private boolean onStock = true;
  private int id;
  
  public Product()
  {
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
}