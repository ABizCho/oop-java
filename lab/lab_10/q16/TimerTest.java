package lab.lab_10.q16;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer; 

public class TimerTest
{  
   public static void main(String[] args)
   {  
      //// 1-1. 람다변환 전
      // ActionListener listener = new TimePrinter();
      // Timer t = new Timer(10000, listener);
      // t.start();

      //// 2.람다로 변환한 표현
      Timer t = new Timer(10000,(ActionEvent event) -> {
         System.out.println("At the tone, the time is " + new Date());
         Toolkit.getDefaultToolkit().beep();

      });
      t.start();

      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}

////1-2. 람다변환 전
// class TimePrinter implements ActionListener
// {  
//    public void actionPerformed(ActionEvent event)
//    {  
//       System.out.println("At the tone, the time is " + new Date());
//       Toolkit.getDefaultToolkit().beep();
//    }
// }
