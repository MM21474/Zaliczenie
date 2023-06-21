package Log4j;

import java.util.logging.LogManager;
import java.util.logging.Logger;
public class App
{
    public static Logger logger = LogManager.getLogManager();

    public static void main (String[] args)
    {
        System.out.println("Hello world");
    }
}