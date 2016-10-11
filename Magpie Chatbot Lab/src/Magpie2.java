
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	private int findKeyword(String statement, String goal, int startPos)

	{

	String phrase = statement.trim();

	int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

	while (psn >= 0)

	{

	String before = " ", after = " ";

	if (psn > 0)

	{

	before = phrase.substring (psn - 1, psn).toLowerCase();

	}

	if (psn + goal.length() < phrase.length())

	{

	after = phrase.substring(psn + goal.length(),

	psn + goal.length() + 1).toLowerCase();

	}

	/* determine the values of psn, before, and after at this point in the method. */

	if (before.equals (" ")  &&  after.equals(" "))

	{

	return psn;

	}

	psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

	}

	return -1;

	}
	
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("Dove") >= 0
				|| statement.indexOf("Hensley") >= 0
				|| statement.indexOf("Phillips") >= 0
				|| statement.indexOf("Campbell") >= 0) {
			response = "They sound like good teachers.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "That's nice to know.";
		} else if (whichResponse == 5) {	
			response = "Wow! Very cool!";
		}
		return response;
	}
}


