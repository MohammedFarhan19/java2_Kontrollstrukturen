package java2_Kontrollstrukturen;

public class One {
	
	public static void main(String[] args) {
		
//		This is about how to use If statement......  
		
		int number = (int)( Math.random()* 5 +1);
		
		System.out.println("Welche Zahl, raten Sie!,zwischen 1 und 5   ");
		
		int guss=new java.util.Scanner(System.in).nextInt();
		
		if(number == guss)
		{
			System.out.println("Super getippt");
		}
		
		
		System.out.printf("Falsch gedacht...,%n%s .... das wäre richtig gewesen....",number);
		
	}

}
