package com.cruzandre.loggingSLF4J;

import java.lang.invoke.MethodHandles;
import java.text.MessageFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {

		String user = "cruz";
		String application = "gateway";
		
		LOGGER.info("This is how you configure Logback with SLF4J");

		// Substitution with one formatting anchor and one argument
		LOGGER.info("Bad experience for user {}", user);

		// If you happen to forget to provide a substituting object
		LOGGER.info("Bad experience for user {}");

		// Substitution with two formatting anchors and two arguments
		LOGGER.info("Bad experience for user {} at time {}", user, Calendar.getInstance().getTime());

		LOGGER.debug("Hello from Logback");

		LOGGER.debug("getNumber() : {}", getNumber());

		if(LOGGER.isInfoEnabled()) {
			String message = MessageFormat.format("Bad experience for user {0} at time {1} while accessing {2}", user, Calendar.getInstance().getTime(), application);
			LOGGER.info(message);
		}
	}
	
	static int getNumber() {
		return 5;
	}
}
