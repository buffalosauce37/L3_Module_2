import java.io.File;

public class CopyRight {
public static void main(String[] args) {
	File folder = new File ("src");
	File[]files = folder.listFiles();
	for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
	}

}
}
