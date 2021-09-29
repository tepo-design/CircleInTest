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

        // Testing the expected frequency with inconsistent punctuation and case.
        // Case should not matter and word should be recognised.
        // Surrounding punctuation should not matter and word should be recognised.
        Assert.assertEquals(3, new WordCount().getWordFreq(INCORRECT_PUNC, "there"));

        // Testing the expected frequency when a word is included in a larger word or series of characters
        Assert.assertEquals(0, new WordCount().getWordFreq(ILLEGIBLE, "there"));

        // Testing that plurality of a word doesn't include it in the word count
        Assert.assertEquals(1, new WordCount().getWordFreq(PLURAL, "there"));

        // Testing that repetition of the correct word without spaces produces the desired result of not counting it
        // towards frequency
        Assert.assertEquals(0, new WordCount().getWordFreq(REPETITION, "there"));
    }

    private static final String NORMAL = "We are going to go over there. There are people over there.";
    private static final String INCORRECT_PUNC = "We are going to go over ..!there. There are people over THERE.";
    private static final String ILLEGIBLE = "akjdgaghdalTHEREakjhfasbthere";
    private static final String PLURAL = "There's a boy over there.";
    private static final String REPETITION = "THERETHERETHERETHERETHERE";
}
