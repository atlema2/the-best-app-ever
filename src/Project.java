import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Project {

	public static void main(String args[])
	{
		//super(game.Tournament_Name);	
		new Project();
	}

	public Project()
	{
		
		//SmashTournament game = new SmashTournament();
		Tournament t = new Tournament();
	
		JFrame frame = new JFrame(t.getName());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scroll=new JScrollPane();
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(scroll,BorderLayout.CENTER);
		frame.setSize(500,450);
		frame.setVisible(true);
	}
}