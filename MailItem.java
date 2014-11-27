
/**
 * Representa un mensaje de e-mail
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    //Almacena qué dirección envía el mensaje
    private String from;
    //Almacena para qué dirección es el mensaje
    private String to;
    //Almacena el contenido del mensaje
    private String message;
    //Almacena el asunto del mensaje
    private String subject;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String message, String subject)
    {
        this.message = message;
        this.from    = from;
        this.to      = to;
        this.subject = subject;
    }
    
    //Devuelve la dirección de destino del mensaje
    public String getTo()
    {
        return to;
    }
    
    //Devuelve la dirección de origen del mensaje
    public String getFrom()
    {
        return from;
    }
    
    //Devuelve el contenido del mensaje
    public String getMessage()
    {
        return message;
    }
    
    //Devuelve el asunto del mensaje
    public String getSubject()
    {
        return subject;
    }

    /**
     * Imprime por pantalla los datos del email:
     * dirección de origen, destino y contenido
     */
    public void printMail()
    {
         System.out.println("To: " + to);
         System.out.println("From: " + from);
         System.out.println("Message: " + message);
         System.out.println("Subject: " + subject);
    }
}
