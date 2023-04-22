
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emanuel
 */
public class JPanelGradientGris extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int With = getWidth();
            int Height = getHeight();
            Color color1 = new Color(192, 192, 192);
            Color color2 = new Color(245, 245, 245);
            GradientPaint gp = new GradientPaint(0, 0, color2, 180, Height, color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, With, Height);
        }
}
