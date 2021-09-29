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

        // Testing the expected frequency with inconsistent punctuation and case
        Assert.assertEquals(3, new WordCount().getWordFreq(INCORRECT_PUNC, "there"));

        // Testing the expected frequency when a word is included in a larger word or series of characters
        Assert.assertEquals(0, new WordCount().getWordFreq(ILLEGIBLE, "there"));
    }

    private static final String NORMAL = "We are going to go over there. There are people over there.";
    private static final String INCORRECT_PUNC = "We are going to go over ..!there. There are people over THERE.";
    private static final String ILLEGIBLE = "akjdgaghdalTHEREakjhfasbthere";
}
