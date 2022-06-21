package Aufgabenset2;
import java.util.Scanner;

public class Wallet {
	
	Scanner input = new Scanner(System.in);
	String billTypes[] = {"10Fr.", "20Fr.", "50Fr.", "100Fr.", "200Fr.", "1'000Fr."};
	ConsoleSwitch selectType = new ConsoleSwitch("Wählen Sie den Notentyp", billTypes, "Diese Note gibts nicht");
	int billValues[] = {10, 20, 50, 100, 200, 1000};
	int amount = 0;
	int currentValue = 0;
	
	void addBill() {
		System.out.println("Geben Sie die Anzahl hinzuzufügender Noten ein");
		amount = input.nextInt();
		if(selectType.ask()) {
			currentValue += amount * billValues[(selectType.answer - 1)];
		}
		
	}
	void getAmount() {
		System.out.println("Ihr Guthaben beträgt:\t" + currentValue);
		System.out.println();
	}
	
//--------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		
		Wallet myWallet = new Wallet();
		
		while (true) {
			myWallet.addBill();
			myWallet.getAmount();
		}

	}

}
