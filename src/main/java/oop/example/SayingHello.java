package oop.example;
import java.util.Scanner;

public class SayingHello
{
    public static void main( String[] args )
    {
        System.out.print("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        String output = "Hello, " + name + ", nice to meet you!";

        System.out.println(output);
    }
}
