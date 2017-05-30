import java.net.URL;
import java.util.Scanner;
import java.util.Random;

public class MovieTitles
{
	public static void main(String[] args) throws Exception
	{

		String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");
		Random rand = new Random();



		System.out.println("Myxyllplyk's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		int adjectiveIndex = rand.nextInt(adjectives.length); //3
		int nounIndex = rand.nextInt(nouns.length); //5
		String adjective = adjectives[adjectiveIndex];// [red,gree,bcsdcv,e..adjective.]
		String noun = nouns[nounIndex];
		System.out.println( "Your movie title is: " + adjective + " " + noun );

		
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}