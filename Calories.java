import java.util.Scanner;

public class Calories
{
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);

        int weight, distance;
        System.out.print("Enter weight: ");
        weight = input.nextInt();
        System.out.print("Enter distance: ");
        distance = input.nextInt();


        double caloriesBurned = .653 * weight * distance;
        System.out.print("Calories Burned: " + caloriesBurned);


    }



}


///  /t for indent