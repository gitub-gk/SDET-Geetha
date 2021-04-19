package vtiger.generic;

import java.util.Date;
import java.util.Random;

public class javautiity 
{

/*
 *@author Geetha
 *Generate a random number
 *@RETURN RANDOMNUMBER TILL 10000
 */

public int createRandomNumber()
{
Random r=new Random();
int randomnumber=r.nextInt(10000);
return randomnumber;
}

/*
 * @author Geetha
 * provide currentsysdate
 */

public String CurrentSysDate()
{
	Date d = new Date();
	String sysdate=d.toString();
	return sysdate;	
}

/*
 * @author Geetha
 * provide getcurrentmonth
 */
public int Currentmonth()
{
Date d=new Date();
int currentmonth=d.getMonth();
return currentmonth;
}

/*
 * author Geetha
 * provide getdate
 */
public String getdate()
{
	Date d = new Date();
	String getdate=d.toString();
	String arr[]=getdate.split(" ");
	return arr[0];
}
 
}





	

