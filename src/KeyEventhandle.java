import java.awt.*;
import java.awt.event.*;

public class KeyEventhandle extends Frame implements KeyListener {
    Label lbl;
    TextArea txtarea;

    KeyEventhandle() {
        lbl = new Label();
        lbl.setBounds(155, 50, 200, 20);
        add(lbl);

        txtarea = new TextArea();
        txtarea.setBounds(50, 100, 300, 100);
        add(txtarea);
        txtarea.addKeyListener(this);

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
    public void keyTyped(KeyEvent kl) {
        lbl.setText("Key is Typed");
    }
    public void keyPressed(KeyEvent kl) {
        lbl.setText("Key is Pressed");
    }
    public void keyReleased(KeyEvent kl) {
        lbl.setText("Key is Released");
    }

    public static void main(String[] args) {
        new KeyEventhandle();
    }
}
