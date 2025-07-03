
package Pack;
import java.util.Scanner;

public class Mash {
	
	int id;
	String name;
	
	void abc(int number,String n) {
		id=number;
		name=n;
		
	}
	
	public static void main (String args[]) {
		
		Mash obj= new Mash();


		obj.abc(15, "Hello");

		
		
		
		
		System.out.println(obj.id);
		System.out.print(obj.name);
		
		
		
	}

}
