package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setTitle("University Management System");
        setSize(1540, 820);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third diu.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setLayout(new BorderLayout());
        add(background);

        JMenuBar mb = new JMenuBar();
        mb.setBackground(new Color(45, 52, 54));
        mb.setPreferredSize(new Dimension(0, 50));
        addMenu("New Information", mb);
        addMenu("View Details", mb);
        addMenu("Apply Leave", mb);
        addMenu("Leave Details", mb);
        addMenu("Examination", mb); // "Examination" menu
        addMenu("Update Details", mb);
        addMenu("Fee Details", mb);
        addMenu("About", mb);
        addMenu("Exit", mb);

        JButton applyButton = new JButton("APPLY NOW");
        applyButton.setBackground(new Color(255, 87, 34));
        applyButton.setForeground(Color.WHITE);
        applyButton.setFont(new Font("Arial", Font.BOLD, 16));
        applyButton.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
        applyButton.setFocusPainted(false);
        applyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        applyButton.addActionListener(this);

        mb.add(Box.createHorizontalGlue());
        mb.add(applyButton);
        setJMenuBar(mb);

        JPanel overlayPanel = new JPanel();
        overlayPanel.setBackground(new Color(255, 255, 255, 210));
        overlayPanel.setLayout(new GridBagLayout());
        overlayPanel.setPreferredSize(new Dimension(0, 100));

        JLabel overlayText = new JLabel("<html><div style='text-align: center;'>"
                + "<h1 style='color:#2d3436; font-size:36px; margin: 0;'>Be a Hawkeye</h1>"
                + "<p style='color:#636e72; font-size:16px;'>Find your place on Campus</p></div></html>");
        overlayText.setFont(new Font("Arial", Font.PLAIN, 20));

        overlayPanel.add(overlayText);
        background.add(overlayPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addMenu(String title, JMenuBar mb) {
        JMenu menu = new JMenu(title);
        menu.setFont(new Font("Arial", Font.PLAIN, 16));
        menu.setForeground(Color.WHITE);
        mb.add(menu);

        switch (title) {
            case "New Information":
                menu.add(createMenuItem("New Faculty Information"));
                menu.add(createMenuItem("New Student Information"));
                break;
            case "View Details":
                menu.add(createMenuItem("View Faculty Details"));
                menu.add(createMenuItem("View Student Details"));
                break;
            case "Apply Leave":
                menu.add(createMenuItem("Faculty Leave"));
                menu.add(createMenuItem("Student Leave"));
                break;
            case "Leave Details":
                menu.add(createMenuItem("Faculty Leave Details"));
                menu.add(createMenuItem("Student Leave Details"));
                break;
            case "Examination":
                menu.add(createMenuItem("Examination Results")); 
                menu.add(createMenuItem("Enter Marks")); 
                break;
            case "Update Details":
                menu.add(createMenuItem("Update Faculty Details"));
                menu.add(createMenuItem("Update Student Details"));
                break;
            case "Fee Details":
                menu.add(createMenuItem("Fee Structure")); 
                break;
            case "About":
                menu.add(createMenuItem("About"));
                break;
            case "Exit":
                menu.add(createMenuItem("Exit"));
                break;
        }
    }

    private JMenuItem createMenuItem(String itemName) {
        JMenuItem menuItem = new JMenuItem(itemName);
        menuItem.setFont(new Font("Arial", Font.PLAIN, 14));
        menuItem.setBackground(Color.WHITE);
        menuItem.setForeground(Color.BLACK);
        menuItem.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        menuItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        menuItem.addActionListener(this);
        return menuItem;
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("APPLY NOW")) {
            JOptionPane.showMessageDialog(this, "Redirecting to application page...");
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Examination Results")) { 
            new ExaminationDetails();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Fee Structure")) { 
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();  // Open the About window
        } else if (msg.equals("Exit")) {
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, msg + " selected.");
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
