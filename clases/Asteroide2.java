import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Asteroide
 * si toca al usuario se mandara una bandera para indicar que se ha perdido una vida
 */

public class Asteroide2 extends Enemigo
{
    int asteroidImage = 1;
    int speedDown = 6;
    private Nivel1 mundo;
    private Nivel3 mundo3;
    boolean bandtoc = false;
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
        try{
        mundo = (Nivel1)getWorld();
    }catch(ClassCastException e){}
        try{
        Nivel3 mundo3 =  (Nivel3)getWorld();
    }catch(ClassCastException e){}
        x=0;
        Heroe usuario = new Heroe(1);
          if(this.getWorld ()!= null)
           {
               
               muevete(); //4setLocation(getX(),getY()+1);
               //borde();
                  if(this.isTouching(Heroe.class))
               {
                 //mundo.removeObject(this);
                 
                 
                 x=1;
                 this.removeTouching(Heroe.class);
               
                     getWorld().addObject(usuario,435,550);
                     
                
                 
               }
               
           }
           
           
        return(x);
    }
     public int toca2()
    {
        
        try{
        Nivel3 mundo3 =  (Nivel3)getWorld();
    }catch(ClassCastException e){}
        x=0;
        Heroe usuario = new Heroe(3);
          if(this.getWorld ()!= null)
           {
               
               muevete(); //4setLocation(getX(),getY()+1);
               //borde();
                  if(this.isTouching(Heroe.class))
               {
                 //mundo.removeObject(this);
                 
                 
                 x=1;
                 this.removeTouching(Heroe.class);
               
                     getWorld().addObject(usuario,435,550);
                     
                
                 
               }
               
           }
           
           
        return(x);
    }
    /**
     * Método utilizado para hacer que el objeto se mueva
     */
    public void muevete()
    {
          
         
           setImage("images/e"+asteroidImage+".png");//propios del objeto

           
            if(this.isTouching(Linea.class))
            {
               bandtoc = true;
                //this.move(2);
                
                //this.setLocation(getX()+2,getY()+1);
            }
            if(this.isTouching(Linea2.class))
            {
                bandtoc=false;
            }
          if(!bandtoc)//va hacia la derecha
          {
            this.setLocation(getX()+2,getY()+1);
            //this.move(2);
            }
          else//va a la izquierda
          {
            this.setLocation(getX()-2,getY()+1);
            //this.setRotation(150);
            //this.move(2);
            }
                
               // this.setRotation(180);
            //propios del objeto//speedDown
            if(asteroidImage<13)
                asteroidImage++;
                else
                asteroidImage=1;
           
               
                
    }
}


