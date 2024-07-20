package practicePrograms;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextInFileDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\Files\\textWrite.txt", true);
		fw.write("New line appended");
		System.out.println("appending task completed another time");
		fw.close();
		
		

	}

}
