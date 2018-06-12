package com.oozinoz.ui;


import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;


public class UI {
	protected Font font = new Font("Book Antiqua", Font.PLAIN, 18);

	public static final int STANDARD_PAD = 10;

	public static final UI NORMAL = new UI();

	public Font getFont() {
		return font;
	}

	public int getPad() {
		return STANDARD_PAD;
	}

    public JButton createButton() {
        JButton button = new JButton();
        button.setSize(128, 128);
        button.setFont(getFont());
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        return button;
    }

	public JButton createButtonOk() {
		JButton button = createButton();
		button.setIcon(getIcon("images/rocket-large.gif"));
		button.setText("Ok!");
		return button;
	}

	public JButton createButtonCancel() {
		JButton button = createButton();
		button.setIcon(getIcon("images/rocket-large-down.gif"));
		button.setText("Cancel!");
		return button;
	}

	public JPanel createPaddedPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(
            BorderFactory.createEmptyBorder(getPad(), getPad(), getPad(), getPad()));
		return panel;
	}

	public JPanel createPaddedPanel(Component c) {
		JPanel panel = createPaddedPanel();
		panel.add(c);
		return panel;
	}
    
    public static Icon getIcon(String imageName) {
        return new ImageIcon(imageName);
    }

    public JList createList(Object[] contents) {
        JList result = new JList(contents);
        result.setFont(getFont()); 
        result.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return result;
    }
    
    public TitledBorder createTitledBorder(String title) {
        TitledBorder border = BorderFactory.createTitledBorder(
            BorderFactory.createBevelBorder(BevelBorder.RAISED), 
            title,
            TitledBorder.LEFT, 
            TitledBorder.TOP);
        border.setTitleColor(Color.black);
        border.setTitleFont(getFont());
        return border;
    }
    
    public JPanel createTitledPanel(String title, JPanel in) {
        JPanel out = new JPanel();
        out.add(in);
        out.setBorder(createTitledBorder(title));
        return out;
    }
}
