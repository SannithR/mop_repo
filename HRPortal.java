import javax.swing.*;
import java.awt.*;

public class HRPortal extends JFrame {
    public HRPortal() {
        setTitle("HR Portal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        getContentPane().add(mainPanel);

        // Create top panel
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel titleLabel = new JLabel("HR Portal");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.add(titleLabel);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Create center panel
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add buttons to center panel
        JButton employeeButton = new JButton("Employees");
        JButton leaveButton = new JButton("Leave Management");
        JButton payrollButton = new JButton("Payroll");
        JButton reportsButton = new JButton("Reports");

        centerPanel.add(employeeButton);
        centerPanel.add(leaveButton);
        centerPanel.add(payrollButton);
        centerPanel.add(reportsButton);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Set visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HRPortal();
            }
        });
    }
}