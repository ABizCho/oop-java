package lab.lab_4.q5;

public class MethodOverload {
    
    public static void main(String[] args)
    {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Sqaure of double 7.5 is %f%n", square(7.5));

        System.out.printf("Square of hello string is: %s%n", square("hello"));
        // System.out.printf("Square of int 5 is %f%n", square(5));

    }

    // overLoading
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argument: %d%n",intValue);
        return intValue * intValue;
    }

    // overLoading
    public static double square(double doubleValue)
    {
        System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }

    public static String square(String stringValue)
    {
        System.out.printf("%nCalled square with string argument: %s%n", stringValue);
        return stringValue + stringValue;
    }

    //// Overloading Fail case
    // public static double square(int n)
    // {
    //     return (double)n * n;
    // }
}
