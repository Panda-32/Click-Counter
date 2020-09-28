import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements WindowListener, ActionListener
{
  static TextField text = new TextField(20);
  static Button b;
  int numclicks = 0;

public static void main(String[] args)
{
  b = new Button("Click me!");
  Main myWindow = new Main();
  myWindow.setLayout(new FlowLayout());
  myWindow.addWindowListener(myWindow);
  myWindow.add(b);
  myWindow.add(text);
  b.addActionListener(myWindow);
  myWindow.setSize(700,1000);
  myWindow.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
  numclicks++;
  text.setText("Button Clicked " + numclicks + " times");
}
public void windowClosing(WindowEvent e)
{
  dispose();
  System.exit(0);
}
public void windowOpened(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
}

