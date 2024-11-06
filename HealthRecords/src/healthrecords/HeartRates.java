
package healthrecords;

/**
 *
 * @author Tasib
 */
public class HeartRates 
{
    private String first, last, gender;
    private int month,day,year,age;
    double height,weight;
    
    public HeartRates()
    {
        first = null;
        last = null;
        month = 0;
        day = 0;
        year = 0;
        height = 0;
        weight = 0;
    }
    
    public HeartRates(String fName, String lName, String g, int d, int m, int y, double h, double w)
    {
        first = fName;
        last = lName;
        gender = g;
        month = m;
        day = d;
        year = y;
        age = 2015-year;
        height = h;
        weight = w;
    }
    
    public void setGender(String g)
    {
        gender = g;
    }
    
    public void setFirst(String fName)
    {
        first = fName;
    }
    
    public void setLast(String lName)
    {
        last = lName;
    }
    
    public void setHeight(double h)
    {
        height = h;
    }
    
    public void setWeight(double w)
    {
        weight = w;
    }
    
    public void setDOB(int d, int m, int y)
    {
        month = m;
        day   = d;
        year  = y;
        
    }
    
    public String getFirst()
    {
        return first;
    }
    
    public String getLast()
    {
        return last;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public int getAge()
    {
        return age = 2015-year;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public int MaxHeartRate()
    {
        
        
        return 220-age;
    }
    
    
    public int targetHeartRateMin()
    {
        int tRate;
        
        tRate= (int) (MaxHeartRate() * .5);
        
        return tRate;
    }
    
    public int targetHeartRateMax()
    {
        int tRate;
        
        tRate= (int) (MaxHeartRate() * .85);
        
        return tRate;
    }
    
    public double getBMI()
    {
        double BMI;
        
        BMI = weight/(height * height);
        
        return BMI;
    }
    
    
    
    
}
