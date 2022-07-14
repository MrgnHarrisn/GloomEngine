package TextureManager;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Texture {

    BufferedImage img = null;

    public Texture(String path) {
        try {
            img = ImageIO.read(new File(path));
        } catch (Exception e) {
            System.out.println("Could not open: " + path);
        }
    }

    public Texture(File f) {
        try {
            img = ImageIO.read(f);
        } catch (Exception e) {
            System.out.println("Could not open: " + f.getName());
        }
    }

    public BufferedImage getImage() {
        return img;
    }

    public boolean isVaid() {
        return img == null;
    }
    
}
