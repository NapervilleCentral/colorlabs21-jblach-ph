
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
        Picture j3 = new Picture("images/justin selfie.jpg");
        Picture j4 = new Picture("images/justin selfie.jpg");
        Picture j5 = new Picture("images/justin selfie.jpg");
        Picture j6 = new Picture("images/justin selfie.jpg");
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
        // j1.explore();
        
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
        // j2.explore();
        /**
         * custom color palette
         */
        
        Color dstbl = new Color(106, 140, 165);
        Color fdgld = new Color(210, 183, 108);
        Color sftblk = new Color(26, 26, 26);
        Color stblu = new Color(88, 112, 133);
        Color wrmsnd = new Color(219, 205, 166);
        
        
        Pixel[] pixelJ3;
        pixelJ3 = j3.getPixels();
        for (Pixel spot3 : pixelJ3)
        {
            red = spot3.getRed();
            blue = spot3.getBlue();
            green = spot3.getGreen();
            int avg = (red + blue + green) / 3;
            spot3.setRed(avg);
            spot3.setBlue(avg);
            spot3.setGreen(avg);
            if (red < 65)
            {
                spot3.setColor(sftblk);
            }
            else if (red < 100)
            {
                spot3.setColor(stblu);
            }
            else if (red < 138)
            {
                spot3.setColor(dstbl);
            }
            else if (red < 194)
            {
                spot3.setColor(fdgld);
            }
            else
            {
                spot3.setColor(wrmsnd);
            }
        }
        j3.explore();
        
        Color inkblu = new Color(15, 42, 63);
        Color chcgry = new Color (54, 61, 68);
        Color dstrst = new Color(162, 94, 74);
        Color ltrst = new Color (186, 126, 106);
        Color palegr = new Color (217, 217, 214);
        
        Pixel[] pixelJ4;
        pixelJ4 = j4.getPixels();
        for (Pixel spot4 : pixelJ4)
        {
            red = spot4.getRed();
            blue = spot4.getBlue();
            green = spot4.getGreen();
            int avg = (red + blue + green) / 3;
            spot4.setRed(avg);
            spot4.setBlue(avg);
            spot4.setGreen(avg);
            if (red < 65)
            {
                spot4.setColor(inkblu);
            }
            else if (red < 100)
            {
                spot4.setColor(chcgry);
            }
            else if (red < 138)
            {
                spot4.setColor(dstrst);
            }
            else if (red < 194)
            {
                spot4.setColor(ltrst);
            }
            else
            {
                spot4.setColor(palegr);
            }
        }
        // j4.explore();
        
        Color dpslt = new Color(46, 58, 68);
        Color dkbrk = new Color(115, 50, 47);
        Color crmsn = new Color(140, 63, 60);
        Color wrmtp = new Color(168, 149, 123);
        Color sftcl = new Color(196, 172, 150);
        
        Pixel[] pixelJ5;
        pixelJ5 = j5.getPixels();
        for (Pixel spot5 : pixelJ5)
        {
            red = spot5.getRed();
            blue = spot5.getBlue();
            green = spot5.getGreen();
            int avg = (red + blue + green) / 3;
            spot5.setRed(avg);
            spot5.setBlue(avg);
            spot5.setGreen(avg);
            if (red < 65)
            {
                spot5.setColor(dpslt);
            }
            else if (red < 100)
            {
                spot5.setColor(dkbrk);
            }
            else if (red < 138)
            {
                spot5.setColor(crmsn);
            }
            else if (red < 194)
            {
                spot5.setColor(wrmtp);
            }
            else
            {
                spot5.setColor(sftcl);
            }
        }
        // j5.explore();
        
        Color slbrn = new Color(62, 40, 31);
        Color brtumb = new Color(90, 59, 46);
        Color olvgr = new Color(107, 122, 66);
        Color olvlt = new Color(148, 159, 112);
        Color bnwt = new Color(231, 227, 212);
        
        Pixel[] pixelJ6;
        pixelJ6 = j6.getPixels();
        for (Pixel spot6 : pixelJ6)
        {
            red = spot6.getRed();
            blue = spot6.getBlue();
            green = spot6.getGreen();
            int avg = (red + blue + green) / 3;
            spot6.setRed(avg);
            spot6.setBlue(avg);
            spot6.setGreen(avg);
            if (red < 65)
            {
                spot6.setColor(slbrn);
            }
            else if (red < 100)
            {
                spot6.setColor(brtumb);
            }
            else if (red < 138)
            {
                spot6.setColor(olvgr);
            }
            else if (red < 194)
            {
                spot6.setColor(olvlt);
            }
            else
            {
                spot6.setColor(bnwt);
            }
        }
        j6.explore();
    }//main       
}//class
