package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setTitle("About - University Management System");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // This makes sure only the About window closes
        setLayout(new BorderLayout());

        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel);

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(45, 52, 54));
        headerPanel.setPreferredSize(new Dimension(900, 80));
        headerPanel.setLayout(new BorderLayout());

        JLabel heading = new JLabel("University Management System", JLabel.CENTER);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        headerPanel.add(heading, BorderLayout.CENTER);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel imageLabel = new JLabel();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Miraj.jpg"));
        Image i2 = i1.getImage().getScaledInstance(310, 300, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(i2));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 7;
        contentPanel.add(imageLabel, gbc);

        gbc.gridheight = 1;
        gbc.gridx = 1;

        JLabel name = new JLabel("Developed By: Md. Mirajul Islam");
        name.setFont(new Font("Tahoma", Font.BOLD, 22));
        gbc.gridy = 0;
        contentPanel.add(name, gbc);

        JLabel universityName = new JLabel("Daffodil International University");
        universityName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gbc.gridy = 1;
        contentPanel.add(universityName, gbc);

        JLabel degreeProgram = new JLabel("B.Sc. in Software Engineering");
        degreeProgram.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gbc.gridy = 2;
        contentPanel.add(degreeProgram, gbc);

        JLabel rollno = new JLabel("Student ID: 0242310005341094");
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gbc.gridy = 3;
        contentPanel.add(rollno, gbc);

        JLabel projectPurpose = new JLabel("Purpose: Simplify university administration processes.");
        projectPurpose.setFont(new Font("Tahoma", Font.PLAIN, 16));
        gbc.gridy = 4;
        contentPanel.add(projectPurpose, gbc);

        JLabel technologiesUsed = new JLabel("Technologies: Java, Swing, MySQL");
        technologiesUsed.setFont(new Font("Tahoma", Font.PLAIN, 16));
        gbc.gridy = 5;
        contentPanel.add(technologiesUsed, gbc);

        JLabel contact = new JLabel("Contact: mdmirajulislammirajj@gmail.com");
        contact.setFont(new Font("Tahoma", Font.PLAIN, 16));
        gbc.gridy = 6;
        contentPanel.add(contact, gbc);

        JLabel githubRepo = new JLabel("GitHub: github.com/miraj/university-management-system");
        githubRepo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        gbc.gridy = 7;
        contentPanel.add(githubRepo, gbc);

        mainPanel.add(contentPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
