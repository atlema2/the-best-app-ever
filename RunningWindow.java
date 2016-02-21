import java.awt.Color;
import javax.swing.JFrame;


class RunningWindow extends JFrame {

	private static final long serialVersionUID = -2445985173657810844L;
	public static final int WINDOW_WIDTH = 500, WINDOW_HEIGHT = 700;

	public RunningWindow(){
		// TODO Auto-generated constructor stub

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBackground(Color.black);
        setTitle("Breakout!");
		setVisible(true);
	}

	public static void main(String[] args) {
		Thread gameThread = new Thread(new Runnable()
		{
			public void run() {
				new RunningWindow();
			}
		
		});
		gameThread.start();
	}
}