
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class ShepardFairyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        //change with selfie picture
        Picture j1 = new Picture("images/justin selfie.jpg");
        Picture gorge = new Picture("images/gorge.jpg");
        Picture j2 = new Picture("images/justin selfie.jpg");
        /**
         * method 1 change
         * 
         */
        int red, blue, green;
        Color dkblue = new Color(0, 0, 139);
        Color ltsteel = new Color(176, 196, 222);
        Color Red = new Color(255, 0, 0);
        Color bone = new Color(227, 218, 201);
        Color offwt = new Color(242, 240, 239);
        
        // selfie (method 1)
        Pixel[] pixelJ;
        pixelJ = j1.getPixels();
        for (Pixel spot1 : pixelJ)
        {
            red = spot1.getRed();
            blue = spot1.getBlue();
            green = spot1.getGreen();
            int avg = (red + blue + green) / 3;
            spot1.setRed(avg);
            spot1.setBlue(avg);
            spot1.setGreen(avg);
            if (red < 65)
            {
                spot1.setColor(dkblue);
            }
            else if (red < 100)
            {
                spot1.setColor(Red);
            }
            else if (red < 138)
            {
                spot1.setColor(ltsteel);
            }
            else if (red < 194)
            {
                spot1.setColor(bone);
            }
            else
            {
                spot1.setColor(offwt);
            }
        }
        j1.explore();
        
        // gorge (method 2) narrow white down to get more definition on face
        Pixel[] pixelJ2;
        pixelJ2 = j2.getPixels();
        int s = 255;
        int b = 0;
        for (Pixel spot2 : pixelJ2)
        {
            red = spot2.getRed();
            blue = spot2.getBlue();
            green = spot2.getGreen();
            int avg = (red + blue + green) / 3;
            spot2.setRed(avg);
            spot2.setBlue(avg);
            spot2.setGreen(avg);
            
            if (red > b)
            {
                b = red;
            }
            if (red < s)
            {
                s = red;
            }
            int Avg = (b - s) / 4;
            if (red < Avg)
            {
                spot2.setColor(dkblue);
            }
            else if (red < (2 * Avg))
            {
                spot2.setColor(Red);
            }
            else if (red < (3 * Avg))
            {
                spot2.setColor(ltsteel);
            }
            else
            {
                spot2.setColor(offwt);
            }
        }
        System.out.println(s + " " + b);
        j2.explore();
        /**
         * custom color palette
         */
        
    }//main       
}//class
