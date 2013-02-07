public class BlankCard extends Card
{
  private String recipient1;
  private String from1;
  public BlankCard(String recipient, String from)
  {
    toAndFrom(recipient, from, persMessage);
  }
  
  public void toAndFrom(String recipient, String from)
  {
    recipient1 = recipient;
    from1 = from;
    persMessage1 = persMessage;
  }
  
    
  public void makeCard()
  {
    
    System.out.println("From " + from1);
    System.out.println(persMessage1);
    System.out.println("To " + recipient1);
    
  }
}
    