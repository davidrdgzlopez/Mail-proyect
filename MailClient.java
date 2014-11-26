
/**
 * Representa un cliente de correo electrónico
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    //Hace referencia al servidor asociado al cliente
    private MailServer server;
    //Almacena la dirección de correo del usuario que usa el cliente
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
        else
        {
            item.printMail();
        }
   }
   
   //Envía un correo a la dirección idicada con el contenido pasado por parámetro 
   public void sendMailItem(String to, String message, String subject)
   {
       MailItem item = new MailItem(user, to, message, subject);
       server.post(item);
   }
   
   //Muestra cuántos correos tiene ese usuario en el servidor
   public void howManyMailItems()
   {
       System.out.println("You have " + server.howManyMailItems(user) + " new message(s)");
   }
}
