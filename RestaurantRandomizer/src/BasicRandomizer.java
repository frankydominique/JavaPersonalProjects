import java.util.Scanner;

/**
 * @author Franceska
 *
 */
public class BasicRandomizer {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many options?");
		
		int numRestaurants = Integer.parseInt(input.nextLine());
		
		System.out.println("Okay!");
		
		String[] restaurants = new String[numRestaurants];
		int index = 0;
		int numRest2 = numRestaurants;
		
		while (numRest2 > 0)
		{
			System.out.println("Please enter a restaurant name: ");
			String restaurantName = input.nextLine();
			
			restaurants[index] = restaurantName;
			index++;
			numRest2--;
		}
		
		Double rIndex = new Double(Math.random() * numRestaurants);
		
		System.out.println("Today's choice is: " + restaurants[rIndex.intValue()]);
	}
}
