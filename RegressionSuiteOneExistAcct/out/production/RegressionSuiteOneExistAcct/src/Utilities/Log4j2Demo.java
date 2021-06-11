package Utilities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Log4j2Demo {
    private static final Logger LOGGER = LogManager.getLogger(Log4j2Demo.class.getName());

    public static void main(String[] args)
    {
        System.setProperty("log4j.configurationFile","./log4j2.xml");
        LOGGER.debug("Debug Message Logged !!!");
//        LOGGER.info("\nInfo Message Logged !!!");
        LOGGER.error("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!");

        Log.error("\n\nStart of Regression test");
    }

}
