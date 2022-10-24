package ceMail;

import java.util.Random;

/**
 * 
 * @author Gavin Barrett
 *
 */
public class Mail implements Comparable<Mail>
{
	private DeliveryType type;
	private String mailCode;
	
	/**
	 * constructor with parameters
	 * @param type
	 * @param mailCode
	 */
	public Mail(DeliveryType type, String mailCode)
	{
		this.type = type;
		this.mailCode = mailCode; //should store a 5 letter code that consists of all upper-case letters
	}
	
	
	/**
	 * constructor with no parameters
	 */
	public Mail()
	{
		this.type = this.randomType();
		this.mailCode = this.randomMailCode();
	}
	
	/**
	 * randomMailCode to make the mail code random
	 * @return
	 */
	private String randomMailCode()
	{
		Random random = new Random();
		String randomStr = "";
		int min = 65;
		int max = 90;

		for ( int i = 0; i < 5; i++ ) 
		{
		randomStr += Character.toString((char)(min + random.nextInt(max - min + 1)));
	
		}
		
		return randomStr;
	}
	
	/**
	 * randomType method is getting a random type for mail
	 * @return
	 */
	private DeliveryType randomType()
	{
		Random random = new Random();

		return DeliveryType.values()
		[
		random.nextInt(DeliveryType.values().length)
		];
		
	}

	@Override
	public String toString() 
	{
		return mailCode + "(" + type + ")";
	}

	@Override
	public int compareTo(Mail o) 
	{
		int compare = this.type.compareTo(o.type);
				
		
		return compare;
			
		
	}





	
}
	

