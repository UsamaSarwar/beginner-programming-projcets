package chapter8guiex1;
import javax.swing.JFrame;

/*
 * @author Tasib
 */
public class Chapter8GuiEx1 {

    public static void main(String[] args) 
    {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel );
        application.setSize( 500, 500 );
        application.setVisible( true );
        
        
    }
    
}
