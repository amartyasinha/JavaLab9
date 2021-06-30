import java.awt.*;
import java.awt.event.*;


public class MouseEventHandle extends Frame implements MouseListener{
    Label lbl;

    MouseEventHandle() {
        addMouseListener(this);
        lbl = new Label();
        lbl.setBounds(160, 150, 200, 20);
        add(lbl);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        lbl.setText("Mouse is Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        lbl.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        lbl.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        lbl.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        lbl.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseEventHandle();
    }
}
