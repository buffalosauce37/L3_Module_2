import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyRight {
	static String line;
	static String fileContent = "";
	public static void main(String[] args) {
		File folder = new File("src");
		File[] files = folder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test.txt"));

			 line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				fileContent += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt", false);
			fw.write("wow"+ fileContent);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
