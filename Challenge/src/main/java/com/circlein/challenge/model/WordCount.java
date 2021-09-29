package com.circlein.challenge.model;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WordCount
{

    public int getWordFreq(String textBody, String word) throws IOException
    {
        int wordCount = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(textBody.getBytes(StandardCharsets.UTF_8))));

        String currentLine;

        while ((currentLine = reader.readLine()) != null)
        {

            String[] lineToArray = currentLine.split("[^a-zA-Z0-9']");

            for (String currentWord : lineToArray)
            {

                if (currentWord.equalsIgnoreCase(word))
                {
                    wordCount++;
                }
            }
        }

        reader.close();

        return wordCount;
    }
}
