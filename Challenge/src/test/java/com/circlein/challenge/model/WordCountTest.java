package com.circlein.challenge.model;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WordCountTest
{

    @Test
    public void testWordCount() throws IOException
    {
        // Testing whether the expected frequency of a word is seen in a normal sentence
        Assert.assertEquals(3, new WordCount().getWordFreq(NORMAL, "there"));
    }

    private static final String NORMAL = "We are going to go over there. There are people over there.";
    private static final String INCORRECT_PUNC = "We are. going to go over there. to where they are over .there";
    private static final String ILLEGIBLE = "akjdgaghdalTHEREakjhfasbthere";
}
