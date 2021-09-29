package com.circlein.challenge.model;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest
{

    @Test
    public void testWordCount()
    {
        Assert.assertEquals(3, new WordCount().getWordFreq(NORMAL));
    }

    private static final String NORMAL = "We are going to go over there. There are people over there.";
    private static final String INCORRECT_PUNC = "We are. going to go over there. to where they are over .there";
    private static final String ILLEGIBLE = "akjdgaghdalTHEREakjhfasbthere";
}
