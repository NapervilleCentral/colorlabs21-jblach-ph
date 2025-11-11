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
        Picture mark = new Picture("images/blue-mark.jpg");
        Picture moto = new Picture("images/blueMotorcycle.jpg");
        
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
        /*
        Pixel[] pixelMa;
        pixelMa = mark.getPixels();
        for (Pixel spot3 : pixelMa)
        {
            red = spot3.getRed();
            blue = spot3.getBlue();
            green = spot3.getGreen();
            int avg = (red + blue + green) / 3;
            spot3.setRed(avg);
            spot3.setBlue(avg);
            spot3.setGreen(avg);
        }
        mark.explore();
        /**/
        // lighten/darken
        Pixel[] pixelM;
        pixelM = moto.getPixels();
        moto.explore();
        for (Pixel spot4 : pixelM) //darken
        {
            red = spot4.getRed();
            blue = spot4.getBlue();
            green = spot4.getGreen();
            red *= 0.5; // sets will only take integers
            blue *= 0.5;
            green *= 0.5;
            spot4.setRed(red);
            spot4.setBlue(blue);
            spot4.setGreen(green);
        }
        moto.explore();
        
        // change color (all 3 by a number, not a fraction)
        // use ferris
        
        // colorify/blueify (mark)
        Pixel[] pixelMa2;
        pixelMa2 = mark.getPixels();
        mark.explore();
        for (Pixel spot6 : pixelMa2) //get a range of pixels of a similar color and make it blue
        {
            red = spot6.getRed();
            blue = spot6.getBlue();
            green = spot6.getGreen();
            if ((red > 100 && red < 190) && (blue > 30 && blue < 130) && (green > 40 && green < 130))
            {
                red = 0;
                blue *= 1.25;
                green = 0;
            }
            spot6.setRed(red);
            spot6.setBlue(blue);
            spot6.setGreen(green);
        }
        mark.explore();
        
    }
}
