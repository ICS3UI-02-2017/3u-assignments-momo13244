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
    int balance = 50000;
    
    Color brown = new Color(153, 102, 0);
    Color dBrown = new Color(77, 38, 0);
    Color gray = new Color (192,192,192);
    Color backGround = new Color(51, 187, 255);
    
    BasicStroke thickerLine = new BasicStroke(5);
    
    // create integers for amount of Cookie makers owned
    int amountOfClickers = 0;
    int amountOfGrandmas = 0;
    int amountOfBakerys = 0;
    int amountOfCookieF = 0;
    int amountOfFactories = 0;
    int amountOfCookieL = 0;
    int amountOfCookieC = 0;
    int amountOfGarys = 0;
    
    // create integers for cost of creaters
    int costOfClicker = 10;
    int costOfGrandma = 100;
    int costOfBakery = 500;
    int costOfCookieF = 1000;
    int costOfFactories = 5000;
    int costOfCookieL = 10000;
    int costOfCookieC = 50000;
    int costOfGary = 100000;
    
    
    Font biggerFont = new Font("Arial", Font.BOLD, 36);
    Font biggestFont = new Font("Arial", Font.BOLD, 48);
    
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
    int addedC = 1;
    int addedC2 = 50;
    int addedC3 = 200;
    int addedC4 = 700;
    int addedC5 = 3000;
    int addedC6 = 7000;
    int addedC7 = 20000;
    int addedC8 = 75000;
    
    
    long lastTime = 0;
    
    

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
        
        // Make the shop menu
        g.setColor(gray);
        // Clicker
        g.fillRect(1, 1, 350, 100); 
        // Grandma
        g.fillRect(1, 100, 350, 100);
        // Bakery
        g.fillRect(1, 200, 350, 100);
        // Cookie Farm
        g.fillRect(1, 300, 350, 100);
        // Factory
        g.fillRect(1, 400, 350, 100);
        // Cookie Lab
        g.fillRect(1, 500, 350, 100);
        // Cookie Cloner
        g.fillRect(1, 600, 350, 100);
        // gary
        g.fillRect(1, 700, 350, 100);
        
        // outline boxes
        g.setColor(Color.BLACK);
        g.drawRect(1, 1, 350, 100);
        g.drawRect(1, 100, 350, 100);
        g.drawRect(1, 200, 350, 100);
        g.drawRect(1, 300, 350, 100);
        g.drawRect(1, 400, 350, 100);
        g.drawRect(1, 500, 350, 100);
        g.drawRect(1, 600, 350, 100);
        g.drawRect(1, 700, 350, 100);
        
        // draw the shop names
        g.setFont(biggestFont);
        g.drawString("Clicker", 10, 100);
        g.drawString("Grandma", 10, 200);
        g.drawString("Bakery", 10, 300);
        g.drawString("Cookie Farm", 10, 400);
        g.drawString("Factory", 10, 500);
        g.drawString("Cookie Lab", 10, 600);
        g.drawString("Cookie Cloner", 10, 700);
        g.drawString("Gary", 10, 790);
        
        
        
        
        
        
        // draw shop integers
        g.setColor(Color.WHITE);
        g.setFont(biggerFont);
	g.drawString(String.valueOf(balance), 630, 150);
        g.drawString(String.valueOf(amountOfClickers), 250, 40);
        g.drawString(String.valueOf(amountOfGrandmas), 250, 140);
        g.drawString(String.valueOf(amountOfBakerys), 250, 240);
        g.drawString(String.valueOf(amountOfCookieF), 250, 340);
        g.drawString(String.valueOf(amountOfFactories), 250, 440);
        g.drawString(String.valueOf(amountOfCookieL), 250, 540);
        g.drawString(String.valueOf(amountOfCookieC), 250, 640);
        g.drawString(String.valueOf(amountOfGarys), 250, 740);
        
        // draw costs of each building
        g.setColor(Color.GREEN);
        g.drawString(String.valueOf(costOfClicker), 20, 40);
        g.drawString(String.valueOf(costOfGrandma), 20, 140);
        g.drawString(String.valueOf(costOfBakery), 20, 240);
        g.drawString(String.valueOf(costOfCookieF), 20, 340);
        g.drawString(String.valueOf(costOfFactories), 20, 440);
        g.drawString(String.valueOf(costOfCookieL), 20, 540);
        g.drawString(String.valueOf(costOfCookieC), 20, 640);
        g.drawString(String.valueOf(costOfGary), 20, 740);
        



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
         
         if (amountOfFactories >= 1){
             Factory();
         }
         
         if (amountOfCookieL >= 1){
             CookieLab();
         }
         
         if (amountOfCookieC >= 1){
             CookieCloner();
         }
         
         if (amountOfGarys >= 1){
             Gary();
         }
         
    }
    
    // method for cookie generated by clicker
    public void clicker(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Grandmas
    public void Grandma(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC2;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Bakerys
    public void Bakery(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC3;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Cookie Farms
    public void CookieF(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC4;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Factory
    public void Factory(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC5;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Cookie Labs
    public void CookieLab(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC6;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Cookie Labs
    public void CookieCloner(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC7;
            lastTime = System.currentTimeMillis();
        }  
              
    }
    
    // method for cookie generated by Gary
    public void Gary(){
        
        if (System.currentTimeMillis() > lastTime + 1000 ){
            balance = balance + addedC8;
            lastTime = System.currentTimeMillis();
        }  
              
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
                balance = balance + 1;
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
            if (mouseY < 100 && mouseX < 350 && mouseY > 1 && mouseX > 1 && balance >= costOfClicker){
                // add clicker to amount of clickers
                amountOfClickers = amountOfClickers +1;
                // take away cost of from the balance
                balance = balance - costOfClicker;
                // make it more expensive for next clicker
                costOfClicker = costOfClicker + (addedC + 5);
                // add more amount of cookies made for sec
                addedC = addedC + addedC;
            }
            
            
            // click box for Grandma
            if (mouseY < 200 && mouseX < 350 && mouseY > 100 && mouseX > 1 && balance >= costOfGrandma){
                
                amountOfGrandmas = amountOfGrandmas +1;
                
                balance = balance - costOfGrandma;
                
                costOfGrandma = costOfGrandma + (addedC2 + 25);
                
                addedC2 = addedC2 + addedC2;
            }
            
            // click box for Bakery
            if (mouseY < 300 && mouseX < 350 && mouseY > 200 && mouseX > 1 && balance >= costOfBakery){
                
                amountOfBakerys = amountOfBakerys +1;
                
                balance = balance - costOfBakery;
                
                costOfBakery = costOfBakery + (addedC3 + 200);
                
                addedC3 = addedC3 + addedC3;
            }
            
            // click box for Cookie Farm
            if (mouseY < 400 && mouseX < 350 && mouseY > 300 && mouseX > 1 && balance >= costOfCookieF){
                
                amountOfCookieF = amountOfCookieF +1;
                
                balance = balance - costOfCookieF;
                
                costOfCookieF = costOfCookieF + ( (addedC4 / 3) + 700);
                
                addedC4 = addedC4 + addedC4;
                
            }
            
            // click box for Factory
            if (mouseY < 500 && mouseX < 350 && mouseY > 400 && mouseX > 1 && balance >= costOfFactories){
                
                amountOfFactories = amountOfFactories +1;
                
                balance = balance - costOfFactories;
                
                costOfFactories = costOfFactories + (addedC5 + 3000);
                
                addedC5 = addedC5 + addedC5;
            }
            
            // click box for Cookie Lab
            if (mouseY < 600 && mouseX < 350 && mouseY > 500 && mouseX > 1 && balance >= costOfCookieL){
                
                amountOfCookieL = amountOfCookieL+1;
                
                balance = balance - costOfCookieL;
                
                costOfCookieL = costOfCookieL + (addedC6 + 7000);
                
                addedC6 = addedC6 + addedC6;
            }
            
            // click box for Cookie Cloner
            if (mouseY < 700 && mouseX < 350 && mouseY > 600 && mouseX > 1 && balance >= costOfCookieC){
                
                amountOfCookieC = amountOfCookieC+1;
                
                balance = balance - costOfCookieC;
                
                costOfCookieC = costOfCookieC + (addedC7 + 20000);
                
                addedC7 = addedC7 + addedC7;
            }
            
            // click box for Gary
            if (mouseY < 800 && mouseX < 350 && mouseY > 700 && mouseX > 1 && balance >= costOfGary){
                
                amountOfGarys = amountOfGarys +1;
                
                balance = balance - costOfGary;
                
                costOfGary = costOfGary + (addedC8 + 75000);
                
                addedC8 = addedC8 + addedC8;
            }
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (mouseY < 500 && mouseX < 740 && mouseY > 300 && mouseX > 540){
                
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

