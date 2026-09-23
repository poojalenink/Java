import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mod5 extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JButton login;
    JLabel result;

    mod5() {

        username = new JTextField(15);
        password = new JPasswordField(15);

        login = new JButton("Login");
        result = new JLabel("");

        setLayout(new FlowLayout());

        add(new JLabel("Username:"));
        add(username);

        add(new JLabel("Password:"));
        add(password);

        add(login);
        add(result);

        login.addActionListener(this);

        setTitle("Swing Login");
        setSize(350, 250);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String user = username.getText();
        String pass = new String(password.getPassword());

        if (user.equals("admin") && pass.equals("1234")) {
            result.setText("Login Successful");
        } else {
            result.setText("Invalid Login");
        }
    }

    public static void main(String[] args) {
        new mod5();
    }
}