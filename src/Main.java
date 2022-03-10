import javax.swing.SwingUtilities;

/**
 * 
 * @author josel
 */
public class Main {

	/**
	 * @param args string
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MainWindow mw = new MainWindow();
			    mw.setSize(600,400);
			    mw.setTitle("Snake and Ladder");
			    mw.setVisible(true);
			}
		});
	}

}
