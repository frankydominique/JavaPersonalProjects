import java.time.Clock;
public class Clock {

	private Duration seconds = 0;
	private Duration minutes = 0;
	private int intervals = 0;
	private boolean repeating;
	
	public Clock()
	{
		
	}
	
	public Clock(int seconds, int minutes, boolean repeating, int intervals)
	{
		this.seconds = seconds;
		this.minutes = minutes;
	}
	
	
}
