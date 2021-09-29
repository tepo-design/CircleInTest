package com.circlein.challenge.controller;

import com.circlein.challenge.model.WordCount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/wordCount")
public class WordCountController
{

    /*
        Get Mapping to calculate the word frequency of a given webpage
        Manually tested via postman
     */
    @GetMapping("/")
    public int getWordCount(@RequestParam String url, @RequestParam String word) throws IOException
    {
        int count = new WordCount().getText(url, word);

        return count;
    }
}
