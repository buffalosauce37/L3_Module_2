import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyRight {
	static String line;
	static String fileContent = "";

	public static void addCopyRight(File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

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
			FileWriter fw = new FileWriter(file, false);
			fw.write("wow" + fileContent);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File folder = new File("src");
		File[] files = folder.listFiles();
		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName();
			if (filename.contains(".java")) {
				System.out.println(files[i]);
			}
		}
	}
}
