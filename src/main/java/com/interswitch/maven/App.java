package com.interswitch.maven;

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
    }
}
