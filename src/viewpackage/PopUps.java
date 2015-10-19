package viewpackage;

import javax.swing.JOptionPane;
import controllerpackage.Controller;

public class PopUps
{
	public void displayTestResults(String resultOne, String resultTwo)
	{
		JOptionPane.showMessageDialog(null, resultOne + " " + resultTwo);
	}
}
