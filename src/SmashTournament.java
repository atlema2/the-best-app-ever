import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SmashTournament  {	



	public int NumPlayers=0;
	public ArrayList playerNames = new ArrayList<String>();
	public String Tournament_name;
public SmashTournament(){
	// TODO Auto-generated constructor stub
/*
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	setResizable(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setBackground(Color.black);
    setTitle("Smash Tournament");
	setVisible(true);
	*/
	
	

	
	Scanner scan = new Scanner(System.in);
		System.out.println("Tournament Name?");
		Tournament_name = scan.nextLine();
		System.out.print(Tournament_name);
		System.out.println();
		System.out.println();
	
	// number of players
	NumPlayers = 0;
	while(true){
		System.out.println("Number of Players: ");
		boolean isvalid = true;
		try {
		    NumPlayers = Integer.parseInt(scan.nextLine());
		    if(NumPlayers < 0) throw new Exception();
		} catch (Exception e) {
			isvalid=false;
		}
		if(isvalid)
			break;
		else
			continue;
	}
		System.out.println(NumPlayers);
		
	//Player names
		System.out.println("Player names: ");	
		//String playerNames[] = new String[NumPlayers];
		for(int count = 0; count < NumPlayers; count++)
		{
			String a = scan.nextLine();
			playerNames.add(a);
		}
		//String playerNames[] ={"a", "b","c", "d"};
		for(int x = 0; x < playerNames.size(); x++){
			System.out.println(playerNames.get(x));
		}
		System.out.println(playerNames.toString());

		
		int x = 0;
			/*while(x<playerNames.length){
				playerNames[x] = scan.nextLine();
				System.out.println(playerNames[x]);
				x++;
			}*/
			shuffleArray(playerNames);
			System.out.println();
			System.out.println("Shuffled names: ");
			System.out.println();
			for ( int counter = 0; counter < playerNames.size(); counter++){
				System.out.println(playerNames.get(counter));
			}
			
			
}
	
static void shuffleArray(ArrayList<String> playerNames)  {
				    // If running on Java 6 or older, use `new Random()` on RHS here
				    Random rnd = ThreadLocalRandom.current();
				    for (int i = playerNames.size() - 1; i >= 0; i--)
				    {
				      int index = rnd.nextInt(playerNames.size() - 1);
				      // Simple swap
				      String a = playerNames.get(index);
				      playerNames.remove(index);
				      playerNames.add(i, a);
				     // playerNames.add(index, playerNames.get(i));
				      
				      //playerNames[index] = playerNames[i];
				     // playerNames[i] = a;
				    }
				  

		

		}
	
public int getNumPlayers(){return NumPlayers;}

public String getplayerNames() {
	// TODO Auto-generated method stub
	return playerNames.toString();
}
}


				  