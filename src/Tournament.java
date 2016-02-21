import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

class Tournament extends JPanel {
	
	int number=4;
	int level=0;
	int height=25;
	int width=70;
	SmashTournament game = new SmashTournament();

 
	public void newTournament(int n) {
		number = n;
		
		setLayout(null);
		
		JTextField field=new JTextField(10);
		int level=0;
		
		int j=number;
		while (j>1) {
			for (int i=0; i<j; i++) {
				//this is where the text boxes are
				field=new JTextField(game.getplayerNames() ,10);
				this.add(field);
				field.setBounds(4+(width+20)*level,4+i*(height+4)*
						(int)Math.pow(2,level)+(height+4)*
						(int)Math.pow(2,level)/2,width,height);
			}
			level++;
			j=j/2;
		}

		int i=0;
		//phil always wins.
		field=new JTextField("phil",10);
		this.add(field);
		field.setBounds(4+(width+20)*level,4+
				i*(height+4)*(int)Math.pow(2,level)+
				(height+4)*(int)Math.pow(2,level)/2,width,height);
		this.level=level;

		this.setPreferredSize(new Dimension(5+(level+1)*(width+20),5+
				(height+4)*(number+1)));
	}

	public String getName(){
		return game.Tournament_name;
	}

	public void paint(Graphics g) {
		super.paint(g);
		int level=0;
		
		Color old=g.getColor();
		g.setColor(Color.red);
		int j=number;
		while (j>1) {
			for (int i=0; i<j; i++) {
				int x1=4+(width+20)*(level+1)-20;
				int y1=4+i*(height+4)*(int)Math.pow(2,level)+
						(height+4)*(int)Math.pow(2,level)/2 +10;
				g.drawLine(x1,y1,x1+10,y1);
				if (i%2==0) {
					int add=(height+4)*(int)Math.pow(2,level);
					g.drawLine(x1+10,y1,x1+10,y1+add);
					g.drawLine(x1+10,y1+add/2,x1+20,y1+add/2);
				}
			}
			level++;
			j=j/2;
		}
		g.setColor(old);
	}
}