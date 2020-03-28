package java2_Kontrollstrukturen;

public class Two {
	
	public static void main (String [] args) {
		
		// this is how to use if with else....
		
		//hier we create a Variable numberToGusss and put in it a random number using method random()
		
		int numberToGuess = (int) (Math.random() * 10 + 1);
		
		System.out.println("Tippen Sie eine Zahl zwische 1 und 10! ");
		
		int guess=new java.util.Scanner(System.in).nextInt();
		
		if(numberToGuess == guess)
			System.out.println("Super....");
		else
			System.out.printf("Naja, meine zahl is %s%nversuchen Sie es noch mal!",numberToGuess);
		
	}

}
