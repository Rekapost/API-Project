package commonPorperties;
import java.util.Random;

public class commonSteps {
	static Random randomGenerator=new Random();
	static int randomInt=randomGenerator.nextInt(100);
	public static int programId=randomInt;
	
	private String GetRandomString(int n) {
		// lower linit for lower case letters
		int lowerLimit=97;
		// upper linit for upper case letters
		int upperLimit=122;
		Random random=new Random();
		// create a string buffer to store the result
		StringBuffer r= new StringBuffer(n);
		for (int i=0;i<=n;i++) {

			// take a random value between 97 and 122
			int nextRandomChar=lowerLimit
					+(int)(random.nextFloat()
							*(upperLimit-lowerLimit+1));
			//append a character at the end of bs
			r.append((char)nextRandomChar);
		}
		//return the result string
		return r.toString();
	}
	
	/*		// ************************ settting current date and time 	
	GregorianCalendar date = new GregorianCalendar();
	day = date.get(Calendar.DAY_OF_MONTH);
	month = date.get(Calendar.MONTH);
	year = date.get(Calendar.YEAR);
	secnd = date.get(Calendar.SECOND);
	minute = date.get(Calendar.MINUTE);
	hour = date.get(Calendar.HOUR);
	DMYHMS = (day+ ":"+month+":"+year+":"+hour+":"+minute+":"+ secnd);
	System.out.println("CreationTime :" +DMYHMS);
*/
}
