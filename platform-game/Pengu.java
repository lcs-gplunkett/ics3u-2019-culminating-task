import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pengu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pengu extends Actor
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2;
    /**
     * Act - do whatever the Pengu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        fall();
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")) {
            setImage("pengu-left.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right")) {
            setImage("pengu-right.png");
            moveRight();
        }
    }
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset ( 0, getImage().getHeight() / 2, Ground.class);
        return under != null; 
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed +  acceleration;
    }
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
    }

    public void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }
}
