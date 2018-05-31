import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Character_Decryptor {
	static JFileChooser jfc = new JFileChooser();
	static String fileName = jfc.getSelectedFile().getAbsolutePath();
	public static void main(String[] args) {
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println(fileName);
		}
		try {
			FileReader fr = new FileReader(fileName);
			int c = fr.read();
			while(c != -1){
				System.out.print((char)c);
				c = fr.read();
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
