package com.circlein.challenge.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WordCountControllerTest
{

    // Test for the functionality of the controller to ensure all methods act correctly together
    // Chose a random blog to ensure word count doesn't change between development and runtime
    @Test
    public void testController()
    {
        WordCountController wordCountController = new WordCountController();

        // Test chosen word as 'what'
        // Expected output is 3
        int result = wordCountController.getWordCount(TEST_URL, "what");
        Assert.assertEquals(result, 3);

        // Test chosen word as 'wHAt'
        // Expected output is 3
        int result2 = wordCountController.getWordCount(TEST_URL, "wHAt");
        Assert.assertEquals(result2, 3);

        // Test chosen word as 'wh.at'
        // Expected output is 0
        int result3 = wordCountController.getWordCount(TEST_URL, "wh.at");
        Assert.assertEquals(result3, 0);

        // Test chosen word as '!what!'
        // Expected output is 0
        int result4 = wordCountController.getWordCount(TEST_URL, "!what!");
        Assert.assertEquals(result3, 0);
    }

    private static final String TEST_URL = "https://medium.com/@SravanCynixit/what-is-spring-boot-and-introduction-of-spring-boot-838644ed3d6";
}
