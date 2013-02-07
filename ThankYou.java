public class ThankYou extends Card
{
  private String recipient1;
  private String from1;
  public ThankYou(String recipient, String from)
  {
    toAndFrom(recipient, from);
  }
  
  public void toAndFrom(String recipient, String from)
  {
    recipient1 = recipient;
    from1 = from;
  }
  
    
  public void makeCard()
  {
    System.out.println("From " + from1);
    System.out.println("Thank You!");
    System.out.println("To " + recipient1);
    
  }
}
    