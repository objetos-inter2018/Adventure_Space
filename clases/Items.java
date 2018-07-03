import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Items
 */
public class Items extends Actor
{
    private Nivel1 mundo;
    private Nivel2 mundo2;
    private Nivel3 mundo3;
    private int bandera;
    int y;
    int n;
    
    /**
     * Constructor clase Items, recibe los parametros para el comportamiento específico dependiendo de la subclase
     */
    public Items(int y, int n)
    {
        this.y=y;
        this.n=n;
    }
    
    /**
     * Método que permite incrementa una cantidad específica, la variable correspondiente y elimina la clase
     */
    public void toca(int y,int n)
    {
        Municion m1= new Municion(y,n);
        if(n==1)
        {
            try{
            mundo = (Nivel1)getWorld();
        }catch(ClassCastException e){}
            if(this.getWorld ()!= null)
            {
                setLocation(getX(),getY()+1);
                borde();
                if(this.isTouching(Heroe.class))
                {
                    try{
                    mundo.removeObject(this);
                }catch(NullPointerException e){}
                    if(y==0)
                        mundo.rocket.incrementa(y);
                        else
                            if(y==1){
                            try{
                                mundo.vidas.incrementa(y);
                                }catch(NullPointerException e){}
                            }else{
                   try{
                                mundo.balas.incrementa(y);
                                }catch(NullPointerException e){}}
                 Greenfoot.playSound("load_gun.wav");
               }
           }
        }
        
        
        if(n==2)
        {
            mundo2 = (Nivel2)getWorld();

            if(this.getWorld ()!= null)
            {
                setLocation(getX(),getY()+1);
                borde();
                if(this.isTouching(Heroe.class))
                {
                    mundo2.removeObject(this);
                    if(y==0)
                        mundo2.rocketN2.incrementa(y);
                        else
                            if(y==1)
                                mundo2.vidasN2.incrementa(y);
                            else
                                mundo2.balasN2.incrementa(y);
                 Greenfoot.playSound("load_gun.wav");
               }
           }
        }
        if(n==3)
        {
            mundo3 = (Nivel3)getWorld();

            if(this.getWorld ()!= null)
            {
                setLocation(getX(),getY()+1);
                borde();
               if(this.isTouching(Heroe.class))
                {
                    try{
                    mundo3.removeObject(this);
                }catch(NullPointerException e){}
                    if(y==0)
                        mundo3.rocketN3.incrementa(y);
                        else
                            if(y==1){
                            try{
                                mundo3.vidasN3.incrementa(y);
                                }catch(NullPointerException e){}
                            }else{
                   try{
                                mundo3.balasN3.incrementa(y);
                                }catch(NullPointerException e){}}
                 Greenfoot.playSound("load_gun.wav");
               }
           }
        }
    }
    
    
    public int borde()
    {
        int x=0;  
        if(getY()==590)
        {
            x=1;
        }
        return(x);
    }   
}