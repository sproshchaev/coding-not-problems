package com.prosoft;

import com.prosoft.gui.GraphicalUserInterface;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new GraphicalUserInterface();

            }
        });

    }
}
