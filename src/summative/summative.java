package summative;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author Pures8098
 */
public class summative extends JComponent {
    // Height and Width of our game

    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //create players
    Rectangle player = new Rectangle(50, 400, 25, 50);
    Rectangle player2 = new Rectangle(WIDTH - 50, 400, 25, 50);
    Rectangle bullet = new Rectangle(player.x + 25, player.y + 15, 15, 15);
    Rectangle bullet2 = new Rectangle(player2.x - 15, player2.y + 15, 15, 15);
    //create player x and y axis
    int playerDX = 0;
    int playerDY = 0;
    //created player 2 x and y axis
    int player2DX = 0;
    int player2DY = 0;
    //ceate gravity
    int gravity = 1;
    //create amount 
    Rectangle[] blocks = new Rectangle[16];
    //boolean commands for movement 
    boolean playerUp = false;
    boolean playerRight = false;
    boolean playerLeft = false;
    boolean onGround = true;
    boolean player2Up = false;
    boolean player2Right = false;
    boolean player2Left = false;
    boolean onGround2 = true;
    boolean gun = false;
    boolean gun2 = false;
    boolean laserLength = false;
    boolean laser2Length = false;
    int bulletXDirection = 1;
    int bullet2XDirection = 1;
    //create velocity
    int bulletSpeed = 25;
    //create score
    int playerScore = 10;
    int playerScore2 = 10;
    Font scoreFont = new Font("comicsans", Font.BOLD, 42);
    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)

    public summative() {
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
    }
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)

    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        // GAME DRAWING GOES HERE
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.RED);
        g.fillRect(0, 0, WIDTH / 2, HEIGHT);
        for (int i = 0; i < blocks.length; i++) {
            g.setColor(Color.BLACK);
            g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
        }
        g.setColor(Color.CYAN);
        g.fillRect(player.x, player.y, player.width, player.height);
        g.setColor(Color.red);
        g.fillRect(player2.x, player2.y, player2.width, player2.height);
        g.setColor(Color.BLACK);
        g.setFont(scoreFont);
        g.drawString("life counter", WIDTH / 2 - 375, 50);
        g.drawString("player 1", WIDTH / 2 - 350, 100);
        g.drawString("" + playerScore, WIDTH / 2 - 325, 150);
        if (playerScore == 0) {
            g.drawString("   player1 lost", WIDTH / 2 - 200, 250);
        }
        g.drawString("life counter", WIDTH / 2 + 100, 50);
        g.drawString("player 2", WIDTH / 2 + 125, 100);
        g.drawString("" + playerScore2, WIDTH / 2 + 150, 150);
        if (playerScore2 == 0) {
            g.drawString("   player2 lost", WIDTH / 2 - 200, 250);
        }
        if (gun) {
            gun = true;
            g.fillRect(bullet.x, bullet.y, bullet.width, bullet.height);
        }
        if (gun2) {
            gun2 = true;
            g.fillRect(bullet2.x, bullet2.y, bullet2.width, bullet2.height);
        }
        if (laserLength) {
            laserLength = true;
            g.fillRect(bullet.x, bullet.y, bullet.width + 50, bullet.height);
        }
        if (laser2Length) {
            laser2Length = true;
            g.fillRect(bullet2.x, bullet2.y, bullet2.width + 50, bullet2.height);
        }
        // GAME DRAWING ENDS HERE
    }
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!

    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        blocks[0] = new Rectangle(0, 450, 100, 25);
        blocks[1] = new Rectangle(200, 450, 100, 25);
        blocks[2] = new Rectangle(150, 400, 25, 25);
        blocks[3] = new Rectangle(50, 325, 100, 25);
        blocks[4] = new Rectangle(400, 325, 25, 25);
        blocks[5] = new Rectangle(350, 325, 25, 25);
        blocks[6] = new Rectangle(50, 525, 100, 25);
        blocks[7] = new Rectangle(WIDTH, 450, 100, 25);
        blocks[8] = new Rectangle(WIDTH - 200, 450, 100, 25);
        blocks[9] = new Rectangle(WIDTH - 150, 400, 25, 25);
        blocks[10] = new Rectangle(WIDTH - 50, 325, 100, 25);
        blocks[11] = new Rectangle(WIDTH - 400, 325, 25, 25);
        blocks[12] = new Rectangle(WIDTH - 300, 325, 25, 25);
        blocks[13] = new Rectangle(WIDTH - 50, 525, 100, 25);
        blocks[14] = new Rectangle(WIDTH / 2 + 50, 500, 100, 100);
        blocks[15] = new Rectangle(WIDTH / 2 - 50, 500, 100, 100);
    }
    // The main game loop
    // In here is where all the logic for my game will go

    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;
        preSetup();
        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            if (playerRight) {
                playerDX = 3;
            } else if (playerLeft) {
                playerDX = -3;
            } else {
                playerDX = 0;
            }
            if (onGround && playerUp) {
                playerDY = -15;
                onGround = false;
            }
            playerDY = playerDY + gravity;
            player.x = player.x + playerDX;
            player.y = player.y + playerDY;
            onGround = false;
            for (int i = 0; i < blocks.length; i++) {
                if (player.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                    if (cWidth < cHeight) {
                        if (player.x < blocks[i].x) {
                            player.x = player.x - cWidth;
                        } else {
                            player.x = player.x + cWidth;
                        }
                        playerDX = 0;
                    } else {
                        if (player.y < blocks[i].y) {
                            player.y = player.y - cHeight;
                            if (playerDY >= 0) {
                                playerDY = 0;
                                onGround = true;
                            }
                        } else {
                            player.y = player.y + cHeight;
                        }
                    }
                }
            }
            if (player.y > HEIGHT) {
                player.x = playerDX + 50;
                player.y = playerDY + 375;
                playerScore = playerScore - 1;
            }
            if (player.y > WIDTH) {
                player.x = playerDX + 50;
                player.y = playerDY + 375;
            }
            if (player.x < 0) {
                player.x = playerDX + 50;
                player.y = playerDY + 395;
                playerScore = playerScore - 1;
            }
            if (player.x > WIDTH / 2) {
                player.x = playerDX + 50;
                player.y = playerDY + 395;
            }
            if (playerScore == 0) {
                done = true;
            }
            if (player2Right) {
                player2DX = 3;
            } else if (player2Left) {
                player2DX = -3;
            } else {
                player2DX = 0;
            }
            if (onGround2 && player2Up) {
                player2DY = -15;
                onGround2 = false;
            }
            player2DY = player2DY + gravity;
            player2.x = player2.x + player2DX;
            player2.y = player2.y + player2DY;
            onGround2 = false;
            for (int i = 0; i < blocks.length; i++) {
                if (player2.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player2.y + player2.height) - Math.max(blocks[i].y, player2.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player2.x + player2.width) - Math.max(blocks[i].x, player2.x);
                    if (cWidth < cHeight) {
                        if (player2.x < blocks[i].x) {
                            player2.x = player2.x - cWidth;
                        } else {
                            player2.x = player2.x + cWidth;
                        }
                        player2DX = 0;
                    } else {
                        if (player2.y < blocks[i].y) {
                            player2.y = player2.y - cHeight;
                            if (player2DY >= 0) {
                                player2DY = 0;
                                onGround2 = true;
                            }
                        } else {
                            player2.y = player2.y + cHeight;
                        }
                    }
                }
            }
            if (player2.y > HEIGHT) {
                player2.x = player2DX + WIDTH - 50;
                player2.y = player2DY + 375;
                playerScore2 = playerScore2 - 1;
            }
            if (player2.y > WIDTH) {
                player2.x = player2DX + WIDTH - 50;
                player2.y = player2DY + 375;
            }
            if (player2.x < 0) {
                player2.x = player2DX + WIDTH - 50;
                player2.y = player2DY + 395;
                playerScore2 = playerScore2 - 1;
            }

            if (player2.x < WIDTH / 2) {
                player2.x = player2DX + WIDTH - 50;
                player2.y = player2DY + 395;
            }

            if (playerScore2 == 0) {
                done = true;
            }
            if (gun) {
                bullet.x = bullet.x + bulletXDirection * bulletSpeed;
            }
            if (gun2) {
                bullet2.x = bullet2.x + (bullet2XDirection * -1) * bulletSpeed;
            }
            if (!(gun)) {
                bullet.x = player.x + 25;
                bullet.y = player.y + 15;
            }
            if (!(gun2)) {
                bullet2.x = player2.x - 15;
                bullet2.y = player2.y + 15;
            }

            if (gun) {
                for (int i = bullet.width; i <= WIDTH; i++) {
                    laserLength = true;
                }
            }

            if (gun2) {
                for (int i = bullet.width; i <= WIDTH - 400; i++) {
                    laser2Length = true;
                }
            }

            if (bullet2.intersects(player)) {
                player.x = playerDX + 50;
                player.y = playerDY + 375;
                playerScore = playerScore - 1;
                laser2Length = false;
                gun2 = false;
            }

            if (bullet.intersects(player2)) {
                player2.x = player2DX + WIDTH - 50;
                player2.y = player2DY + 395;
                playerScore2 = playerScore2 - 1;
                laserLength = false;
                gun = false;
            }
            for (int i = 0; i < blocks.length; i++) {
                if (bullet.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                    if (cWidth < cHeight) {
                        blocks[i].x = 999;
                        laserLength = false;
                        gun = false;
                    }
                }
            }
            
            for (int i = 0; i < blocks.length; i++) {
                if (bullet2.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player2.y + player2.height) - Math.max(blocks[i].y, player2.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player2.x + player2.width) - Math.max(blocks[i].x, player2.x);
                    if (cWidth < cHeight) {
                        blocks[i].x = 999;
                        laser2Length = false;
                        gun2 = false;
                    }
                }
            }



            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
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
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_D) {
                playerRight = true;
            }
            if (key == KeyEvent.VK_W) {
                playerUp = true;
            }
            if (key == KeyEvent.VK_A) {
                playerLeft = true;
            }
            if (key == KeyEvent.VK_RIGHT) {
                player2Right = true;
            }
            if (key == KeyEvent.VK_UP) {
                player2Up = true;
            }
            if (key == KeyEvent.VK_LEFT) {
                player2Left = true;
            }
            if (key == KeyEvent.VK_Q) {
                gun = true;
            }
            if (key == KeyEvent.VK_M) {
                gun2 = true;
            }
        }
        // if a key has been released

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_D) {
                playerRight = false;
            }
            if (key == KeyEvent.VK_W) {
                playerUp = false;
            }
            if (key == KeyEvent.VK_A) {
                playerLeft = false;
            }
            if (key == KeyEvent.VK_RIGHT) {
                player2Right = false;
            }
            if (key == KeyEvent.VK_UP) {
                player2Up = false;
            }
            if (key == KeyEvent.VK_LEFT) {
                player2Left = false;
            }
            if (key == KeyEvent.VK_Q) {
                gun = false;
            }
            if (key == KeyEvent.VK_M) {
                gun2 = false;
            }
            if (key == KeyEvent.VK_Q) {
                laserLength = false;
            }
            if (key == KeyEvent.VK_M) {
                laser2Length = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        summative game = new summative();
        // starts the game loop
        game.run();
    }
}
