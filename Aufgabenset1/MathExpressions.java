package Aufgabenset1;

public class MathExpressions {


	
	public static void main(String[] args) {
		
		
		// Aufgabe 3 - Ausdrücke
		float a = 2;
		float b = 3;
		float c = 4;
		float d = 5;
		float f = 6;
		float k = 7;
		float x = 8;
		float y = 9;
		float z = 10;
		

		float result1 = a/b + d/b - a/d;	//a
		float result2 = a*b/d + d/c;		//b
		float result3 = (x-y)/z + k*b/a;	//c
		float result4 = d/a/b + k/(a-b);	//d
		float result5 = (b+c)*a/b;			//e
		float result6 = 4*f/9 + 32;		//f
		float result7 = (a*b + a*c)/(b*d - c*d);					//g
		float result8 = a/(b+c) * (7*x-3)/(3*x + 4*x*y - 3);		//h
		float result9 = (5 + a/b)/(c + 3/d);						//i
		float result10 = (a + 4*z/y)*3*d/(2*a - 5*b)/7/k - (3*a - 3*b)/4/d - 4*z/k;		//j
		
		float results[] = {result1, result2, result3, result4, result5, result6, result7, result8, result9, result10};
		
		
		
		for (float num : results) {
			System.out.println(num);
		}
	}
	
}
