
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
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         
         //relative path
         Picture j = new Picture("images\\justin selfie.jpg");
         //change with selfie picture
         Picture j1 = new Picture("images/justin selfie.jpg");
         Picture j2 = new Picture("images/justin selfie.jpg");
         Picture j3 = new Picture("images/justin selfie.jpg");
         /**
          * method 1 change
          * 
          */
         int red, blue, green;
         Pixel[] pixelJ;
         pixelJ = j1.getPixels();
         Color dkblue = new Color(0, 0, 139);
         Color ltsteel = new Color(176, 196, 222);
         Color Red = new Color(255, 0, 0);
         Color bone = new Color(227, 218, 201);
         Color offwt = new Color(242, 240, 239);
         j1.explore();
         for (Pixel spot1 : pixelJ)
         {
             red = spot1.getRed();
             blue = spot1.getBlue();
             green = spot1.getGreen();
             int avg = (red + blue + green) / 3;
             spot1.setRed(avg);
             spot1.setBlue(avg);
             spot1.setGreen(avg);
             
             if (red < 70 && blue < 70 && green < 70)
             {
                 spot1.setColor(dkblue);
             }
             else if ((red >= 70 && red < 128) && (blue >= 70 && blue < 128) && (green >= 70 && green < 128))
             {
                 spot1.setColor(Red);
             }
             else if ((red >= 128 && red < 175) && (blue >= 128 && blue < 175) && (green >= 128 && green < 175))
             {
                 spot1.setColor(ltsteel);
             }
             else if ((red >= 150 && red < 200) && (blue >= 150 && blue < 200) && (green >= 150 && green < 200))
             {
                 spot1.setColor(bone);
             }
             else
             {
                 spot1.setColor(offwt);
             }
             
             // add a fifth bucket for more detail in face
         }
         j1.explore();
         
         // group 1 (Dark blue)
         
         
         // group 2 (Red)
         
         
         // group 3 (Light blue)
         
         
         // group 4 (Off-white)
         
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
