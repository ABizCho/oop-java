package lab.lab_10.q17;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest
{
   public static void main(String[] args)
   {
      String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
            "Jupiter", "Saturn", "Uranus", "Neptune" };
      System.out.println(Arrays.toString(planets));
      System.out.println("Sorted in dictionary order:");
      Arrays.sort(planets);
      System.out.println(Arrays.toString(planets));
      System.out.println("Sorted by length:");

    // 1-1. interface 변환 전
    // Arrays.sort(planets, (first, second) -> first.length() - second.length());
    
    // 1-2. 변환 후
    LengthComparator comp = new LengthComparator();
    Arrays.sort(planets, (first, second) -> comp.compare(first, second));

    System.out.println(Arrays.toString(planets));
      
    // // 2-1. interface 변환 전
    //   Timer t = new Timer(1000, event ->
    //      System.out.println("The time is " + new Date()));
    //   t.start();   

    // 2-2. 변환 후    
      ActionListener listener = new TimePrinter();
      Timer t = new Timer(10000, listener);
      t.start();
    
    

         
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);         
   }
}

// 1-2. 변환 후
interface Comparator<T>
{
	int compare(T o1, T o2);
}

class LengthComparator implements Comparator<String>
 {
    @Override
    public int compare(String first, String second)
    {
         return first.length() - second.length();
    }

}


// 2-2. 변환 후
class TimePrinter implements ActionListener
{  
   public void actionPerformed(ActionEvent event)
   {  
      System.out.println("At the tone, the time is " + new Date());
      Toolkit.getDefaultToolkit().beep();
   }
}
