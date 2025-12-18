//Aim of the program :Write a class Account containing acc_no, balance as data members and two methods as input() for taking input from user and disp() method to display the details. Create a subclass Person which has name and aadhar_no as extra data members and override disp() function.
// Write the complete program to take and print details of three persons.
//Input: Enter details of three persons.
//Output: Display details of three persons.
import java.util.Scanner;
// Base class
class Account
{
    int acc_no;
    double balance;
    // Method to take input
    void input(Scanner sc)
    {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }
    // Method to display details
    void display()
    {
        System.out.println("Account Number : " + acc_no);
        System.out.println("Balance        : " + balance);
    }
}
// Subclass
class Person extends Account
{
    String name;
    long aadhar_no;
    // Input method
    void input(Scanner sc)
    {
        System.out.print("Enter Name: ");
        sc.nextLine();   // consume newline
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();
        // Call base class input
        super.input(sc);
    }
    // Overriding disp() method
    //@Override
    void disp()
    {
        System.out.println("Name           : " + name);
        System.out.println("Aadhar Number  : " + aadhar_no);
        System.out.println("Account Number : " + acc_no);
        System.out.println("Balance        : " + balance);
    }
}
// Main class
public class AccountPerson
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[3];
        // Input details of three persons
        for (int i = 0; i < 3; i++)
        {
            System.out.println("\nEnter details of Person " + (i + 1) + ":");
            p[i] = new Person();
            p[i].input(sc);
        }
        // Display details of three persons
        System.out.println("\n--- Details of Three Persons ---");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("\nPerson " + (i + 1) + ":");
            p[i].disp();
        }
        sc.close();
    }
}
