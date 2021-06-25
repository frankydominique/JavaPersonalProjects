import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Restaurant {
	private String name; //name
	private String description; //type of restaurant
	private int rating; //rating
	private int numRatCollect; //returns how many ratings of this restaurant there have been
	private String notes; //notes related to restaurant like who doesn't like it, etc.
	private int priceRange; //on a basis of 5, with 1 being cheap and 5 being expensive
	private String priceRangeDescr; //more specific description of the prices
	private static File output;
	private static Restaurant[] restaurants;
	private static int restaurantsIndex;
	
	public Restaurant(String name, String description)
	{
		this.name = name;
		this.description = description;
		numRatCollect = 0;
		output = new File("Restaurants.txt");
		restaurants = new Restaurant[20];
		restaurantsIndex = 0;
		
		//file reading and loading into list is not working that is why null pointer exception
		String file = loadFile().toString();
		Scanner scanner = new Scanner(file);
		String line;
		
		int lineNum = 1;
		String tempName = "";
		String tempDesc = "";
		while(scanner.hasNextLine())
		{
			System.out.println(lineNum);
			scanner.nextLine();
			lineNum++;
			/*line = scanner.nextLine();
			System.out.println(line);
			if(lineNum % 2 == 0)
			{
				tempName = line;
				lineNum++;
			}
			else
			{
				tempDesc = line;	
				Restaurant temp = new Restaurant(tempName, tempDesc);
				lineNum++;
				restaurants[restaurantsIndex] = temp;
				restaurantsIndex++;
			}*/
		}
		
		for(Restaurant restaurant: restaurants)
			System.out.println(restaurant.toString());
	}
	
	public static void main(String[] args)
	{
		
	}


	/**
	 * Creates a StringBuffer of the given file
	 * 
	 * 
	 */
	public static StringBuffer loadFile()
	{
		StringBuffer strBuffer = new StringBuffer((int)output.length());
		
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(output));
			
			int ch = 0;
			while((ch = input.read()) != -1)
				strBuffer.append((char)ch);
			
			input.close();
			
			return strBuffer;
		}
		catch (IOException ex)
		{
			System.out.print("System failure");
		}	
		
		return strBuffer;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public int addToRating(int num)
	{
		int temp = rating / numRatCollect;
		numRatCollect++;
		rating = (temp + num) / numRatCollect;
		return rating;
	}
	
	public void addRestaurantToFile() throws IOException
	{
		for(int i = 0; i < restaurants.length; i++)
		{
			if(restaurants[i] != null)
				if(this.equals(restaurants[i])) return;
		}
		
		restaurants[restaurantsIndex] = this;
		restaurantsIndex++;
		
		Writer append2 = null;
		
		try
		{
			append2 = new FileWriter(output, true);
		}
		catch (IOException ex)
		{
			System.out.println("File doesn't exist");
		}
		
		PrintWriter toPrint = new PrintWriter(append2);
		toPrint.println(this.getName());
		toPrint.println(this.getDescription());
		
		toPrint.close();
	}
	
	public boolean equals(Object restaurant)
	{
		return this.toString().equals(((Restaurant)restaurant).toString());
	}
	
	public String toString()
	{
		return "Name: " + name + ", Description: " + description;
	}
	
	/**
	 * @return the restaurants
	 */
	public static Restaurant[] getRestaurants() {
		return restaurants;
	}
	
	//UNFINISHED
	public static String restaurantsListToString()
	{
		String restList = "";
		
		
		return restList;
			
	}

	/**
	 * @param restaurants the restaurants to set
	 */
	public static void setRestaurants(Restaurant[] restaurants) {
		Restaurant.restaurants = restaurants;
	}

	
}
