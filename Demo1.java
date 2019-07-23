package iodemos;
 import java.io.File;
 import java.io.IOException;
public class Demo1 {
	 public static void main(String[] args) throws IOException {
		
		 File f = new File("C:\\MyProjects\\BatchMates");
		 File f1 = new File("C:\\MyProjects\\BatchMates\\student");
		 File f2 = new File("C:\\MyProjects\\BatchMates\\BatchMates.txt");
		 if(f.exists())
		 {
			 File allFiles[] = f.listFiles();
			 for(File temp : allFiles)
			 {
				 if(temp.isDirectory())
				 {
					 System.out.println(temp + " is a directory");
				 }
				 else
				 {
					 System.out.println(temp + " is a file");
				 }
			 }
			 
		 }
		 else
		 {
			 f.mkdir();
			 f1.mkdir();
			 f2.createNewFile();
			 System.out.println("File and folder created ");
		 }
	}

}
