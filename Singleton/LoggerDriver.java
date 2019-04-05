/**
 * LoggerDriver demonstrates the use case and context of Singleton Pattern.
 */
public class LoggerDriver {

    public static void main(String[] args) {
        Logger loggerForTask1 = Logger.getInstance();
        System.out.println(loggerForTask1.hashCode());

        Logger loggerForTask2 = Logger.getInstance();
        System.out.println(loggerForTask2.hashCode());
    }
}
