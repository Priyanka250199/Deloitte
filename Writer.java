package iodemos;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
public static void main(String[] args) throws IOException {
	


	FileWriter fw = new FileWriter("C:\\MyProjects\\stu.txt");
	
	fw.write("Hello, Good Morning");
	
	fw.close();
	
	System.out.println("done");
}
}