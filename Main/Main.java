package Main;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

    public static void main(String[] args) {

        JMenuBar menu = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem open = new JMenuItem("Open");

        fileMenu.add(save);
        fileMenu.add(open);
        menu.add(fileMenu);
        

        JFrame frame = new JFrame("Gloom Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menu);
        DrawingCanvas canvas = new DrawingCanvas();
        canvas.setSize(640, 480);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

    }

}