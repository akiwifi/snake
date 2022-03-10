
import java.awt.Color;


/**
 * 
 * @author josel
 */
public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;
    
    
    /**
     * 
     * @param no int
     */
    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }
    /**
     * 
     * @return platerposn
     */
    public int getPosition() {
        return playerPosn;
    }
    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param posn int
     */
    public void setPosition(int posn) {
        playerPosn = posn;
    }
    /**
     * 
     * @param posn int
     */
    public void incPosition(int posn) {
        playerPosn += posn;
    }
    /**
     * 
     * @param c gsg
     */
    public void setPlayerColor(Color c) {
        playerColor = c;
    }
    /**
     * 
     * @return playercolor
     */
    public Color getPlayerColor() {
        return playerColor;
    }
    /**
     * 
     * @param a int
     */
    public void incPlayerScore(int a) {
        playerScore += a;
    }
    /**
     * 
     * @return platerscore
     */
    public int getPlayerScore() {
        return playerScore;
    }

}
