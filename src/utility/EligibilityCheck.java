package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface
{

	@Override
	public boolean checkUser(User user) 
	{
		int age=user.getAge();            
	    int weight=user.getWeight();
	    int height=user.getHeight();
	    String country=user.getCountry();
	    if((age>=18 && age<=35) && (height>=155 &&height <=170) &&(weight>=55 && weight<=90) && (country.contains("ProGrad")))
		return true;
	    else 
	    	return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) 
	{
		int point=Integer.parseInt(points);
		if(point>=80)
		return true;
		else 
			return false;
	}

	@Override
	public
	boolean basicEligibilityCheck(User user) {
		if(checkUser(user))
		{
			return true;
		}
		else
		return false;
	}
	
}

/*public class EligibilityCheck extends BasicEligibility,
{
	@Override
	/*boolean basicEligibilityCheck(User user) 
	{
		if(checkUser(User user))
			return true;                      
		else                                  
		return false;                         
	},*/                                      
/*	implements EligibilityInterface           
	/*public boolean checkUser(User user)     
		{                                     
			int age=user.getAge();            
		    int weight=user.getWeight();
		    int height=user.getHeight();
		    String country=user.getCountry();
		    if((age>=15 && age<=35) && (height>=155 &&height <=170) &&(weight>=55 && weight<=90) && (country.contains("ProGrad")))
		    {
		    	return true;
		    }
		    else 
		    	return false;*/