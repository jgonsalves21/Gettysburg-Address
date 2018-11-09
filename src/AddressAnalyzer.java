/**
 * 
 * @author Joshua Gonsalves
 * Gettysburg Address
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import  java.util.Scanner;
public class AddressAnalyzer {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner in = new Scanner(System.in);
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> words = new ArrayList<String>();
		int numWords = 0;
		String longWord = file.next();
		double aveLength = 0;
		
		while (file.hasNext())
		{
			String word = file.next();
			numWords ++;
			if (word.length() > longWord.length())
			{
				longWord = word;
			}
			aveLength = aveLength + word.length();
		}
		aveLength = aveLength/numWords;
		
		System.out.println("The longest word is " + longWord + ".");
		System.out.println("The average word length is " + aveLength + ".");
		System.out.println("The number of words is " + numWords + ".");

	}

}
