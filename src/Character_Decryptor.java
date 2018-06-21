
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Character_Decryptor {
	static JFileChooser jfc = new JFileChooser();
	static String fileName;
	static String decoded="";
	public static void main(String[] args) {
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);
		}
		try {
			FileReader fr = new FileReader(fileName);
			int c = fr.read();
			while (c != -1) {
				c -= 10;
				decoded += (char)c;
				c = fr.read();
			}
			JOptionPane.showMessageDialog(null, decoded);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
