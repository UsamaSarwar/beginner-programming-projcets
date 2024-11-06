/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebooktest;

import java.util.Scanner;

/**
 *
 * @author Tasib Ali Sial
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        GradeBook myGradeBook = new GradeBook("Network Programming","Sohail A. Jabbar");
        
        System.out.println("Initial Course Name is: " + myGradeBook.getCourseName()
                    +"\nInitial Course's Instructor is: " + myGradeBook.getcourseInstructor());
        
        System.out.println();
        
        System.out.print("Please Enter the Course Name: ");
       
        String theName = input.nextLine();
        
        myGradeBook.setCourseName(theName);
        System.out.println();

        System.out.print("Please Enter Instructor's Name: ");
       
        String theName2 = input.nextLine();
        
        myGradeBook.setcourseInstructor(theName2);
        System.out.println();

        myGradeBook.displayMessage();
        
        
    }

}
