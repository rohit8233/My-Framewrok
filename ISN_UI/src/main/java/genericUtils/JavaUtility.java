package genericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	/**
	 * This method will Generate random number for every run
	 * @return
	 */
	public int getRandomNumber()
	{
		Random r= new Random();
		int value = r.nextInt(1000); // used to generate a random integer value between 0 (inclusive) and 1000 (exclusive) 
		return value;
	}
	/**
	 * This method will provide random string 
	 * @param charLength
	 * @return
	 */
	public String getRandomString(int charLength)
	{
		//what type of characters will append
		String characters="abcdefghijklmnopqwerstuvwxyz";
		String randomString="";
		Random rand=new Random();
		int length=rand.nextInt(charLength)+1;
		//convert chars into array
		char[] text=new char[length];
		for(int i=0 ; i<length ; i++)
		{
			text[i]=characters.charAt(rand.nextInt(characters.length()));
		}
		for(int i=0;i<text.length;i++)
		{
			randomString += text[i];
		}
		return randomString;
		
		
	}
	/**
	 * This method will provide system date
	 * @return
	 */
	public String getSystemDate() 
	{
		Date d = new Date(); 
		String value = d.toString(); // convert it to string for print or utilise
		return value;
		
	}
	public String getSystemDateInFormat() 
	{
		Date d=new Date();	
		String[] dArr = d.toString().split(" "); // split method will convert it to string array
		String date = dArr[2];					
		String month =dArr[1];
		String year=dArr[5];
		String time=dArr[3].replace(":", "-"); 
		String dateInFormat=date+"_"+month+"_"+year+" " +time;
		return dateInFormat;
				
	}
}
