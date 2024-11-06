package bill;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {
        int option;    
        String input;
        String option1;

        double items;
        Scanner keyboard = new Scanner(System.in);
        input = JOptionPane.showInputDialog("What item do you wish to buy? \n 1=shoes   (Rs.50) \n 2=tshirt   (Rs.40)\n 3=shorts   (Rs.75) \n 4=caps   (Rs.15)");
        option = (int) Double.parseDouble(input);
         
        switch(option){
            case 1:
                int l = 50;
                NewClass obj= new NewClass();
                obj.shoes(l);
                break;
            case 2:
                int b= 40;
                NewClass obj1 =new NewClass();
                obj1.tshirt(b);
                break;
                case 3:
                int v= 75;
                NewClass obj2 = new NewClass();
                obj2.shorts(v);
                break;
                case 4:
                 int t= 15;
                NewClass obj3 = new NewClass();
                obj3.caps(t);
                break;
                
        }

    }
    
}
    
