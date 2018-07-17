import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JButton add = new JButton("add task");
	JButton delete = new JButton("remove task");
	JButton save = new JButton("save");
	JButton load = new JButton("load");
	ArrayList<String> tasks = new ArrayList<>();
	String x;
	String y;

	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		frame.add(panel);
		panel.add(add);
		panel.add(delete);
		panel.add(save);
		panel.add(load);
		panel.add(label);
		add.addActionListener(this);
		delete.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		ToDoList todo = new ToDoList();
		todo.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			x = JOptionPane.showInputDialog("Add Task");
			tasks.add(x);
		}
		if (e.getSource() == delete) {
			y = JOptionPane.showInputDialog("Delete Task");
			tasks.remove(y);
		}
		if (e.getSource() == save) {
			String fileContents = "";
			for (int i = 0; i < tasks.size(); i++) {
				String s = tasks.get(i);
				fileContents += s + "\n";
			}
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/test.txt");
				fw.write(fileContents);
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();

			}
		}
		if (e.getSource() == load) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test.txt"));
				
				String line = br.readLine();
				while(line != null){
					System.out.println(line);
					line = br.readLine();
				}
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
