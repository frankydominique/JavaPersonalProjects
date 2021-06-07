
public class Drill {

	/**
	 * Fields:
	 * name - the name of the drill
	 * description - how the drill is to be run
	 */
	private String name;
	private String description;
	
	/**
	 * Constructor
	 * @param name - the name of the drill
	 * @param description - a description of how the drill is to be run
	 */
	public Drill(String name, String description)
	{
		this.name = name;
		this.description = description;
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
	
	
}
