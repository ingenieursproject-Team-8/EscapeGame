import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacSelect extends BaseRoom
{
    public static final int WIDTH = 1020;   //breedte instellen v/d rooms
    public static final int HEIGHT = 574;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms
    
    
    public CharacSelect(EscapeGame escapeGame)
    {    
        super(escapeGame);
        
        getBackground().drawImage(new GreenfootImage("Press 1 to be image 1", 24, 
            null, null), 300, 25);
        getBackground().drawImage(new GreenfootImage("Press 2 to be image 2", 24, 
            null, null), 300, 65);
        getBackground().drawImage(new GreenfootImage("Press 3 to be image 3", 24, 
            null, null), 300, 105);
        getBackground().drawImage(new GreenfootImage("Press 4 to be image 4", 24, 
            null, null), 300, 145);
        addObject(Globals.h, 300, 255);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("1")) 
        {
            Globals.h.changeImage(1);
        }
        if (Greenfoot.isKeyDown("2")) 
        {
            Globals.h.changeImage(2);
        }
        if (Greenfoot.isKeyDown("3")) 
        {
            Globals.h.changeImage(3);
        }
        if (Greenfoot.isKeyDown("4")) 
        {
            Globals.h.changeImage(4);
        }
    }
}
