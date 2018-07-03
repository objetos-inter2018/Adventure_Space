import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Clase JuegoPerdido
 */

public class JuegoPerdido extends Actor
{
    GreenfootImage imagen;
    String mensaje;
    
    /**
     * Constructor Clase JuegoPerdido
     */
    public JuegoPerdido()
    {
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana",Font.BOLD,34));
        imagen.drawString("GAME OVER",0,30);
        imagen.setFont(new Font("Verdana",Font.BOLD,20));
        imagen.drawString("",0,60);
        imagen.setFont(new Font("Verdana",Font.BOLD,20));
        imagen.drawString("ERES UN LOSER!",0,90);
        Greenfoot.playSound("Chewbacca.mp3");
        setImage(imagen);
        Greenfoot.stop();     
    }   
}
