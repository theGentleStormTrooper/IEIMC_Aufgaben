package Aufgabenset1;

public class outputThings {
	
	

	public static void main(String[] args) {
		
		Declarations  set1 = new Declarations();
		int[] numbers = {1,2,3,4};
		
		set1.getName();
		System.out.println("born: \t\t" + set1.birthDate);
		for (int var : numbers) {
			System.out.println(var);
		}
		
	}

}
