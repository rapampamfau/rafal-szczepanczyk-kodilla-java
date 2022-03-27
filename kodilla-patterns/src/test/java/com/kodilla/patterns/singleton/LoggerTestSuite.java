package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("Hello world");

        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("Hello world", result);
    }

}
