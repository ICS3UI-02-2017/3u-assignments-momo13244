package Assignment_8;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.Timer;

/**
 *
 * @author elmam0030
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    Color darkGreen = new Color(0, 102, 0);
    Color brown = new Color(102, 51, 0);
    Color ground = new Color(153, 115, 0);
    Color lightBlue = new Color(26, 198, 255);
    
    BasicStroke thickerLine = new BasicStroke(15);
    
    BasicStroke normal = new BasicStroke(15);

    int lOfTree1 = 450;
    int lOfTree2 = 650;
    int lOfLeave1 = 400;
    int lOfLeave2 = 600;
    int lOfLegs = 370;    
    int LOfFeet = 450;
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE\
        
        // make the sky
        g.setColor(lightBlue);
        g.fillRect(0, 0, WIDTH, 400);
        g.setColor(ground);    
        // make the ground
        g.fillRect(0, 400, WIDTH, 400);
        
        // make the trees
        g.setColor(brown);
        g.fillRect(lOfTree1, 200, 50, 200);
        g.fillRect(lOfTree2, 250, 50, 150);
        g.setColor(darkGreen);
        g.fillRect(lOfLeave1, 100, 150, 100);
        g.fillRect(lOfLeave2, 150, 150, 100);
        
        
        // set color to green
        g.setColor(Color.GREEN);
       
        // make body of dinosaur
        g.fillOval(300, 200, 100, 50);
        g.fillRect(300, 230, 50, 100);
        g.fillOval(300, 270, 50, 100);
        g.fillOval(50, 295, 300, 100);
        // legs       
        g.fillRect(75, lOfLegs, 50, 100);
        g.fillRect(275, lOfLegs, 50, 100);
        // change color for feet
        g.setColor(darkGreen);
        g.fillOval(73, LOfFeet, 75, 40);
        g.fillOval(273, LOfFeet, 75, 40);
        // change color for eyes
        g.setColor(Color.BLACK);
        // create face of dinosaur
        g.drawOval(350, 215, 15, 15);
	g.fillOval(355, 220, 5, 5);
	g.fillArc(335, 225, 40, 20, 160, 220);
        
        
        
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
        if(lOfLeave1 != -150){  
            lOfLeave1 = lOfLeave1 -5;
            lOfTree1 = lOfTree1 - 5;
        } else {
            lOfLeave1 = WIDTH + 150; 
            lOfTree1 = WIDTH + 200;
        }
        
        if(lOfLeave2 != -150){  
            lOfLeave2 = lOfLeave2 -5;
            lOfTree2 = lOfTree2 - 5;
        } else {
            lOfLeave2 = WIDTH + 150;
            lOfTree2 = WIDTH + 200;
        }    
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}

