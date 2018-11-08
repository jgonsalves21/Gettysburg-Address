
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import  java.util.Scanner;
public class AddressAnalyzer {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> words = new ArrayList<String>();
		int numWords = 0;
		String longWord = file.next();
		double aveLength = 0;
		
		for (int a : words)
		{
			
		}
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
		
		System.out.println(longWord);
		System.out.println(aveLength);
		System.out.println(numWords);

	}

}
