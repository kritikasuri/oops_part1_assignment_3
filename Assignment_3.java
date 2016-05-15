import java.util.Scanner;


public class random_num {
	
	public static void main(String args[])
    {
		System.out.println("Enter the number :");
		Scanner scan = new Scanner (System.in);
		int nbr = scan.nextInt();
		 
        double randomNumber = Math.random();
        int randomInt = (int)(nbr * randomNumber);
 
        System.out.println("The random number is : "+randomInt);
    }
}
