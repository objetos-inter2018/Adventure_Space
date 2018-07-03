import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;
import java.awt.Font;
/**
 *En esta clase se inicializan y crean los objetos que interactuaran en el nivel, en este caso solo es el jefe final
 */
public class Nivel3 extends World
{
     private int bMusic=0;
    private Heroe usuario3 = new Heroe(3);
    private Jefe jefe = new Jefe();
     private SimpleTimer timeM;
    private int Tmp=0; 
    /*
    private Asteroide a1 =new Asteroide();
    private Asteroide a2 =new Asteroide();
    private Asteroide a3 =new Asteroide();
    private Asteroide a4 =new Asteroide();
    private Asteroide a5 =new Asteroide(); */
      private Asteroide2 e1 =new Asteroide2();
    private Asteroide2 e2 =new Asteroide2();
    private Asteroide2 e3 =new Asteroide2();
    private Asteroide2 e4 =new Asteroide2();
    private Asteroide2 e5 =new Asteroide2();
    private alien2 alien1 = new alien2();
    private alien2 alien2 = new alien2();
    private alien2 alien3 = new alien2();
    private alien2 alien4 = new alien2();
    private Flota2 f1 = new Flota2();
    private Flota2 f2 = new Flota2();
    private Flota2 f3 = new Flota2();
    
    private SimpleTimer timer = new SimpleTimer();
    private SimpleTimer timerAdd = new SimpleTimer();
    private Linea linea= new Linea();
    private Linea linea2= new Linea();
      private Linea2 linea3= new Linea2();
    private Linea2 linea4 = new Linea2();
    Letrero puntosN3;
    Letrero vidasN3;
    Letrero rocketN3;
    Letrero balasN3;
    Letrero tiempo3;
    GreenfootImage imagen;
    /**
     * Constructor Nivel3.
     * 
     */
    public Nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 600, 1); 
        construyeNivel3();
    }
    
    /**
     * Método que inicializa todos los objetos que se crearan en el nivel 
     */
    public void construyeNivel3()
    {
        addObject(usuario3,435,550);
        addObject(jefe,160,70);
        /*
        addObject(a1,160,0);
        addObject(a2,240,0);
        addObject(a3,390,0);
        addObject(a4,590,0);
        addObject(a5,720,0);
         */
        //addObject(f1,200,20);
        addObject(f2,350,20);
        //addObject(f3,600,20);
        addObject(linea,2000,0);
        addObject(linea2,2000,400);
        addObject(linea3,100,0);
        addObject(linea4,100,400);
        addObject(e1,120,20);
        addObject(e2,300,20);
        addObject(e3,480,20);
        addObject(e4,660,20);
        addObject(e5,250,20);
         addObject(alien1,120,20);
        addObject(alien2,300,20);
        addObject(alien3,480,20);
        addObject(alien4,660,20);
        
        puntosN3=new Letrero(0,"puntaje:");
        vidasN3=new Letrero(30,"vidas:");
        rocketN3=new Letrero(50,"Rocket:");
        balasN3=new Letrero(1000,"Balas:");
        tiempo3= new Letrero(0,"Tiempo:");
        addObject(puntosN3,110,85);
        addObject(vidasN3,110,115);
        addObject(rocketN3,110,145);
        addObject(balasN3,110,175);
        addObject(tiempo3,110,205);
        setBackground("space.png");
        //Greenfoot.playSound("Imperial.wav");
        timeM= new SimpleTimer();
    }
    
    /**
     * Ciclo que siempre se esta ejecutando
     * En este se checa la validacion de puntos para ganar el juego
     * Mientras no se cumplan las condiciones especificadas se 
     * ejecutaran los métodos, activaObjetosN3 y enemigoAlcanzado
     */
    public void act()
    {   
         IniTime();
        if(puntosN3.obtenerValor()<1)//VA A SER 50
        {
          activaObjetosN3();
          enemigoAlcanzado();
          tocandoAsteroide();
        }
        else
        {
          activaObjetosN3();
           enemigoAlcanzado();
           tocandoAsteroide();
           /*
            if(puntosN3.obtenerValor()>20){
            elimina_escenario();
            JuegoGanado g=new JuegoGanado();
            addObject(g,((getWidth()/2)+30),((getHeight()/2)+150));
        } */}
    }
    
    /**
     * Método que reactiva a la posicion inicial al enemigo, si este llega a un borde  
     */
    public void activaObjetosN3()
    {
       int a,b,c,d,e,ye,u,v,w;
       /*
        if(f1.borde()==1)
        {
            removeObject(f1);
            do
            {
                u=Greenfoot.getRandomNumber(735);
            }while(u<119);
            addObject(f1,u,20);
        }
        */
        if(f2.borde()==1)
        {
            removeObject(f2);
            do
            {
                v=Greenfoot.getRandomNumber(735);
            }while(v<119);
            addObject(f2,v,20);
        }
        /*
        if(f3.borde()==1)
        {
            removeObject(f3);
            do
            {
                w=Greenfoot.getRandomNumber(735);
            }while(w<119);
            addObject(f3,w,20);
        }*/
       if(alien1.borde()==1)
        {
            removeObject(alien1);
            addObject(alien1,120,20);
          //  Greenfoot.playSound("ufo.wav");
        }
        
        if(alien2.borde()==1)
        {
            removeObject(alien2);
            addObject(alien2,120,20);
         //   Greenfoot.playSound("ufo.wav");
        }
        
        if(alien3.borde()==1)
        {
            removeObject(alien3);
            addObject(alien3,120,20);
           // Greenfoot.playSound("ufo.wav");
        }
        
        if(alien4.borde()==1)
        {
            removeObject(alien4);
            addObject(alien4,120,20);
          //  Greenfoot.playSound("ufo.wav");
        }
       /*
       if(a1.borde()==1)
        {
            removeObject(a1);
            do
            {
                a=Greenfoot.getRandomNumber(735);
                ye=Greenfoot.getRandomNumber(400);
            }while(a<130 && ye<119);
            addObject(a1,a,ye);
        }
        
        if(a2.borde()==1)
        {
            removeObject(a2);
            do  
            {
                b=Greenfoot.getRandomNumber(735);
            }while(b<119);
            addObject(a2,b,0);
        }
        
        if(a3.borde()==1)
        {
            removeObject(a3);
            do  
            {
                c=Greenfoot.getRandomNumber(735);
            }while(c<119);
            addObject(a3,c,0);
        }
              
        if(a4.borde()==1)
        {
            removeObject(a4);
            do  
            {
                d=Greenfoot.getRandomNumber(735);
            }while(d<119);
            addObject(a4,d,0);
        }      
        
        if(a5.borde()==1)
        {
            removeObject(a5);
            do  
            {
                e=Greenfoot.getRandomNumber(735);
            }while(e<119);
            addObject(a5,e,0);
        }
        
        */
        
          if(e1.borde()==1)
        {
            removeObject(e1);
            addObject(e1,120,20);
          //  Greenfoot.playSound("ufo.wav");
        }
        
        if(e2.borde()==1)
        {
            removeObject(e2);
            addObject(e2,120,20);
         //   Greenfoot.playSound("ufo.wav");
        }
        
        if(e3.borde()==1)
        {
            removeObject(e3);
            addObject(e3,120,20);
           // Greenfoot.playSound("ufo.wav");
        }
        
        if(e4.borde()==1)
        {
            removeObject(e4);
            addObject(e4,120,20);
          //  Greenfoot.playSound("ufo.wav");
        }
        if(e5.borde()==1)
        {
            removeObject(e5);
            addObject(e5,120,20);
          //  Greenfoot.playSound("ufo.wav");
        }   
        if(jefe.borde()==1)
        {
            removeObject(jefe);
            addObject(jefe,160,70);
        }
    }
    
    /**
     * Método que puntua en 1, si el método alcanzado del objeto jefe es igual a 1 
     */
    public void enemigoAlcanzado()
    {
        int c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
        /*
        if(f1.alcanzado()==1)
        {
            removeObject(f1);
            puntosN3.incrementa(1);
            do
            {
                c=Greenfoot.getRandomNumber(735);
            }while(c<119);
            addObject(f1,c,20);
        } 
        */
        if(f2.alcanzado()==1)
        {
            removeObject(f2);
            puntosN3.incrementa(1);
            do
            {
                d=Greenfoot.getRandomNumber(735);
            }while(d<119);
            addObject(f2,d,20);
        } 
        /*
        if(f3.alcanzado()==1)
        {
            removeObject(f3);
            puntosN3.incrementa(1);
            do
            {
                e=Greenfoot.getRandomNumber(735);
            }while(e<119);
            addObject(f3,e,20);
        }
        */
        if(e1.alcanzado()==1)
        {
            removeObject(e1);
            puntosN3.incrementa(1);
            do  
            {
                f=Greenfoot.getRandomNumber(598);
            }while(f<119);
            addObject(e1,f,0);
        }  
        
        if(e2.alcanzado()==1)
        {
            removeObject(e2);
            puntosN3.incrementa(1);
            do  
            {
                g=Greenfoot.getRandomNumber(598);
            }while(g<119);
            addObject(e2,g,0);
        } 
        
        if(e3.alcanzado()==1)
        {
            removeObject(e3);
            puntosN3.incrementa(1);
            do  
            {
                h=Greenfoot.getRandomNumber(598);
            }while(h<119);
            addObject(e3,h,0);
        } 
        
        if(e4.alcanzado()==1)
        {
            removeObject(e4);
            puntosN3.incrementa(1);
            do  
            {
                i=Greenfoot.getRandomNumber(598);
            }while(i<119);
            addObject(e4,i,0);
        } 
        
        if(e5.alcanzado()==1)
        {
            removeObject(e5);
            puntosN3.incrementa(1);
            do  
            {
                j=Greenfoot.getRandomNumber(598);
            }while(j<119);
            addObject(e5,j,0);
        }  
         if(alien1.alcanzado()==1)
        {
            Greenfoot.playSound("Explosion1.wav");
            removeObject(alien1);
            puntosN3.incrementa(1);
            addObject(alien1,119,20);
        }  
        
        if(alien2.alcanzado()==1)
        {
            Greenfoot.playSound("Explosion1.wav");
            removeObject(alien2);
            puntosN3.incrementa(1);
            addObject(alien2,149,20);
        }
        
        if(alien3.alcanzado()==1)
        {
            Greenfoot.playSound("Explosion1.wav");
            removeObject(alien3);
            puntosN3.incrementa(1);
            addObject(alien3,179,20);
        }  
        
        if(alien4.alcanzado()==1)
        {
            Greenfoot.playSound("Explosion1.wav");
            removeObject(alien4);
            puntosN3.incrementa(1);
            addObject(alien4,209,20);
        }
        if(jefe.alcanzado()==1)
        {
            Greenfoot.playSound("Explosion1.wav");
            puntosN3.incrementa(1);
        }
    }
    
    /**
     * Metodo que elimina todos los objetos del nivel
     */
    public void elimina_escenario()
    {
        List lista_mundo = getObjects(null);
        Iterator i = lista_mundo.iterator();
        while(i.hasNext())
        {
            Actor a = (Actor) i.next();
            if( a!= null ) 
            {
                removeObject(a);
            }
        }    
    }
    
    /**
     * Método que hace posible quitar 1 vida al usuario,
     * las vidas se almacenan gracias a la clase letrero
     */
    public void heroeAlcanzado()
    {
        usuario3.pierdeUnaVida();
    }
    
    
    public void tocandoAsteroide()
        {
         int j,k,l,m,n;
         if(e1.toca2()==1)
         {
            Greenfoot.playSound("explosion.wav");
            removeObject(e1);
            vidasN3.decrementa(0);
            do  
            {
                j=Greenfoot.getRandomNumber(598);
            }while(j<119);
            addObject(e1,j,0);
         } 
         if(e2.toca2()==1)
         {
             Greenfoot.playSound("explosion.wav");
             removeObject(e2);
             vidasN3.decrementa(0);
             do  
             {
                k=Greenfoot.getRandomNumber(598);
             }while(k<119);
             addObject(e2,k,0);
         }
         if(e3.toca2()==1)
         {
             Greenfoot.playSound("explosion.wav");
             removeObject(e3);
             vidasN3.decrementa(0);
             do  
             {
                l=Greenfoot.getRandomNumber(598);
             }while(l<119);
             addObject(e3,l,0);
         } 
         if(e4.toca2()==1)
         {
             Greenfoot.playSound("explosion.wav");
             removeObject(e4);
             vidasN3.decrementa(0);
             do  
             {
                m=Greenfoot.getRandomNumber(598);
             }while(m<119);
             addObject(e4,m,0);
         } 
         if(e5.toca2()==1)
         {
            Greenfoot.playSound("explosion.wav");
            removeObject(e5);
            vidasN3.decrementa(0);
            do  
             {
                n=Greenfoot.getRandomNumber(598);
             }while(n<119);
            addObject(e5,n,0);
         }
    }
    public void IniTime()
    {
        
        if(timeM.millisElapsed()>0)
           {
               
               if(timeM.millisElapsed()>1000)
               {
                   Tmp++;
                   tiempo3.aumenta(Tmp);
                   if(Tmp==30){
                     
                     elimina_escenario();
                     JuegoGanado g=new JuegoGanado();
            addObject(g,((getWidth()/2)+30),((getHeight()/2)+150));
                    
                }// addObject(tiempo.aumenta(1),110,205);
                   
                   timeM.mark();  
               }
           }
       
    }
}

