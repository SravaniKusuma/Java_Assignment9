import java.util.regex.*;
import java.util.Scanner;
public class PatternMatching {

	public static void main(String[] args) {
		String sentence;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence for pattern matching: ");
		sentence=sc.nextLine();
		Pattern pattern= Pattern.compile("[A-Z].*[.]");
		Matcher matcher =pattern.matcher(sentence);
		if(matcher.find())
		{
			System.out.println("The given sentence matches the regular expression");
		}
		else
		{
			System.out.println("The given sentence does not match the regular expression");
		}
		
	}

}
