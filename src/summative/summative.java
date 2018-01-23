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
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Pures8098
 */
public class summative extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Red VS Blue";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //create players
    Rectangle player = new Rectangle(25, 400, 25, 50);
    Rectangle player2 = new Rectangle(WIDTH - 50, 200, 25, 50);
    Rectangle player3 = new Rectangle(25, 400, 25, 50);
    Rectangle player4 = new Rectangle(WIDTH - 50, 200, 25, 50);
    //create bullets
    Rectangle bullet = new Rectangle(player.x + 25, player.y + 15, 115, 15);
    Rectangle bullet2 = new Rectangle(player2.x - 45, player2.y + 15, 115, 15);
    Rectangle bullet3 = new Rectangle(player3.x + 25, player3.y + 15, 115, 15);
    Rectangle bullet4 = new Rectangle(player4.x - 15, player4.y + 15, 115, 15);
    //create hitboxes
    Rectangle hitbox = new Rectangle(bullet3.x, bullet3.y, 300, 15);
    Rectangle hitbox2 = new Rectangle(bullet4.x, bullet4.y, 300, 15);
    //create player x and y axis
    int playerDX = 0;
    int playerDY = 0;
    //created player 2 x and y axis
    int player2DX = 0;
    int player2DY = 0;
    //create gravity
    int gravity = 1;
    //create amount of rectangular platforms
    Rectangle[] blocks = new Rectangle[14];
    //boolean commands for modes
    boolean normal = false;
    boolean insane = false;
    boolean menu = true;
    //boolean commands for movement player 1
    boolean playerUp = false;
    boolean playerRight = false;
    boolean playerLeft = false;
    //boolean command for staying on the ground
    boolean onGround = true;
    //boolean commands for movement player 2
    boolean player2Up = false;
    boolean player2Right = false;
    boolean player2Left = false;
    //boolean command for staying on the ground
    boolean onGround2 = true;
    //boolean command to display the bullets
    boolean gun = false;
    boolean gun2 = false;
    //direction of bullets
    int bulletXDirection = 1;
    int bullet2XDirection = 1;
    //create velocity
    int bulletSpeedN = 40;
    int bulletSpeedI = 100;
    //create score
    int playerScoreN = 10;
    int playerScore2N = 10;
    int playerScoreI = 15;
    int playerScore2I = 15;
    //font
    Font scoreFont = new Font("comicsans", Font.BOLD, 42);
    Font openingFont = new Font("comicsans", Font.BOLD, 18);
    //cool image
    BufferedImage pic = loadImage("Red-vs-Blue.jpg");
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

    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        //first menu/opening screen
        if (menu) {
            //picture
            g.drawImage(pic, 0, 0, WIDTH, HEIGHT, null);
            //title and info
            g.setFont(openingFont);
            g.setColor(Color.green);
            g.drawString("welcome to Red vs Blue", WIDTH / 2 - 100, 25);
            g.drawString("1 for normal", WIDTH / 2 - 50, 50);
            g.drawString("2 for insane", WIDTH / 2 - 50, 100);
            g.drawString("W for player 1 jump", WIDTH / 2 - 50, 150);
            g.drawString("A for player 1 left", WIDTH / 2 - 50, 200);
            g.drawString("D for player 1 right", WIDTH / 2 - 50, 250);
            g.drawString("Q for player 1 shoot", WIDTH / 2 - 50, 300);
            g.drawString("^ for player 2 up", WIDTH / 2 - 50, 350);
            g.drawString("< for player 2 left", WIDTH / 2 - 50, 400);
            g.drawString("> for player 2 right", WIDTH / 2 - 50, 450);
            g.drawString("M for player 2 shoot", WIDTH / 2 - 50, 500);
            g.drawString("P for pause", WIDTH / 2 - 50, 550);
        }
        if (normal) {
            //normal settings
            //split background red and blue
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(Color.RED);
            g.fillRect(0, 0, WIDTH / 2, HEIGHT);
            //display platforms
            for (int i = 0; i < blocks.length; i++) {
                g.setColor(Color.BLACK);
                g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
            }
            //display players
            g.setColor(Color.CYAN);
            g.fillRect(player.x, player.y, player.width, player.height);
            g.setColor(Color.red);
            g.fillRect(player2.x, player2.y, player2.width, player2.height);
            //create score
            g.setColor(Color.BLACK);
            //display font from above
            g.setFont(scoreFont);
            //name score and place
            g.drawString("life counter", WIDTH / 2 - 375, 50);
            g.drawString("player 1", WIDTH / 2 - 350, 100);
            g.drawString("" + playerScoreN, WIDTH / 2 - 325, 150);
            //display winner
            if (playerScoreN == 0) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(WIDTH / 2 - 180, 100, 300, 75);
                g.setColor(Color.BLACK);
                g.drawString("   player2 won", WIDTH / 2 - 200, 150);
            }
            //name score and place
            g.drawString("life counter", WIDTH / 2 + 100, 50);
            g.drawString("player 2", WIDTH / 2 + 125, 100);
            g.drawString("" + playerScore2N, WIDTH / 2 + 150, 150);
            //display winner
            if (playerScore2N == 0) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(WIDTH / 2 - 180, 100, 300, 75);
                g.setColor(Color.BLACK);
                g.drawString("   player1 won", WIDTH / 2 - 200, 150);
            }
            //display bullets
            g.setColor(Color.MAGENTA);
            if (gun) {
                g.fillRoundRect(bullet.x, bullet.y, bullet.width, bullet.height, 100, 100);
            }
            g.setColor(Color.GREEN);
            if (gun2) {
                g.fillRoundRect(bullet2.x, bullet2.y, bullet2.width, bullet2.height, 100, 100);
            }
        }
        if (insane) {
            //insane mode (much faster)
            // display background
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            //display blocks
            for (int i = 0; i < blocks.length; i++) {
                g.setColor(Color.WHITE);
                g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
            }
            //display players
            g.setColor(Color.CYAN);
            g.fillRect(player3.x, player3.y, player3.width, player3.height);
            g.setColor(Color.RED);
            g.fillRect(player4.x, player4.y, player4.width, player4.height);
            //display score
            g.setColor(Color.WHITE);
            g.setFont(scoreFont);
            //display score and place
            g.drawString("life counter", WIDTH / 2 - 375, 50);
            g.drawString("player 1", WIDTH / 2 - 350, 100);
            g.drawString("" + playerScoreI, WIDTH / 2 - 325, 150);
            //display winner
            if (playerScoreI == 0) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(WIDTH / 2 - 180, 100, 300, 75);
                g.setColor(Color.BLACK);
                g.drawString("   player2 won", WIDTH / 2 - 200, 150);
            }
            //display score and place
            g.setColor(Color.WHITE);
            g.drawString("life counter", WIDTH / 2 + 100, 50);
            g.drawString("player 2", WIDTH / 2 + 125, 100);
            g.drawString("" + playerScore2I, WIDTH / 2 + 150, 150);
            //display winner
            if (playerScore2I == 0) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(WIDTH / 2 - 180, 100, 300, 75);
                g.setColor(Color.BLACK);
                g.drawString("   player1 won", WIDTH / 2 - 200, 150);
            }
            //display bullets
            g.setColor(Color.WHITE);
            if (gun) {
                g.fillRoundRect(bullet3.x, bullet3.y, bullet3.width + 200, bullet3.height, 100, 100);
            }
            g.setColor(Color.WHITE);
            if (gun2) {
                g.fillRoundRect(bullet4.x - 50, bullet4.y, bullet4.width + 200, bullet4.height, 100, 100);
            }
            // GAME DRAWING ENDS HERE
        }
    }
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!

    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        //blocks array for platform
        blocks[0] = new Rectangle(0, 450, 100, 25);
        blocks[1] = new Rectangle(200, 450, 100, 25);
        blocks[2] = new Rectangle(50, 350, 100, 25);
        blocks[3] = new Rectangle(325, 325, 25, 25);
        blocks[4] = new Rectangle(25, 525, 125, 25);
        blocks[5] = new Rectangle(WIDTH - 200, 450, 100, 25);
        blocks[6] = new Rectangle(WIDTH - 75, 275, 50, 25);
        blocks[7] = new Rectangle(WIDTH - 300, 375, 25, 25);
        blocks[8] = new Rectangle(WIDTH - 350, 300, 25, 25);
        blocks[9] = new Rectangle(WIDTH - 50, 525, 50, 25);
        blocks[10] = new Rectangle(WIDTH / 2 + 50, 500, 100, 25);
        blocks[11] = new Rectangle(WIDTH / 2 - 50, 500, 100, 25);
        blocks[12] = new Rectangle(WIDTH / 2 - 250, 250, 100, 25);
        blocks[13] = new Rectangle(WIDTH - 225, 275, 100, 25);
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

            if (normal) {
                //normal mode and turn off menu
                menu = false;
                //movement speed
                if (playerRight) {
                    playerDX = 5;
                } else if (playerLeft) {
                    playerDX = -5;
                } else {
                    playerDX = 0;
                }
                //jumping height
                if (onGround && playerUp) {
                    playerDY = -18;
                    onGround = false;
                }
                //gravity
                playerDY = playerDY + gravity;
                player.x = player.x + playerDX;
                player.y = player.y + playerDY;
                onGround = false;
                for (int i = 0; i < blocks.length; i++) {
                    //if player intersects blocks
                    if (player.intersects(blocks[i])) {
                        //check for blocks
                        int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                        int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                        if (cWidth < cHeight) {
                            //keep from falling through
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
                //if falls, player loses life and resets position
                if (player.y > HEIGHT) {
                    player.x = playerDX + 25;
                    player.y = playerDY + 375;
                    playerScoreN = playerScoreN - 1;
                }
                //if player moves to far left resets position
                if (player.x < 0) {
                    player.x = playerDX + 25;
                    player.y = playerDY + 395;
                }
                //if player goes to far right resets position
                if (player.x > WIDTH / 2) {
                    player.x = playerDX + 25;
                    player.y = playerDY + 395;
                }
                //if score becomes to low game finishes
                if (playerScoreN == 0) {
                    done = true;
                }
                //player2 movement speed
                if (player2Right) {
                    player2DX = 5;
                } else if (player2Left) {
                    player2DX = -5;
                } else {
                    player2DX = 0;
                }
                //player2 jump
                if (onGround2 && player2Up) {
                    player2DY = -18;
                    onGround2 = false;
                }
                //gravity
                player2DY = player2DY + gravity;
                player2.x = player2.x + player2DX;
                player2.y = player2.y + player2DY;
                onGround2 = false;
                for (int i = 0; i < blocks.length; i++) {
                    //if player intersects blocks
                    if (player2.intersects(blocks[i])) {
                        //check for blocks
                        int cHeight = Math.min(blocks[i].y + blocks[i].height, player2.y + player2.height) - Math.max(blocks[i].y, player2.y);
                        int cWidth = Math.min(blocks[i].x + blocks[i].width, player2.x + player2.width) - Math.max(blocks[i].x, player2.x);
                        if (cWidth < cHeight) {
                            //keep from falling through
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
                //if player2 falls then reset position and lose a life
                if (player2.y > HEIGHT) {
                    player2.x = player2DX + WIDTH - 50;
                    player2.y = player2DY + 200;
                    playerScore2N = playerScore2N - 1;
                }
                //if player2 moves to far left then reset location
                if (player2.x > WIDTH) {
                    player2.x = player2DX + WIDTH - 50;
                    player2.y = player2DY + 200;
                }
                //if player2 moves to far right then reset location
                if (player2.x < WIDTH / 2) {
                    player2.x = player2DX + WIDTH - 50;
                    player2.y = player2DY + 200;
                }
                //if score goes down to much then games finishes
                if (playerScore2N == 0) {
                    done = true;
                }
                //if gun displays then add velocity
                if (gun) {
                    bullet.x = bullet.x + bulletXDirection * bulletSpeedN;
                }
                //if gun2 displays then add velocity
                if (gun2) {
                    bullet2.x = bullet2.x + (bullet2XDirection * -1) * bulletSpeedN;
                }
                //if gun not displayed reset position
                if (!(gun)) {
                    bullet.x = player.x + 75;
                    bullet.y = player.y + 15;
                }
                //if gun2 not displayed reset position
                if (!(gun2)) {
                    bullet2.x = player2.x - 75;
                    bullet2.y = player2.y + 15;
                }
                //if bullet2 intersects player, player resets and lives down by 1 and resets bullet2
                if (bullet2.intersects(player)) {
                    player.x = playerDX + 25;
                    player.y = playerDY + 375;
                    playerScoreN = playerScoreN - 1;
                    gun2 = false;
                } else {
                    //if bullet intersects player2, player2 resets and lives down by 1 and resets bullet
                    if (bullet.intersects(player2)) {
                        player2.x = player2DX + WIDTH - 50;
                        player2.y = player2DY + 200;
                        playerScore2N = playerScore2N - 1;
                        gun = false;
                    }
                }
                //if bullet intersects player then it resets 
                if (bullet.intersects(player)) {
                    bullet.x = player.x + 75;
                    bullet.y = player.y + 15;
                    gun = false;
                } else {
                    //if bullet2 intersects player then it resets
                    if (bullet2.intersects(player2)) {
                        bullet2.x = player2.x - 75;
                        bullet2.y = player2.y + 15;
                        gun2 = false;
                    }
                }

                //if gun hits platform then moves platform to out of reach and reset bullet
                if (gun) {
                    for (int i = 0; i < blocks.length; i++) {
                        if (bullet.intersects(blocks[i])) {
                            blocks[i].x = 999;
                            gun = false;
                        }
                    }
                }
                //if gun2 or hits platform then moves platform to out of reach and reset bullet2 and 
                if (gun2) {
                    for (int i = 0; i < blocks.length; i++) {
                        if (bullet2.intersects(blocks[i])) {
                            blocks[i].x = 999;
                            gun2 = false;
                        }
                    }
                }

                //if bullet goes to far right it rebounds
                if (bullet.x > WIDTH) {
                    bulletXDirection = bulletXDirection * -1;
                } else {
                    //if bullet and  goes to far left then it resets
                    if (bullet.x < 0) {
                        bullet.x = player.x + 75;
                        bullet.y = player.y + 15;
                        gun = false;
                        bulletXDirection = bulletXDirection * -1;
                    }
                }
                //if bullet2 and  goes to far left it rebounds
                if (bullet2.x < 0) {
                    bullet2XDirection = bullet2XDirection * -1;
                } else {
                    //if bullet2 and  goes to far right then it resets
                    if (bullet2.x > WIDTH) {
                        bullet2.x = player2.x - 75;
                        bullet2.y = player2.y + 15;
                        gun2 = false;
                        bullet2XDirection = bullet2XDirection * -1;
                    }
                }
                //if bullet is rebounded back towards a block this fixes it(switching it back to right direction) and resets positon
                if (!(gun)) {
                    if (bulletXDirection == -1) {
                        bulletXDirection = bulletXDirection * -1;
                    }
                }
                //if bullet2 is rebounded back towards a block this fixes it(switching it back to right direction) and resets positon
                if (!(gun2)) {
                    if (bullet2XDirection == -1) {
                        bullet2XDirection = bullet2XDirection * -1;
                    }
                }
            }



            if (insane) {
                //insane mod (speed ramped up) and menu false
                menu = false;
                //player movement speed
                if (playerRight) {
                    playerDX = 15;
                } else if (playerLeft) {
                    playerDX = -15;
                } else {
                    playerDX = 0;
                }
                //player jump
                if (onGround && playerUp) {
                    playerDY = -20;
                    onGround = false;
                }
                //gravity
                playerDY = playerDY + gravity;
                player3.x = player3.x + playerDX;
                player3.y = player3.y + playerDY;
                onGround = false;
                for (int i = 0; i < blocks.length; i++) {
                    //checks for blocks intercetion
                    if (player3.intersects(blocks[i])) {
                        int cHeight = Math.min(blocks[i].y + blocks[i].height, player3.y + player3.height) - Math.max(blocks[i].y, player3.y);
                        int cWidth = Math.min(blocks[i].x + blocks[i].width, player3.x + player3.width) - Math.max(blocks[i].x, player3.x);
                        if (cWidth < cHeight) {
                            //keeps player from falling through blocks
                            if (player3.x < blocks[i].x) {
                                player3.x = player3.x - cWidth;
                            } else {
                                player3.x = player3.x + cWidth;
                            }
                            playerDX = 0;
                        } else {
                            if (player3.y < blocks[i].y) {
                                player3.y = player3.y - cHeight;
                                if (playerDY >= 0) {
                                    playerDY = 0;
                                    onGround = true;
                                }
                            } else {
                                player3.y = player3.y + cHeight;
                            }
                        }
                    }
                }
                //if player has fallen then reset postion and score down 1
                if (player3.y > HEIGHT) {
                    player3.x = playerDX + 25;
                    player3.y = playerDY + 350;
                    playerScoreI = playerScoreI - 1;
                }
                //if player to far left then reset position
                if (player3.x < 0) {
                    player3.x = playerDX + 25;
                    player3.y = playerDY + 350;
                }
                //if player to far right then reset position                
                if (player3.x > WIDTH / 2) {
                    player3.x = playerDX + 25;
                    player3.y = playerDY + 350;
                }
                //if player score to low then games ends
                if (playerScoreI == 0) {
                    done = true;
                }
                //player4 movement speed
                if (player2Right) {
                    player2DX = 15;
                } else if (player2Left) {
                    player2DX = -15;
                } else {
                    player2DX = 0;
                }
                //player 4 jump
                if (onGround2 && player2Up) {
                    player2DY = -20;
                    onGround2 = false;
                }
                //gravity
                player2DY = player2DY + gravity;
                player4.x = player4.x + player2DX;
                player4.y = player4.y + player2DY;
                onGround2 = false;
                //checks for blocks
                for (int i = 0; i < blocks.length; i++) {
                    if (player4.intersects(blocks[i])) {
                        int cHeight = Math.min(blocks[i].y + blocks[i].height, player4.y + player4.height) - Math.max(blocks[i].y, player4.y);
                        int cWidth = Math.min(blocks[i].x + blocks[i].width, player4.x + player4.width) - Math.max(blocks[i].x, player4.x);
                        if (cWidth < cHeight) {
                            //keep from falling through
                            if (player4.x < blocks[i].x) {
                                player4.x = player4.x - cWidth;
                            } else {
                                player4.x = player4.x + cWidth;
                            }
                            player2DX = 0;
                        } else {
                            if (player4.y < blocks[i].y) {
                                player4.y = player4.y - cHeight;
                                if (player2DY >= 0) {
                                    player2DY = 0;
                                    onGround2 = true;
                                }
                            } else {
                                player4.y = player4.y + cHeight;
                            }
                        }
                    }
                }
                //if player2 falls then reset position and 1 life down
                if (player4.y > HEIGHT) {
                    player4.x = player2DX + WIDTH - 50;
                    player4.y = player2DY + 200;
                    playerScore2I = playerScore2I - 1;
                }
                //if player2 goes to far right the reset position
                if (player4.x > WIDTH) {
                    player4.x = player2DX + WIDTH - 50;
                    player4.y = player2DY + 200;
                }
                //if player2 goes to far left the reset position
                if (player4.x < WIDTH / 2) {
                    player4.x = player2DX + WIDTH - 50;
                    player4.y = player2DY + 200;
                }
                //if score to low then game finishes
                if (playerScore2I == 0) {
                    done = true;
                }
                //if gun displayed then bullet3 velocity triggers to move bullet3
                if (gun) {
                    bullet3.x = bullet3.x + bulletXDirection * bulletSpeedI;
                    hitbox.x = hitbox.x + bulletXDirection * bulletSpeedI;
                }
                //if gun2 displayed then bullet4 velocity triggers to move bullet4
                if (gun2) {
                    bullet4.x = bullet4.x + (bullet2XDirection * -1) * bulletSpeedI;
                    hitbox2.x = hitbox2.x + (bullet2XDirection * -1) * bulletSpeedI;
                }
                //if no gun is displayed the reset position
                //if gun not displayed reset position
                if (!(gun)) {
                    bullet3.x = player3.x + 25;
                    bullet3.y = player3.y + 15;
                    hitbox.x = bullet3.x;
                    hitbox.y = bullet3.y;
                }
                //if gun2 not displayed reset position
                if (!(gun2)) {
                    bullet4.x = player4.x - 15;
                    bullet4.y = player4.y + 15;
                    hitbox2.x = bullet4.x;
                    hitbox2.y = bullet4.y;
                }
                //if bullet4 intersects player, player resets and lives down by 1 and resets bullet4 and hitbox2
                if (bullet4.intersects(player3)) {
                    player3.x = playerDX + 25;
                    player3.y = playerDY + 350;
                    playerScoreI = playerScoreI - 1;
                    gun2 = false;
                } else {
                    //if bullet3 intersects player4, player4 resets and lives down by 1 and resets bullet3 and hitbox
                    if (bullet3.intersects(player4)) {
                        player4.x = player2DX + WIDTH - 50;
                        player4.y = player2DY + 200;
                        playerScore2I = playerScore2I - 1;
                        gun = false;
                    }
                }
                //if bullet3 intersects player then resets
                if (bullet3.intersects(player3)) {
                    bullet3.x = player3.x + 25;
                    bullet3.y = player3.y + 15;
                    gun = false;
                } else {
                    //if bullet4 intersects player2 then resets
                    if (bullet4.intersects(player4)) {
                        bullet4.x = player4.x - 15;
                        bullet4.y = player4.y + 15;
                        gun2 = false;
                    }
                }
                //if gun or hitbox hits platform then moves platform to out of reach and reset bullet3 and hitbox2
                if (gun) {
                    for (int i = 0; i < blocks.length; i++) {
                        if (bullet3.intersects(blocks[i])) {
                            blocks[i].x = 999;
                            gun = false;
                        } else {
                            if (hitbox.intersects(blocks[i])) {
                                blocks[i].x = 999;
                                gun = false;
                            }
                        }
                    }
                } else {
                    //if gun2 or hitbox2 hits platform then moves platform to out of reach and reset bullet4 and hitbox2
                    if (gun2) {
                        for (int i = 0; i < blocks.length; i++) {
                            if (bullet4.intersects(blocks[i])) {
                                blocks[i].x = 999;
                                gun2 = false;
                            } else {
                                if (hitbox2.intersects(blocks[i])) {
                                    blocks[i].x = 999;
                                    gun2 = false;

                                }
                            }
                        }
                    }
                }
                //if bullet3 goes to far right it rebounds
                if (bullet3.x > WIDTH) {
                    bulletXDirection = bulletXDirection * -1;
                } else {
                    //if bullet goes to far left then rest bullet3 
                    if (bullet3.x < 0) {
                        bullet3.x = player3.x + 25;
                        bullet3.y = player3.y + 15;
                        gun = false;
                        bulletXDirection = bulletXDirection * -1;
                    }
                }
                //if bullet4 goes to far left it rebounds
                if (bullet4.x < 0) {
                    bullet2XDirection = bullet2XDirection * -1;
                } else {
                    //if bullet4 goes to far left then rest bullet4
                    if (bullet4.x > WIDTH) {
                        bullet4.x = player4.x - 15;
                        bullet4.y = player4.y + 15;
                        gun2 = false;
                        bullet2XDirection = bullet2XDirection * -1;
                    }
                }
                //if bullet3 is rebounded back towards a block this fixes it(switching it back to right direction) and resets positon
                if (!(gun)) {
                    if (bulletXDirection == -1) {
                        bulletXDirection = bulletXDirection * -1;
                    }
                }
                //if bullet4 is rebounded back towards a block this fixes it(switching it back to right direction) and resets positon
                if (!(gun2)) {
                    if (bullet2XDirection == -1) {
                        bullet2XDirection = bullet2XDirection * -1;
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
            //player movement right key pressed
            if (key == KeyEvent.VK_D) {
                playerRight = true;
            }
            //player jump key pressed
            if (key == KeyEvent.VK_W) {
                playerUp = true;
            }
            //player movement left key pressed
            if (key == KeyEvent.VK_A) {
                playerLeft = true;
            }
            //player2 movement right key pressed
            if (key == KeyEvent.VK_RIGHT) {
                player2Right = true;
            }
            //player jump key pressed
            if (key == KeyEvent.VK_UP) {
                player2Up = true;
            }
            //player2 movement left key pressed
            if (key == KeyEvent.VK_LEFT) {
                player2Left = true;
            }
            //gun key pressed
            if (key == KeyEvent.VK_Q) {
                gun = true;
            }
            //gun2 key pressed
            if (key == KeyEvent.VK_M) {
                gun2 = true;
            }
            //set normal mode
            if (key == KeyEvent.VK_1) {
                normal = true;
                menu = false;
            }
            //set insane mode
            if (key == KeyEvent.VK_2) {
                insane = true;
                menu = false;
            }
            //pause
            if (key == KeyEvent.VK_P) {
                menu = true;
                normal = false;
                insane = false;
            }
        }
        // if a key has been released

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            //player movement right key depressed
            if (key == KeyEvent.VK_D) {
                playerRight = false;
            }
            //player jump key depressed
            if (key == KeyEvent.VK_W) {
                playerUp = false;
            }
            //player movement left key depressed
            if (key == KeyEvent.VK_A) {
                playerLeft = false;
            }
            //player2 movement right key depressed
            if (key == KeyEvent.VK_RIGHT) {
                player2Right = false;
            }
            //player2 jump key depressed
            if (key == KeyEvent.VK_UP) {
                player2Up = false;
            }
            //player2 movement left key depressed
            if (key == KeyEvent.VK_LEFT) {
                player2Left = false;
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
