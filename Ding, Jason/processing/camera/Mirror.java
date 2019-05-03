package camera;

import processing.core.PApplet;
import processing.core.PImage;
import processing.video.*;

public class Mirror extends PApplet
{
    private Capture cam;
    
    private boolean newEditedFrameAvailable;
    private PImage editedFrame;
    
    public static void main(String[] args)
    {
        PApplet.main("camera.Mirror");
    }
    
    public void settings()
    {
        size(1280, 720);
    }
    
    public void setup()
    {
        String[] cameras = Capture.list();
        
        System.out.println("Available cameras:");
        for(String camera : cameras)
            System.out.println(camera);
        
        cam = new Capture(this, cameras[0]);
        cam.start();
    }
    
    public void draw()
    {
        if(newEditedFrameAvailable)
        {
            image(editedFrame, 0, 0);
            newEditedFrameAvailable = false;
        }
            
        if(cam.available() && ! newEditedFrameAvailable)
            readAndEditFrame();
    }
    
    // precondition: cam.available() && background != null
    private void readAndEditFrame()
    {
        cam.read();
        
        editedFrame = createImage(width, height, RGB);
        editedFrame.loadPixels();
        cam.loadPixels();
        

//        for(int i = 0; i < editedFrame.pixels.length - 1; i++)
//        {
//            int pixel = cam.pixels[i];
//            float average = (red(pixel) + green(pixel) + blue(pixel)) / 3;
//            
//            int otherPixel = cam.pixels[i + 1];
//            float avg = (red(otherPixel) + green(otherPixel) + blue(otherPixel)) / 3;
//            
//            if(Math.abs(average - avg) < threshold)
//                editedFrame.pixels[i] = color(255, 255, 255);
//            else
//            	editedFrame.pixels[i] = color(0);
//        }
        
        for (int i = 0; i < editedFrame.pixels.length; i++)
        {
//        	if (i % 1280 >= 640)
//        		editedFrame.pixels[i] = cam.pixels[640 - Math.abs(i - 640)];
//        	else
//        		editedFrame.pixels[i] = cam.pixels[i];
        	int pixel = cam.pixels[i];
        	editedFrame.pixels[i] = color(red(pixel), green(pixel), blue(pixel));
        	editedFrame.pixels[editedFrame.pixels.length - (i + 1)] = color(red(pixel), green(pixel), blue(pixel));
        }
        
        editedFrame.updatePixels();
        
        newEditedFrameAvailable = true;
        
    }
}