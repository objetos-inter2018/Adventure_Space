import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Asteroide
 * si toca al usuario se mandara una bandera para indicar que se ha perdido una vida
 */

public class Asteroide extends Enemigo
{
    int asteroidImage = 1;
    int speedDown = 10;
    private Nivel1 mundo;
    private Nivel3 mundo3;
    public int x;
    
    /**
     * Ciclo que se ejecuta constante mente
     * Se ejecuta el método toca, al igual que los métodos borde y alcanzado del padre
     */
    public void act() 
    {
       toca();//2
       super.borde();
       super.alcanzado();
    }
    
    /**
     * Método que regresa 1 y remueve este obeto, si se esta tocando a la clase heroe
     */
     public int toca()
    {
        
        
        x=0;
        Heroe usuario = new Heroe(1);
          if(this.getWorld()!= null)
           {
               muevete();//4setLocation(getX(),getY()+1);
               //borde();
                  if(this.isTouching(Heroe.class))
               {
                 //mundo.removeObject(this);
                 
                 x=1;
                 this.removeTouching(Heroe.class);
               
                     getWorld().addObject(usuario,435,550);
                 
               }
               
           }
           /*
           if(this.getWorld()!= null)
           {
               muevete();//4setLocation(getX(),getY()+1);
               //borde();
                  if(this.isTouching(Heroe.class))
               {
                 //mundo.removeObject(this);
                 
                 x=1;
                 this.removeTouching(Heroe.class);
               
                     getWorld().addObject(usuario,435,550);
                 
               }
               
           }
           */
        return(x);
    }
    
    
    
    /**
     * Método utilizado para hacer que el objeto se mueva
     */
    public void muevete()
    {
            setImage("images/a"+asteroidImage+".png");//propios del objeto
            setLocation(getX(),getY()+4);//propios del objeto//speedDown
            
                if(asteroidImage<27)
                    asteroidImage++;
                else
                    asteroidImage=1;
       }
    
    
}