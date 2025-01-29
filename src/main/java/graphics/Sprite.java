package graphics;

import java.awt.*;

public class Sprite {
    private int width;
    private int height;
    private int x;
    private int y;
    private Image image;


    public Sprite(String path) {
        this.image = Toolkit.getDefaultToolkit().getImage(path);
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }
}
