package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Character_Encryptor {
	static String input = "";

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("What is your message?");
		for (int i = 0; i < s.length(); i++) {
			input += s.charAt(i) + 10 + " ";
		}
		System.out.println(input);
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");

			/*
			 * NOTE: To append to a file that already exists, add true as a
			 * second parameter when calling the FileWriter constructor. (e.g.
			 * FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt",
			 * true);)
			 */

			fw.write(input);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
