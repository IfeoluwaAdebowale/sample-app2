package com.interswitch.maven;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UpperLowerCase ulCase = new UpperLowerCase();
        System.out.printf( "%s to %sn", "Hello World!", ulCase.wordToLowerCase("Hello World") );
        System.out.println("New Go-home feature by " +
                "Backbone Team suggested at " + LocalDateTime.now());
    }
}
