package chapter8guiex1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public class DrawPanel extends JPanel
 {
 private Random randomNumbers = new Random();
 private MyLine[] lines; // array of lines

 // constructor, creates a panel with random shapes
 public DrawPanel()
    {
 setBackground( Color.WHITE );

 lines = new MyLine[ 15 + randomNumbers.nextInt( 15 ) ];

 // create lines
 for ( int count = 0; count < lines.length; count++ )
 {
 // generate random coordinates
 int x1 = randomNumbers.nextInt( 480 );
 int y1 = randomNumbers.nextInt( 480 );
 int x2 = randomNumbers.nextInt( 480 );
 int y2 = randomNumbers.nextInt( 480 );

 // generate a random color
 Color color = new Color( randomNumbers.nextInt( 256 ),
 randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );

 // add the line to the list of lines to be displayed
 lines[ count ] = new MyLine( x1, y1, x2, y2, color );
 } // end for
 } // end DrawPanel constructor

 // for each shape array, draw the individual shapes
 public void paintComponent( Graphics g )
 {
 super.paintComponent( g );

 // draw the lines
 for ( MyLine line : lines )
 line.draw( g );
 } // end method paintComponent
 } // end class DrawPanel    

