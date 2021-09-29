package com.circlein.challenge.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WordCount
{
    /*
        Initially the following two methods were combined into one.
        I made the decision to split them, so I could test getWordFreq().
        In the future I would learn to mock the static methods in getText() so that they are testable.
        Manually tested through postman.

        Parameters:
            - url: this is the URL for the webpage that we want to analyse
            - word: this is the word that we are measuring the frequency of in the given url
     */
    public String getText(String url) 
    {
        Document toHtml;
        String htmlToText = null;
        
        try
        {
            toHtml = Jsoup.connect(url).get();
            htmlToText = toHtml.body().text();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Unable to connect to the given url.");
        }

        return htmlToText;
    }

    /*
        Parameters:
            -   textBody: this is the text that has been converted from the specified webpage in getText()
            -   word: this is the word that we are measuring the frequency of in the given url

        This method takes in a string object and reads it line by line.
        Each line is split into an array taking into account the regex limits.
        Every time the 'word' parameter is found, we increase the count by 1.
        Finally, the total amount of times 'word' is found is returned.
     */
    public int getWordFreq(String textBody, String word)
    {
        int wordCount = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(textBody.getBytes(StandardCharsets.UTF_8))));
        String currentLine;

        try
        {
            while ((currentLine = reader.readLine()) != null)
            {
                // Split every line of the reader into a string array based upon the regex
                String[] lineToArray = currentLine.split("[^a-zA-Z0-9']");

                // Iterate over the string array and read every word
                for (String currentWord : lineToArray)
                {
                    // If the current word is equal to the parameter 'word', increase the count
                    if (currentWord.equalsIgnoreCase(word))
                    {
                        wordCount++;
                    }
                }
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("There is an error with reading the given string.");
        }

        return wordCount;
    }
}
