import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int speed = 3; // bepaalt snelheid van de player
    
    // players soorten 
    GreenfootImage i1 = new GreenfootImage("man01.png");
    GreenfootImage i2 = new GreenfootImage("man02.png");
    GreenfootImage i3 = new GreenfootImage("man01.png");
    GreenfootImage i4 = new GreenfootImage("man02.png");

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }

    /*
     * besturing: z naar boven
     * d naar recht, s naar onder, q naar links
     */

    public void move() {
        if (Greenfoot.isKeyDown("q")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("z")){
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void changeImage(int x) {
        if (x == 1) {
            setImage(i1);
        }
        if (x == 2) {
            setImage(i2);
        }
        if (x == 3) {
            setImage(i3);
        }
        if (x == 4) {
            setImage(i4);
        }
    }
}
