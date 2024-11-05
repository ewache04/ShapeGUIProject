import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeGUI extends JFrame {
    private JPanel canvasPanel;
    private Shape currentShape;
    private JTextField shapeInputField;

    public ShapeGUI() {
        setTitle("Shape Drawing");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Canvas for drawing a single shape
        canvasPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (currentShape != null) {
                    currentShape.draw(g);
                }
            }
        };

        canvasPanel.setBackground(Color.WHITE);
        add(canvasPanel, BorderLayout.CENTER);

        // Control panel with input field and buttons
        JPanel controlPanel = new JPanel();
        shapeInputField = new JTextField(10);  // Input field for shape type
        JButton addButton = new JButton("Add Shape");
        JButton clearButton = new JButton("Clear Window");
        JButton quitButton = new JButton("Quit");

        // Adding help text
        JLabel helpLabel = new JLabel("Enter shape (Circle, Rectangle, Triangle) and click 'Add Shape'");

        // Add action listeners to buttons
        addButton.addActionListener(new ShapeButtonListener());
        clearButton.addActionListener(e -> {
            currentShape = null;
            canvasPanel.repaint();
        });
        quitButton.addActionListener(e -> System.exit(0));

        // Add components to control panel
        controlPanel.add(helpLabel);
        controlPanel.add(shapeInputField);
        controlPanel.add(addButton);
        controlPanel.add(clearButton);
        controlPanel.add(quitButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    private class ShapeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String shapeType = shapeInputField.getText().trim();
            Color color = new Color((int) (Math.random() * 0x1000000));

            // Calculate the center position of the canvas
            int centerX = canvasPanel.getWidth() / 2;
            int centerY = canvasPanel.getHeight() / 2;

            switch (shapeType.toLowerCase()) {
                case "circle" -> currentShape = new Circle(centerX, centerY, color, 50);
                case "rectangle" -> currentShape = new Rectangle(centerX, centerY, color, 100, 50);
                case "triangle" -> currentShape = new Triangle(centerX, centerY - 30, color, 60, 60);  // Adjusted y for centering
                default -> JOptionPane.showMessageDialog(ShapeGUI.this,
                        "Invalid shape. Enter 'Circle', 'Rectangle', or 'Triangle'.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

            canvasPanel.repaint();
            shapeInputField.setText("");  // Clear the input field
        }
    }
}