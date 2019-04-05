/**
 * Logger demonstrates the concepts of Singleton Pattern.
 * 
 * No matter how many times a user may call the getInstance() method, there'll
 * be one and only one instance of Logger -- the "singleton".
 */
public class Logger {

    /**
     * The singleton instance.
     * 
     * It's made to be static such that it will be shared among whole class.
     */
    private static Logger SINGLETON_LOGGER;
   
    /**
     * It will only be invoked privately; otherwise, outsiders may have access to
     * this method and create another instance.
     */
    private Logger() {
        // do something
    }

    /**
     * The public static method for all users to get the singleton instance
     * reference.
     * 
     * It's made to be static such that users do not need an instance to invoke it.
     * 
     * @return singleton instance
     */
    public static Logger getInstance() {
        // For performance reason, I want to avoid unnecessary synchronization unless I
        // have to -- when SINGLETON_LOGGER is indeed null.
        if (SINGLETON_LOGGER == null) {
            // After this point, only one thread may get through!
            synchronized (Logger.class) {
                // Check again because other thread may have already created the singleton!!
                if (SINGLETON_LOGGER == null) {
                    SINGLETON_LOGGER = new Logger();
                }
            }
        }
        return SINGLETON_LOGGER;
    }
}
