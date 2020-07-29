package com.enkindle.image;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LogoImage {

	public static void main(String[] args) throws IOException {
		
		 String inputImagePath = "/Users/thirumal/Downloads/6412325487_a73b999f72_o.jpg";
	        String outputImagePath1 = "1.png";
	        String outputImagePath2 = "2.png";
	        String outputImagePath3 = "3.png";
	        String affineTransformation = "4.png";
	 /*
	        try {
	            // resize to a fixed width (not proportional)
	            int scaledWidth = 100;
	            int scaledHeight = 100;
	            resize(inputImagePath, outputImagePath1, scaledWidth, scaledHeight);
	 
	            // resize smaller by 50%
	            double percent = 0.5;
	            resize(inputImagePath, outputImagePath2, percent);
	 
	            // resize bigger by 50%
	            percent = 1.5;
	            resize(inputImagePath, outputImagePath3, percent);
	 
	        } catch (IOException ex) {
	            System.out.println("Error resizing the image.");
	            ex.printStackTrace();
	        }
		*/
	      
		BufferedImage icon = ImageIO.read(new File("/Users/thirumal/Downloads/non-www to www.png"));
		icon = scale(icon, BufferedImage.TYPE_INT_RGB, 100, 100, 0, 0);
		  ImageIO.write(icon, "png", new File(affineTransformation));
//		BufferedImage rounded = makeRoundedCorner(icon, 200);
//		ImageIO.write(rounded, "png", new File("img.png"));
//		
		
		System.out.println("done");
	}

	public static BufferedImage makeRoundedCorner(BufferedImage image, int cornerRadius) {
	    System.out.println(image.getHeight() + " : " + image.getWidth());
		int w = 500;
	    int h = 500;
	    BufferedImage output = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2 = output.createGraphics();

	    // This is what we want, but it only does hard-clipping, i.e. aliasing
	    // g2.setClip(new RoundRectangle2D ...)

	    // so instead fake soft-clipping by first drawing the desired clip shape
	    // in fully opaque white with antialiasing enabled...
	    g2.setComposite(AlphaComposite.Src);
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g2.setColor(Color.WHITE);
	    g2.fill(new RoundRectangle2D.Float(0, 0, w, h, cornerRadius, cornerRadius));

	    // ... then compositing the image on top,
	    // using the white shape from above as alpha source
	    g2.setComposite(AlphaComposite.SrcAtop);
	    g2.drawImage(image, 0, 0, null);

	    g2.dispose();

	    return output;
	}
	
	 public static void resize(String inputImagePath,
	            String outputImagePath, int scaledWidth, int scaledHeight)
	            throws IOException {
	        // reads input image
	        File inputFile = new File(inputImagePath);
	        BufferedImage inputImage = ImageIO.read(inputFile);
	 
	        // creates output image
	        BufferedImage outputImage = new BufferedImage(scaledWidth,
	                scaledHeight, inputImage.getType());
	 
	        // scales the input image to the output image
	        Graphics2D g2d = outputImage.createGraphics();
	        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
	        g2d.dispose();
	 
	        // extracts extension of output file
	        String formatName = outputImagePath.substring(outputImagePath
	                .lastIndexOf(".") + 1);
	 
	        // writes to output file
	        ImageIO.write(outputImage, formatName, new File(outputImagePath));
	    }
	 
	 public static void resize(String inputImagePath,
	            String outputImagePath, double percent) throws IOException {
	        File inputFile = new File(inputImagePath);
	        BufferedImage inputImage = ImageIO.read(inputFile);
	        int scaledWidth = (int) (inputImage.getWidth() * percent);
	        int scaledHeight = (int) (inputImage.getHeight() * percent);
	        resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
	    }
	 
	 
	 public static BufferedImage scale(BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
		    BufferedImage dbi = null;
		    if(sbi != null) {
		        dbi = new BufferedImage(dWidth, dHeight, imageType);
		        Graphics2D g = dbi.createGraphics();
		        AffineTransform at = AffineTransform.getScaleInstance(fWidth, fHeight);
		        g.drawRenderedImage(sbi, at);
		    }
		    return dbi;
		}
}
