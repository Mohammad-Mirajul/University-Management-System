package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signUp, cancel;
    JTextField tfusername;
    JPasswordField tfpassword;
    JCheckBox rememberMe;
    JLabel forgotPassword;

    Conn conn = new Conn();

    Login() {
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        setContentPane(mainPanel);

        JPanel loginFormPanel = new JPanel();
        loginFormPanel.setLayout(null);
        loginFormPanel.setBackground(Color.WHITE);
        mainPanel.add(loginFormPanel);

        JLabel signInLabel = new JLabel("Sign In");
        signInLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        signInLabel.setBounds(30, 30, 200, 30);
        loginFormPanel.add(signInLabel);

        JLabel lblusername = new JLabel("USERNAME");
        lblusername.setBounds(30, 80, 100, 20);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblusername.setForeground(Color.GRAY);
        loginFormPanel.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(30, 110, 240, 30);
        loginFormPanel.add(tfusername);

        JLabel lblpassword = new JLabel("PASSWORD");
        lblpassword.setBounds(30, 160, 100, 20);
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblpassword.setForeground(Color.GRAY);
        loginFormPanel.add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(30, 190, 240, 30);
        loginFormPanel.add(tfpassword);

        rememberMe = new JCheckBox("Remember Me");
        rememberMe.setBounds(30, 230, 120, 20);
        rememberMe.setBackground(Color.WHITE);
        loginFormPanel.add(rememberMe);

        forgotPassword = new JLabel("Forgot Password?");
        forgotPassword.setBounds(160, 230, 120, 20);
        forgotPassword.setForeground(Color.BLUE);
        forgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
        forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgotPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Please contact support for password recovery.");
            }
        });
        loginFormPanel.add(forgotPassword);

        login = new JButton("Sign In");
        login.setBounds(30, 270, 110, 40);
        login.setBackground(new Color(220, 53, 69));
        login.setForeground(Color.WHITE);
        login.setBorderPainted(false);
        login.setFocusPainted(false);
        login.setFont(new Font("Tahoma", Font.BOLD, 14));
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.addActionListener(this);
        loginFormPanel.add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(160, 270, 110, 40);
        cancel.setBackground(new Color(220, 53, 69));
        cancel.setForeground(Color.WHITE);
        cancel.setBorderPainted(false);
        cancel.setFocusPainted(false);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 14));
        cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cancel.addActionListener(e -> setVisible(false));
        loginFormPanel.add(cancel);

        JPanel welcomePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = new Color(255, 102, 178);
                Color color2 = new Color(255, 153, 204);
                GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        welcomePanel.setLayout(null);
        mainPanel.add(welcomePanel);

        JLabel welcomeText = new JLabel("Welcome to login");
        welcomeText.setFont(new Font("Tahoma", Font.BOLD, 24));
        welcomeText.setForeground(Color.WHITE);
        welcomeText.setBounds(60, 150, 300, 30);
        welcomePanel.add(welcomeText);

        JLabel noAccountText = new JLabel("Don't have an account?");
        noAccountText.setFont(new Font("Tahoma", Font.PLAIN, 14));
        noAccountText.setForeground(Color.WHITE);
        noAccountText.setBounds(60, 200, 200, 20);
        welcomePanel.add(noAccountText);

        signUp = new JButton("Sign Up");
        signUp.setBounds(60, 230, 120, 30);
        signUp.setBackground(Color.WHITE);
        signUp.setForeground(new Color(255, 102, 102));
        signUp.setFont(new Font("Tahoma", Font.BOLD, 14));
        signUp.setFocusPainted(false);
        signUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signUp.addActionListener(e -> JOptionPane.showMessageDialog(null, "Redirecting to Sign Up page."));
        welcomePanel.add(signUp);

        setSize(800, 400);
        setLocation(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = tfusername.getText();
            String password = new String(tfpassword.getPassword());

            String query = "SELECT * FROM login WHERE username='" + username + "' AND password='" + password + "'";

            try {
                Connection con = conn.c;
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

                rs.close();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
