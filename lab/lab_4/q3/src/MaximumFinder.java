package lab.lab_4.q3.src;

import java.util.Scanner;

public class MaximumFinder {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(
            "Enter three floating-point values seperated by spaces: ");

            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();

            double result = maximum(number1, number2, number3);
            double result2 = average(number1, number2, number3);
            System.out.println("Maximum is: " + result);
            System.out.printf("Average is: %.2f%n", result2);

            input.close();
    }

            public static double maximum(double x, double y, double z)
            {
                double maximumValue = x;

                if (y > maximumValue)
                    maximumValue = y;

                if (z > maximumValue)
                    maximumValue = z;
                
                return maximumValue;
            }
            public static double average(double x, double y, double z)
            {
                double averageValue = (x + y + z) / 3; 
                return averageValue;
            }
            

}