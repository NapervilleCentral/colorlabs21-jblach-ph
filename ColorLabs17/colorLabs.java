import java.awt.*; // the color class in awt library
import java.util.*;
import java.util.List;
/**
 * colorLabs:
 *
 * Justin Lach
 * 11/10/2025
 */
public class colorLabs
{
    public static void main(String[] args)
    {
        Picture ferris = new Picture("images/2000 ferris wheel2.jpg");
        Picture beach = new Picture("images\\beach.jpg");
        Picture moto = new Picture("images/blueMotorcycle.jpg");
        Picture mark = new Picture("images/blue-mark.jpg");
        
        // change color by a fraction
        int red; 
        Pixel[] pixelF;
        pixelF = ferris.getPixels();
        ferris.explore();
        for (Pixel spot1 : pixelF)
        {
            red = spot1.getRed();
            red *= 0.75; // sets will only take integers
            spot1.setRed(red);
        }
        ferris.explore();
        
        // negative photo
        int blue;
        int green;
        Pixel[] pixelB;
        pixelB = beach.getPixels();
        beach.explore();
        for (Pixel spot2 : pixelB)
        {
            // for negative, do 255 '-' pixel coordinate
            red = spot2.getRed();
            blue = spot2.getBlue();
            green = spot2.getGreen();
            
            spot2.setRed(255 - red);
            spot2.setBlue(255 - blue);
            spot2.setGreen(255 - green);
        }
        beach.explore();
        
        // grayscale (take average...? maybe take average of all coordinates and make each the same or smth)
        
        
        // lighten/darken
        Pixel[] pixelM;
        pixelM = moto.getPixels();
        moto.explore();
        for (Pixel spot3 : pixelM)
        {
            red = spot3.getRed();
            blue = spot3.getBlue();
            green = spot3.getGreen();
            red *= 0.5; // sets will only take integers
            blue *= 0.5;
            green *= 0.5;
            spot3.setRed(red);
            spot3.setBlue(blue);
            spot3.setGreen(green);
        }
        moto.explore();
        
        // change color
        
        
        // colorify/blueify
    }
}
