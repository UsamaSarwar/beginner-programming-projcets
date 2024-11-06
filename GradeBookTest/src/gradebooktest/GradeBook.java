/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebooktest;

/**
 *
 * @author Tasib Ali Sial
 */
public class GradeBook
{
    private String courseName, courseInstructor;
    
    GradeBook(String a, String b)
    {
        
        courseName = a;
        courseInstructor = b;
        
    }
    
    public void setCourseName(String name)
    {
        
        courseName = name;
        
    }
    
    public String getCourseName()
    {
        
        return courseName;
        
    }
    
    public void setcourseInstructor(String name)
    {
        
        courseInstructor = name;
        
    }
    
    public String getcourseInstructor()
    {
        
        return courseInstructor;
        
    }
    
    
    public void displayMessage()

    {

        System.out.println("Welcome to the Grade Book: " + getCourseName()
               + "\nThis course is presented by: " + getcourseInstructor());

    }






}
