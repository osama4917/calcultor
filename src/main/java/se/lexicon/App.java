package se.lexicon;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter The Operation");
        String op = input.next();

        System.out.println("Enter The second number ");
        int num2 =input.nextInt();

        switch (op){
            case "+" : System.out.println("result is :" + (num1 + num2)); break;
            case "-" : System.out.println("result is :" + (num1 - num2)); break;
            case "*" : System.out.println("result is : " + (num1 * num2)); break;
            case "/" : System.out.println("result is:" + (num1 / num2)); break;
            default: System.out.println("Error operation");

        }

    }
}
