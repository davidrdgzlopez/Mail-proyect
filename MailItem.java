
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // 
    private String from;
    //
    private String to;
    //
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String bFrom, String bTo, String bMessage)
    {
        message = bMessage;
        from    = bFrom;
        to      = bTo;
    }
    
    public String getTo()
    {
        return to;
    }
    
    public String getFrom()
    {
        return from;
    }
    
    public String getMessage()
    {
        return message;
    }

    /** 
     * 
     */
    public void printMail()
    {
         System.out.println("To: " + to);
         System.out.println("From: " + from);
         System.out.println("Message: " + message);
    }
}
