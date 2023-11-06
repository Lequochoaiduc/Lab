package EX7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
public static List<String> loadworld (String fileName) throws FileNotFoundException {
	List<String> re = new ArrayList<String>();
	Scanner input = new Scanner(new File(fileName));
	while (input.hasNext()) {
		String string = (String) input.next();
		System.out.println(string);
		re.add(string);
	}
	return re;
	
}
public static void main(String[] args) throws FileNotFoundException {
	Utils u = new Utils();
	u.loadworld("res/LOVE.txt");
	
}
}
