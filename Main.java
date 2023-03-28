
//import java.awt.Graphics;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Main {
    static int width = 800;
    static int height = 800;
    
    static Color red = new Color(249, 20, 20);
    static Color blue = new Color(20, 20, 249);
    static Color yellow = new Color(249, 200, 20);
    static Color brown = new Color(153, 72, 29);
    static Color black = new Color(0, 0, 0);
    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;

    /*private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };/* */
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);
        drawHorizontalLine(7, 11, 0, red);
        drawHorizontalLine(6, 14, 1, red);
        fillRect(6, 2, 7, 4, yellow);
        drawHorizontalLine(7, 12, 6, yellow);
        drawHorizontalLine(6, 13, 7, red);
        drawHorizontalLine(5, 14, 8, red);
        drawHorizontalLine(4, 15, 9, red);
        fillRect(4,10,12,3, yellow);
        drawHorizontalLine(6, 13, 10, red);
        drawHorizontalLine(6, 8, 13, blue);
        drawHorizontalLine(11, 13, 13, blue);
        drawHorizontalLine(12, 14, 14, brown);
        drawHorizontalLine(12, 15, 15, brown);
        drawHorizontalLine(5, 7, 14, brown);
        drawHorizontalLine(4, 7, 15, brown);
        drawHorizontalLine(6, 13, 12, blue);
        drawHorizontalLine(7, 12, 11, blue);
        drawHorizontalLine(7, 12, 10, blue);
        drawHorizontalLine(8, 11, 9, blue);
        drawVerticalLine(7, 9, 8, blue);
        drawVerticalLine(7, 9, 11, blue);
        putPixel(8, 10, yellow);
        putPixel(11, 10, yellow);
        drawHorizontalLine(11, 14, 5, black);
        putPixel(12, 4, black);
        drawVerticalLine(2, 3, 11, black);
        drawVerticalLine(3, 4, 5, brown);
        drawHorizontalLine(6, 8, 2, brown);
        drawHorizontalLine(7, 8, 4, brown);
        putPixel(7, 3, brown);
        putPixel(6, 5, brown);
        drawHorizontalLine(13, 15, 4, yellow);
        drawHorizontalLine(13, 14, 3, yellow);


        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art2.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}