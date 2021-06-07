import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Franceska
 *
 */
public class UserScreen extends JPanel{
	
	private int numRestaurants;
	
	public UserScreen()
	{
		numRestaurants = 0;
	}
	
	public UserScreen(int numRestaurants)
	{
		this.numRestaurants = numRestaurants;
	}
	
	public int randomize()
	{
		return (int)Math.floor(Math.random() * numRestaurants);
	}
}
