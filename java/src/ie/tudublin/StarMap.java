package ie.tudublin;

import java.awt.*;
import javax.swing.*;

public class StarMap extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        g2.setFont(new Font("Arial", Font.PLAIN, 10));
        
        int canvasSize = 500;
        int gridSize = 11;
        int lineSpacing = canvasSize / (gridSize - 1);
        
        g2.setBackground(Color.BLACK);
        g2.clearRect(0, 0, canvasSize, canvasSize);
        
        for (int i = 0; i < gridSize; i++) {
            g2.drawLine(0, i * lineSpacing, canvasSize, i * lineSpacing);
            g2.drawLine(i * lineSpacing, 0, i * lineSpacing, canvasSize);
            g2.drawString(Integer.toString(i * (canvasSize / (gridSize - 1))), 0, i * lineSpacing);
            g2.drawString(Integer.toString(i * (canvasSize / (gridSize - 1))), i * lineSpacing, canvasSize);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new StarMap());
        frame.setVisible(true);
    }
}
