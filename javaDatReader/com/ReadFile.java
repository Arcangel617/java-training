import java.io.*;
import java.util.*;

public class ReadFile {
	private Scanner x;

	public void openFile(){
		try{
			x = new Scanner(new File("example.dat"));
		}
		catch(Exception e){
			System.out.println("Could not find file");
		}
	}

	public void readFile(){
		// while(x.hasNext()){
			// String a = x.next();

			// System.out.printf("%s",a);
		// }
		if (x.hasNext()) {
			System.out.println("Tiene algo");
		}else{
			System.out.println("No tiene una mierda");
		}
	}

	public void closeFile(){
		x.close();
	}
}
