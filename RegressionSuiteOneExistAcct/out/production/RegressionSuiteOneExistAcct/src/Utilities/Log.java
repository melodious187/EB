package Utilities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log {
    private static final Logger Log = LogManager.getLogger(Log.class.getName());

//    This is to print log in the beginning of the test case

    public static void startTestCase(String sTestCaseName){
        Log.info("*******************************************************************************************");
        Log.info("*******************************************************************************************");
        Log.info("                    " + sTestCaseName );
        Log.info("*******************************************************************************************");
        Log.info("*******************************************************************************************");
    }

//    This is to print to log for end of test case

    public static void endTestCase(String sTestCaseName){
        Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Log.info("                      " + "Ending " + sTestCaseName);
        Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

//    Create log message types
    public static void info(String message) {

        Log.info(message);
    }

    public static void warn(String message) {
        Log.warn(message);
    }

    public static void error(String message) {
        Log.error(message);
    }

    public static void fatal(String message) {
        Log.fatal(message);
    }

    public static void debug(String message) {
        Log.debug(message);
    }

}
