import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	
	void setup(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("add task");
	JButton button2 = new JButton("remove task");
	JButton button3 = new JButton("save");
	JButton button4 = new JButton("load");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
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
		
	}
}
