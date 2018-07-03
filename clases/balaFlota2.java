import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balaFlota2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balaFlota2 extends Disparo
{
    private Nivel3 mundo3;
    private boolean isFlota=false;
    public int x;
    /**
     * Act - do whatever the balaFlota2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balaFlota2(int a, int b, int speed, char c, int d, int nivel)
    {
        super(a,b,speed,'c', d, nivel);
       
        
    }
    public void act() 
    {
        // Add your action code here.
        aaa(a, b, speed, 'f',d,nivel);
        Actor Heroe = getOneObjectAtOffset(0,0,Heroe.class);
        Heroe usuario = new Heroe(3);
        if(Heroe!= null)
            {
                Nivel3 mundo3 = (Nivel3)getWorld();
                //getWorld().removeObject(this);
                 
                
                
                 this.removeTouching(Heroe.class);
                 mundo3.removeObject(this);
                
                 mundo3.addObject(usuario,435,550);
                
                
                mundo3.vidasN3.decrementa(0);
                Greenfoot.playSound("explosion.wav");
            }
            else
            {
                
                if(getY() >= getWorld().getHeight()-5 || getY() <= 5)
                {
                    getWorld().removeObject(this);
                }
            }
    }    
}

