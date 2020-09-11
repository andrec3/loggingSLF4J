package com.cruzandre.loggingSLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args ) {
    	
    	// assume SLF4J is bound to logback in the current environment
    	LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    	// print logback's internal status
    	StatusPrinter.print(lc);
    	  
    	LOGGER.debug("Debug log message");
    	LOGGER.info("Info log message");
    	LOGGER.error("Error log message");
    }
}
