package Week1.Algorithms_Data_Structures.SingletonPatternExample;

public class Logger
{
    private static Logger singleInstance;

    private Logger()
    {
        System.out.println("Logger Instance Created");
    }

    public static Logger getInstance()
    {
        if (singleInstance == null)
        {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    public void log(String message)
    {
        System.out.println("Log Message: " + message);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2)
        {
            System.out.println("Both logger instances are the same (Singleton verified).");
        }
        else
        {
            System.out.println("Different instances exist (Singleton failed).");
        }
    }
}
