public class ValentinesDay extends Card
{
  private String recipient1;
  private String from1;
  public ValentinesDay(String recipient, String from)
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
    System.out.println("Happy Valentines Day");
    System.out.println("To " + recipient1);
    
  }
}
    