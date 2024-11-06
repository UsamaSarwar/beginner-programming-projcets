
package healthrecords;

import java.util.Scanner;

/**
 *
 * @author Tasib
 */
public class TargetHeartRateCalculator {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        HeartRates obj = new HeartRates();
        
        System.out.println("---------------------------");
        System.out.println("Enter details of the Person");
        System.out.println("---------------------------\n");
        
        System.out.print("First Name: ");
        obj.setFirst(input.nextLine());
        
        System.out.print("Last Name: ");
        obj.setLast(input.nextLine());
        
        System.out.print("Gender: ");
        obj.setGender(input.nextLine());
        
        System.out.print("Date Of Birth(i.e 19 03 1993): ");
        obj.setDOB(input.nextInt(), input.nextInt(), input.nextInt());
        
        System.out.print("Height in Meters: ");
        obj.setHeight(input.nextDouble());
        
        System.out.print("Weight in KiloGrams: ");
        obj.setWeight(input.nextDouble());
        
        System.out.println("\n\n--------------------------------------");
        System.out.println("Details of the Person after Processing");
        System.out.println("--------------------------------------\n");
        
        System.out.println("Full Name: " + obj.getFirst() + " " + obj.getLast());
        
        System.out.println("Date of Birth: " + obj.getDay() +" "+ obj.getMonth() +" "+ obj.getYear());
        
        System.out.println("Height in Meters: " + obj.getHeight());
        
        System.out.println("Weight in KiloGrams: " + obj.getWeight());
        
        System.out.println("Age: "+ obj.getAge() +" Years");
        
        System.out.println("Body Mass Index: " + obj.getBMI());
        
        System.out.println("Maximum Heart Rate: " + obj.MaxHeartRate() + " Beats Per Minute");
        
        System.out.println("Target Heart Rate Range: " + obj.targetHeartRateMin() + "-"
                            + obj.targetHeartRateMax() + " Beats Per Minute");
        System.out.println();
        
        
        System.out.println("BMI Values\n");
        System.out.println("UnderWeight:    Less than 18.5");
        System.out.println("Normal:         Between 18.5 and 24.9");
        System.out.println("OverWeight:     Between 25 and 29.9");
        System.out.println("Obese:          30 or greater");
        
        System.out.println("----------End Of Report----------");
        
        
        
    }
    
}
