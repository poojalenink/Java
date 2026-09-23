import java.awt.*;
import java.awt.event.*;

class mod4 extends Frame implements ActionListener {

    Button red;
    Button blue;
    Label label;

    mod4() {

        red = new Button("Button 1");
        blue = new Button("Button 2");
        label = new Label("Choose a button");

        setLayout(new FlowLayout());

        add(red);
        add(blue);
        add(label);

        red.addActionListener(this);
        blue.addActionListener(this);

        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            label.setText("Button 1 clicked");
        }

        if (e.getSource() == blue) {
            label.setText("Button 2 clicked");
        }
    }

    public static void main(String[] args) {
        new mod4();
    }
}