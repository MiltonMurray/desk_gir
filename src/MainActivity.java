import com.sun.awt.AWTUtilities;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainActivity {
    public static void main(String[] args){

        JFrame j = new JFrame("Gir");

        JLabel gir = new JLabel(new ImageIcon("gir.gif"));
        try {
            j.setIconImage(ImageIO.read(new File("iGir.png")));
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
        j.add(gir);

        j.setSize(240, 200);
        j.setLocation(1, 570);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setUndecorated(true);
        j.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        j.setAlwaysOnTop(true);
        // make the frame visible (activate the GUI frame)
        j.setVisible(true);
    }

}
