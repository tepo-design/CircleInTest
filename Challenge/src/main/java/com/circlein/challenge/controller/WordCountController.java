package com.circlein.challenge.controller;

import com.circlein.challenge.model.WordCount;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/wordCount")
public class WordCountController
{
    /*
        Get Mapping to calculate the word frequency of a given webpage
        Manually tested via postman

        Parameters:
            - url: webpage to search
            - word: the word that we are analysing the webpage for
     */
    @CrossOrigin("*")
    @GetMapping("/")
    public int getWordCount(@RequestParam String url, @RequestParam String word) throws IOException
    {
        WordCount counter = new WordCount();

        // Get the text body of a webpage in one string
        String textBody = counter.getText(url);
        // Count the frequency of the requested word
        int count = new WordCount().getWordFreq(textBody, word);

        return count;
    }
}
