//Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
//Input: Enter  dimensions
//Output: Display the cost of plastic
import java.util.Scanner;
/* Class for 2D Sheet */
class Sheet2D
{
    double length, width;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    void cost()
    {
        double area = length * width;
        double price = area * 40;
        System.out.println("Cost of 2D Sheet = Rs " + price);
    }
}
/* Class for 3D Box inheriting 2D Sheet */
class Box3D extends Sheet2D
{
    double height;
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
    void cost()
    {
        double volume = length * width * height;
        double price = volume * 60;
        System.out.println("Cost of 3D Box = Rs " + price);
    }
}
public class PlasticCost
{
    public static void main(String[] args)
    {
        Box3D b = new Box3D();
        b.input();
        b.cost();
    }
}
