import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Items
 */
public class Municion extends Items
{
    Nivel3 mundo3=(Nivel3)getWorld();
    /**
     * Constructor Clase Municion
     */
    public Municion(int y, int n)
    {
        super(y, n);
    }
    
    /**
     *Metodo que siempre se ejecuta, manda llamar el metodo toca del padre
     */
    public void act() 
    {
        // Add your action code here.
        super.toca(y, n);
        
    }    
}