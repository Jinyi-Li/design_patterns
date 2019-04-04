/**
 * Logger demonstrates the concepts of Singleton Pattern.
 * 
 * No matter how many times a user may call the getInstance() method, there'll be one and only one instance of Logger -- the "singleton".
 */
public class Logger {
    
    /**
     * The singleton instance. 
     * 
     * It's made to be static such that it will be shared among whole class.
     */
    private static Logger SINGLETON_LOGGER;
    /**
     * Some other fields, for example, a serial name.
     */
    private static String serialName;

    /**
     * It will only be invoked privately; otherwise, outsiders may have access to this method and create another instance.
     */
    private Logger(){
        serialName = "Logger's name goes here";
    }

    /**
     * The public method for all users to get the singleton instance reference.
     * 
     * @return singleton instance
     */
    public Logger getInstance(){
        // For performance reason, I want to avoid unnecessary synchronization unless I have to -- when SINGLETON_LOGGER is indeed null.
        if(SINGLETON_LOGGER == null){
            // After this point, only one thread may get through!
            synchronized(this){
                // Check again because other thread may have already created the singleton!!
                if(SINGLETON_LOGGER == null){
                    SINGLETON_LOGGER = new Logger();
                }
            }
        }
        return SINGLETON_LOGGER;
    }
}
