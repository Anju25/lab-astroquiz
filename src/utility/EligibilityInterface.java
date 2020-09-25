package utility;

import model.User;

public interface EligibilityInterface
{
	boolean checkUser(User user);
	boolean checkQuizAnswer(String points);
}