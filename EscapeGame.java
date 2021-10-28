import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
*Deze subklasse houdt bij waar de actor zich bevindt en 
*heeft de commands om de actor van room te laten veranderen
*deze moeten aangeroepen worden bij de actor zelf
*/

public class EscapeGame extends World
{
    public static final int WIDTH = 1020;   //breedte instellen v/d rooms
    public static final int HEIGHT = 574;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms
    
    private Player player; 
    private BaseRoom CharacSelect; //onthoudt de kamers
    private BaseRoom startRoom;
    private BaseRoom room2;
    private BaseRoom currentRoom; // huidige kamer
    
    public EscapeGame()
    {    
        // Create a new world with WIDTH/RESOLUTION x HEIHT/RESOLUTION cells 
        //with a cell size of RESOLUTION x RESOLUTION pixels.
        super(WIDTH/RESOLUTION, HEIGHT/RESOLUTION, RESOLUTION); 
        
        startRoom = new StartRoom(this);
        //stel 'startRoom' gelijk aan 'new StartRoom(this)'
        room2 = new Room2(this);
        //stel 'room2' gelijk aan 'new Room2(this)'
        SetRoom(startRoom);
        //stel de huidige room in op startRoom
        currentRoom.addObject(new Player(), 100, 100);
    }
    
    private void SetRoom(BaseRoom room)
    {
        currentRoom = room;
        Greenfoot.setWorld(room);
    }
    
    public void NextRoom()
    {
        if(currentRoom == startRoom)
        {
            SetRoom(room2);
            //stel de room in op room2
            currentRoom.addObject(Globals.h, 100, 100);
            //plaats karakter op de gewenste positie in de huidige room
        }
        else
        {
            SetRoom(startRoom);
            //stel room in op de startRoom
            currentRoom.addObject(Globals.h, 100, 100);
            //zet het karakter op de gewenste plaats in de huidige room
        }
    }
}
