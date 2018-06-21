//Copy Right by Jack Alexander
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyRight {


	public static void addCopyRight(File file) {
		String fileContent = "";
		String line;
		try {BufferedReader br = new BufferedReader(new FileReader(file));

			line = br.readLine();
			while (line != null) {
				fileContent += line + "\n";
				System.out.println(line);
				line = br.readLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter(file, false);
			fw.write("//Copy Right by Jack Alexander" + "\n" + fileContent);
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
				addCopyRight(files[i]);
			}
		}
	}
}

