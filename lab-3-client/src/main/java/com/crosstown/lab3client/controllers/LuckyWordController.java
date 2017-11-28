package com.crosstown.lab3client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author F.S.(Crosstown)
 * @date 11/27/2017
 * @time 5:47 PM
 */
@RestController
public class LuckyWordController {

    @Value("${lucky-word}") String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }
}
