import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Franceska
 *
 */
public class UserScreen extends JFrame{
	
	private static JFrame thisWindow;
	
	private int numRestaurants;
	private Restaurant[] restaurants;
	
	public UserScreen(String title)
	{
		super(title);
		thisWindow = this;
		numRestaurants = 0;
		
		JButton searchBar = new JButton("Title Search");
		searchBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				thisWindow.dispose();
				//new jframe class .setVisible(true)
			}
		});
		
		JButton moodBar = new JButton("Mood/Craving");
		moodBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				thisWindow.dispose();
			}
		});
		
		JButton addBar = new JButton("Add");
		addBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				thisWindow.dispose();
			}
		});
		
		JPanel generalPanel = new JPanel();
		JPanel topPanel = new JPanel(new FlowLayout());
		JPanel mainPanel = new JPanel();
		
		topPanel.add(searchBar);
		topPanel.add(moodBar);
		topPanel.add(addBar);
		
		JScrollPane scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		generalPanel.add(topPanel);
		generalPanel.add(mainPanel);
		
		Container c = getContentPane();
		c.add(generalPanel);
	}
	
	public Restaurant randomize()
	{
		return restaurants[(int)Math.floor(Math.random() * numRestaurants)];
	}
	
	public static void main(String[] args)
	{
		UserScreen newScreen = new UserScreen("User Screen");
		newScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newScreen.setBounds(0,0,360,140);
		newScreen.setVisible(true);
	}
}
