package p3_8;

public class LetterPrinter 
{

	public static void main(String[] args) 
	{
		Letter breakUp = new Letter("John", "Mary");
		breakUp.addLine("I am sorry we must part.");
		breakUp.addLine("I wish you all the best.");
		breakUp.addLine("It really be like that sometimes.");
		System.out.println(breakUp.getText());
	}

}
