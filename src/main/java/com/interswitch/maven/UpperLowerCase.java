package com.interswitch.maven;

public class UpperLowerCase {
    public String wordToUpperCase(String word){
        if (null != word && !word.isEmpty()){
            String[] words = word.split(" ");
            return words[0].toUpperCase();
        }
        throw new
                IllegalArgumentException("word cannot be empty");
    }
    public String wordToLowerCase(String word){
        if (null != word && !word.isEmpty()){
            String[] words = word.split(" ");
            return words[0].toLowerCase();
        }
        throw new
                IllegalArgumentException("word cannot be empty");
    }
}
