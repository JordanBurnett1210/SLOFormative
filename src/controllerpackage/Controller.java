package controllerpackage;

import java.util.ArrayList;
import viewpackage.PopUps;

public class Controller
{
	private ArrayList<String> myString;
			
	private int myInt = 1;
	private double myDouble = 1.5;
	private PopUps myPopups;
	
	public Controller()
	{
		myPopups = new PopUps();
		myString = new ArrayList<String>();
	}
	
	public void start()
	{
		myString.add("Boogly");
		myString.add("Hitherehowareyouimfinebutimrunningoutofbreathbye.");
		getTestResults();
	}
	
	private void getTestResults()
	{
		String resultOne;
		String resultTwo;
		
		if(myString.size() == 5)
		{
			resultOne = "The array list is 5 words long";
		}
		else if(myString.size() > 5)
		{
			resultOne = "The array list is greater than 5 words long.";
		}
		else
		{
			resultOne = "The array list is less than 5 words long.";
		}
		
		if(myDouble > 2.0)
		{
			resultTwo = "The value of myDouble is greater than 2.0.";
		}
		else if(myInt == 1)
		{
			resultTwo = "The value of myInt == 1.";
		}
		else
		{
			resultTwo = "Both the previous tests failed.";
		}
		
		myPopups.displayTestResults(resultOne, resultTwo);
	}
	
}
