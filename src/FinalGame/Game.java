package FinalGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
public class Game extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1280;
    static final int HEIGHT = 800;

    //Title of the window
    String title = "Cookie Clicker";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    
    // create the money counter
    double balance = 0;
    // create rounded money counter
//    double balance2 = 0;
    
    Color brown = new Color(153, 102, 0);
    Color dBrown = new Color(77, 38, 0);
    Color gray = new Color (192,192,192);
    Color backGround = new Color(51, 187, 255);
    
    BasicStroke thickerLine = new BasicStroke(5);
    
    // create integers for amount of Cookie makers owned
    double amountOfClickers = 0;
    double amountOfGrandmas = 0;
    double amountOfBakerys = 0;
    double amountOfCookieF = 0;
    
    
    // create prices of creators
    double costOfClicker = 15;
    double costOfGrandma = 100;
    double costOfBakery = 500;
    double costOfCookieF = 1000;
    
    double clickCps = 1;
    
    
    // make rounded doubles
    
    
    
    Font biggerFont = new Font("Arial", Font.BOLD, 36);
    Font biggestFont = new Font("Arial", Font.BOLD, 78);
    Font biggestFont2 = new Font("Arial", Font.BOLD, 56);
    
    // create coordinates for all parts of cookie
    int cookieX = 540;
    int cookieY = 300;
    int cookieX1 = 200;
    int chipX1 = 590;
    int chipY1 = 350;
    int chipX2 = 580;
    int chipY2 = 420;
    int chipX3 = 690;
    int chipY3 = 390;
    int chipX4 = 660;
    int chipY4 = 460;
    int chipX5 = 660;
    int chipY5 = 360;
    int chipX6 = 640;
    int chipY6 = 410;
    int chipX7 = 640;
    int chipY7 = 330;
    int chipX8 = 600;
    int chipY8 = 460;
    int chipX9 = 580;
    int chipY9 = 380;
    int chipXY = 20;
    
    // create integer for increase of cookie production
    double addedC = 1;
    double addedC2 = 5;
    double addedC3 = 50;
    double addedC4 = 500;
    
    
    
    
    long lastTime = 0;
    long lastTime2 = 0;
    long lastTime3 = 0;
    long lastTime4 = 0;
    
    
    
    

    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Game(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(true);
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

        // GAME DRAWING GOES HERE
        g.setColor(backGround);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
  
        
        g.setColor(brown);
        g.fillOval(cookieX, cookieY, cookieX1, cookieX1);       
        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawOval(cookieX, cookieY, cookieX1, cookieX1);
	
        
        g.setColor(dBrown);
        g.fillOval(chipX1, chipY1, chipXY, chipXY);
        g.fillOval(chipX2, chipY2, chipXY, chipXY);
        g.fillOval(chipX3, chipY3, chipXY, chipXY);
        g.fillOval(chipX4, chipY4, chipXY, chipXY);
        g.fillOval(chipX5, chipY5, chipXY, chipXY);
        g.fillOval(chipX6, chipY6, chipXY, chipXY);
        g.fillOval(chipX7, chipY7, chipXY, chipXY);
        g.fillOval(chipX8, chipY8, chipXY, chipXY);
        g.fillOval(chipX9, chipY9, chipXY, chipXY);
        
        
         
        
        
        g.setColor(Color.BLACK);
        // cookie counter box
        g.fillRect(350, 80, 1000, 100);
        
        // Make the shop menu
        g.setColor(gray);
        // background gary 
        g.fillRect(1, 1, 350, HEIGHT);
        
        
        // outline boxes
        g.setColor(Color.BLACK);
        g.drawRect(1, 1, 350, 200);
        g.drawRect(1, 200, 350, 200);
        g.drawRect(1, 400, 350, 200);
        g.drawRect(1, 600, 350, 200);
        
        
        
        // draw the shop names
        g.setFont(biggestFont);
        g.drawString("Clicker", 10, 200);
        g.drawString("Grandma", 10, 400);
        g.drawString("Bakery", 10, 600);
        g.setFont(biggestFont2);
        g.drawString("Cookie Farm", 10, 800);
        
        
        
        
        
        
        
        // draw shop integers
        g.setColor(Color.WHITE);
        g.setFont(biggerFont);
	g.drawString(String.valueOf((int)balance), 630, 150);
        g.drawString(String.valueOf((int)amountOfClickers), 250, 40);
        g.drawString(String.valueOf((int)amountOfGrandmas), 250, 240);
        g.drawString(String.valueOf((int)amountOfBakerys), 250, 440);
        g.drawString(String.valueOf((int)amountOfCookieF), 250, 640);
        
        
        // draw costs of each building
        g.setColor(Color.GREEN);
        g.drawString(String.valueOf((int)costOfClicker), 20, 40);
        g.drawString(String.valueOf((int)costOfGrandma), 20, 240);
        g.drawString(String.valueOf((int)costOfBakery), 20, 440);
        g.drawString(String.valueOf((int)costOfCookieF), 20, 640);
        



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
        

        
        if (System.currentTimeMillis() > lastTime + 1000 ){
                if (amountOfClickers >= 1){
                clicker();
                }
         
                if (amountOfGrandmas >= 1){
                Grandma();
                }
         
                if (amountOfBakerys >= 1){
                Bakery();
                }
         
                if (amountOfCookieF >= 1){
                CookieF();
                }
         
            // set new time for lastTime variable
                lastTime = System.currentTimeMillis();  
            }
    }
    
    // method for cookie generated by clicker
    public void clicker(){
        // add the created cookies to the balance counter
            balance = balance + addedC;      
    }
    
    // method for cookie generated by Grandmas
    public void Grandma(){      
            balance = balance + addedC2;         
    }
    
    // method for cookie generated by Bakerys
    public void Bakery(){
            balance = balance + addedC3; 
    }
    
    // method for cookie generated by Cookie Farms
    public void CookieF(){     
            balance = balance + addedC4;            
    }
    
    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            // click box for cookie
            if (mouseY < 500 && mouseX < 740 && mouseY > 300 && mouseX > 540){
                balance = balance + clickCps;
                cookieX = 540 + 10;
                cookieY = 300 + 10;
                cookieX1 = 200 - 20;
                chipX1 = 590 + 5;
                chipY1 = 350 + 5;
                chipX2 = 580 + 5;
                chipY2 = 420 + 5;
                chipX3 = 690 + 5;
                chipY3 = 390 + 5;
                chipX4 = 660 + 5;
                chipY4 = 460 + 5;
                chipX5 = 660 + 5;
                chipY5 = 360 + 5;
                chipX6 = 640 + 5;
                chipY6 = 410 + 5;
                chipX7 = 640 + 5;
                chipY7 = 330 + 5;
                chipX8 = 600 + 5;
                chipY8 = 460 + 5;
                chipX9 = 580 + 5;
                chipY9 = 380 + 5;
                chipXY = 20 - 5;
            }
            
            
            // click box for clicker
            if (mouseY < 200 && mouseX < 350 && mouseY > 1 && mouseX > 1 && balance >= costOfClicker){
                // add clicker to amount of clickers
                amountOfClickers = amountOfClickers +1;
                // take away cost of from the balance
                balance = balance - costOfClicker;
                // make it more expensive for next clicker
                costOfClicker = 15 * Math.pow(1.15, amountOfClickers);
                if(amountOfClickers >= 2){
                    // add more amount of cookies made for sec
                    addedC = addedC + 1;
                }
            }
            
            
            
            // click box for Grandma
            if (mouseY < 400 && mouseX < 350 && mouseY > 200 && mouseX > 1 && balance >= costOfGrandma){
                
                amountOfGrandmas = amountOfGrandmas +1;
                
                balance = balance - costOfGrandma;
                
                costOfGrandma = 100 * Math.pow(1.15, amountOfGrandmas);
                
                if(amountOfGrandmas >= 2){
                    
                    addedC2 = addedC2 + 5;
                }
            }
            
            // click box for Bakery
            if (mouseY < 600 && mouseX < 350 && mouseY > 400 && mouseX > 1 && balance >= costOfBakery){
                
                amountOfBakerys = amountOfBakerys +1;
                
                balance = balance - costOfBakery;
                
                costOfBakery = 1100 * Math.pow(1.15, amountOfBakerys); 
                               
                if(amountOfBakerys >= 2){
                    // add more amount of cookies made for sec
                    addedC3 = addedC3 + 50;
                }
            }
            
            // click box for Cookie Farm
            if (mouseY < 800 && mouseX < 350 && mouseY > 600 && mouseX > 1 && balance >= costOfCookieF){
                
                amountOfCookieF = amountOfCookieF +1;
                
                balance = balance - costOfCookieF;
                
                costOfCookieF = 12000 * Math.pow(1.15, amountOfCookieF); 
                
                if(amountOfCookieF >= 2){
                    // add more amount of cookies made for sec
                    addedC4 = addedC4 + 500;
                }
                
            }
            
            
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (mouseY < 500 && mouseX < 740 && mouseY > 300 && mouseX > 540){
                
                // restore coordinates to their original state
                cookieX = 540;
                cookieY = 300;
                cookieX1 = 200;
                chipX1 = 590;
                chipY1 = 350;
                chipX2 = 580;
                chipY2 = 420;
                chipX3 = 690;
                chipY3 = 390;
                chipX4 = 660;
                chipY4 = 460;
                chipX5 = 660;
                chipY5 = 360;
                chipX6 = 640;
                chipY6 = 410;
                chipX7 = 640;
                chipY7 = 330;
                chipX8 = 600;
                chipY8 = 460;
                chipX9 = 580;
                chipY9 = 380;
                chipXY = 20;
            }
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
        Game game = new Game();
    }
}

