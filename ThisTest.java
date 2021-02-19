
public class ThisTest {
	
	public static void main(String[] args) {
		
		SimpleTime myTime = new SimpleTime(15, 30, 19);
		System.out.println(myTime.buildString());
		
	}

}	//end class ThisTest


//class SimpleTime demonstrates the "this" reference
class SimpleTime
{
	private int hour; //0-23
	private int minute; //0-59
	private int second; //0-59
	
	public SimpleTime(int hour, int minute, int second)
	{
		//set the class instance variables to the values in the constructor parameters
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//use explicit and implicit "this" to call toUniversalString
	public String buildString()
	{
		return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(),
								"toUniversalString()", toUniversalString());
	}
	
	public String toUniversalString()
	{
		//using "this" to access instance variables
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	
}
