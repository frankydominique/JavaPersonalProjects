
public class Restaurant {
	private String name; //name
	private String description; //type of restaurant
	private int rating; //rating
	private int numRatCollect; //returns how many ratings of this restaurant there have been
	private String notes; //notes related to restaurant like who doesn't like it, etc.
	private int priceRange; //on a basis of 5, with 1 being cheap and 5 being expensive
	private String priceRangeDescr; //more specific description of the prices
	
	public Restaurant(String name, String description)
	{
		this.name = name;
		this.description = description;
		numRatCollect = 0;
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
}
