package com.dkit.sd2a.johnloane;

import java.util.Scanner;

/**
 * SD2 Menu using Enums
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Banking Menu System" );

        //while the user does not enter quit
        //1. Show the menu
        //2. Get the user's choice
        //3. Act on the user's choice
        MenuOptions selectOption = MenuOptions.CONTINUE;

        while(selectOption != MenuOptions.QUIT)
        {
            try
            {
                menu();
            }
        }
    }

    private static void menu()
    {
        System.out.println("\n Enter:");
        System.out.println(("\t1. Create Bank"));
        System.out.println(("\t2. Add a branch to a bank"));
        System.out.println(("\t3. Add customer to branch"));
        System.out.println(("\t4. Make transaction with customer"));
        System.out.println(("\t5. Display Banks, Branches"));
        System.out.println(("\t1. Quit"));
        System.out.println(("\n Selection -> "));
    }
}
