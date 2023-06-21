package classesdeEdicaoComponentes.LDSVeic;

import java.awt.*;

import javax.swing.JTextField;

public class PlaceHolderJTextField extends JTextField {
	
	
	 private String placeholder;

	    public PlaceHolderJTextField(String placeholder) {
	        this.placeholder = placeholder;
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        // Verifica se o campo de texto está vazio
	        if (getText().isEmpty()) {
	            Graphics2D g2 = (Graphics2D) g.create();
	            g2.setColor(Color.GRAY);

	            // Configura a fonte do texto do placeholder
	            FontMetrics fm = g2.getFontMetrics(getFont());
	            int x = getInsets().left;
	            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
	            g2.drawString(placeholder, x, y);

	            g2.dispose();
	        }
	    }

}
