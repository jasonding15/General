package camera;

import processing.core.PApplet;
import processing.core.PImage;
import processing.video.*;

public class Grayscale extends PApplet
{
    private Capture cam;
    
    private boolean newEditedFrameAvailable;
    private PImage editedFrame;
    
    public static void main(String[] args)
    {
        PApplet.main("camera.Grayscale");
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
        
        for(int i = 0; i < editedFrame.pixels.length; i++)
        {
            int pixel = cam.pixels[i];
            float average = (red(pixel) + green(pixel) + blue(pixel)) / 3;
            editedFrame.pixels[i] = color(average, average, average);
        }
        
        editedFrame.updatePixels();
        
        newEditedFrameAvailable = true;
        
    }
}