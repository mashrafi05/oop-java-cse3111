

package Pack;
import java.util.Scanner;

public class Mash {
	
	int id;
	String name;
	
	Mash(int i, String n ){
		id=i;
		name=n;
	}
	
	public static void main (String args[]) {
		
		Mash obj= new Mash(14,"Hello");


		
		System.out.println(obj.id);
		System.out.print(obj.name);
		
		
		
	}

}
