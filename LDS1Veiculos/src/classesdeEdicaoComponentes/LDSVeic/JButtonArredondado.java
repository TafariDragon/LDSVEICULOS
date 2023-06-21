package classesdeEdicaoComponentes.LDSVeic;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JButtonArredondado extends JButton{
	
	
	    private int raio;

	    public JButtonArredondado(String text, int raio) {
	        super(text);
	        this.raio = raio;
	        setContentAreaFilled(true);
	        setBorder(new EmptyBorder(5,0,5,0));
	        setFocusPainted(false);
	        setOpaque(false);
	    }
	    
	    
	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g.create();
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        Shape bordaArredondada = new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, raio, raio);
	        g2.setColor(getBackground());
	        g2.fill(bordaArredondada);

	        super.paintComponent(g2);
	        g2.dispose();
	        
	        
	        
	    }
	    
	   

}
