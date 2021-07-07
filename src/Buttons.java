import java.awt.*;
import java.awt.event.*;

public class Buttons extends Frame implements ActionListener {
    Label lbl, name;
    Button submit, exit;
    TextArea txt;

    Buttons() {
        lbl = new Label();
        lbl.setBounds(50, 50, 300, 100);
        lbl.setAlignment(Label.CENTER);
        add(lbl);

        name = new Label("Name: ");
        name.setBounds(50, 135, 50, 50);
        name.setAlignment(Label.CENTER);
        add(name);

        txt = new TextArea();
        txt.setBounds(100, 150, 250, 20);
        add(txt);

        submit = new Button("Submit");
        submit.setBounds(120, 180, 50, 20);
        submit.addActionListener(this);
        add(submit);

        exit = new Button("Exit");
        exit.setBounds(220, 180, 50, 20);
        exit.addActionListener(this);
        add(exit);

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

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit)
            lbl.setText("Hello " + txt.getText());
        if (ae.getSource() == exit)
            System.exit(0);

    }

    public static void main(String[] args) {
        new Buttons();
    }
}
