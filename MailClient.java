
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // 
    private MailServer server;
    //
    private String user;

   /**
    * Constructor for objects of class MailClient
    */
   public MailClient(String user, MailServer server)
    {
       // initialise instance variables
       this.user   = user;
       this.server = server;
   }
   
   //Devuelve el siguiente e-mail para ese usuario
   public MailItem getNextMailItem()
   {
       return server.getNextMailItem(user);
   }
    
    //Imprime el siguiente e-mail 
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null)
        {
            System.out.println("There are no new e-mails");
        }
        /**
         * No he puesto:
         * Else 
         * {
         *     item.print();
         * }
         * porque me daba error al compilar: "Cannot find symbol - method print()
         */
   }
    
   public void sendMailItem(String to, String message)
   {
       MailItem item = new MailItem(user, to, message);
       server.post(item);
   }
}
