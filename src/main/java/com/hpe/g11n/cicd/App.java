package com.hpe.g11n.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        LOGGER.debug("App.main: About to run application");
        LOGGER.info("App.main: Running application. Current time: {}", LocalDateTime.now());
        new Greeting().sayHi();

        LOGGER.info("App.main: Running application. Shutting down application");
    }
}
