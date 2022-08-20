package first;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class L123 {

	public static void main(String[] args) {
		try {
			FileReader filereader  = new FileReader("dimple.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}
