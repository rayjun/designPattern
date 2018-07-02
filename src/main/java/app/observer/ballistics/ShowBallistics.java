package app.observer.ballistics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.oozinoz.ballistics.Ballistics;
import com.oozinoz.ui.SwingFacade;
import com.oozinoz.utility.Format;

public class ShowBallistics implements ChangeListener{

    private JSlider slider;



    public static void main(String[] args) {
        SwingFacade.launch(new ShowBallistics().mainPanel(), "Effects of Tpeak");
    }


    protected BallisticsPanel burnPanel;

    protected BallisticsPanel thrustPanel;

    protected JLabel valueLabel;

    protected double sliderMax;
    protected double sliderMin;

    public void stateChanged(ChangeEvent e) {
        double val = slider.getValue();
        double tp = (val - sliderMin) /(sliderMax = sliderMin);

        burnPanel.setTPeak(tp);
        thrustPanel.setTPeak(tp);
        valueJLabel().setText(Format.formatToNPlaces(tp,2));

    }

    protected JPanel curvPanel() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,2));
        p.add(SwingFacade.createTitledPanel("Burn Panel", burnPanel()));
        p.add(SwingFacade.createTitledPanel("Thrust", thrustPanel()));
        
        return p;
    }

    protected JPanel mainPanel() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(curvPanel(), "Center");
        p.add(sliderBox(), "South");

        return p;
    }


    protected Box sliderBox() {
        Box b = Box.createHorizontalBox();
        JLabel label = new JLabel("tPeak");
        label.setFont(SwingFacade.getStandardFont());
        label.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        label.setBackground(Color.black);
        b.add(label);
        b.add(valueJLabel());
        b.add(slider());
        return b;
    }

    protected JLabel valueJLabel() {
        if(valueLabel == null) {
            valueLabel = new JLabel();
            valueLabel.setFont(SwingFacade.getStandardFont());
            valueLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
            valueLabel.setBackground(Color.black);
        }

        return valueLabel;
    }

    protected BallisticsPanel burnPanel() {
        if(burnPanel == null) {
            burnPanel = new BallisticsPanel(Ballistics.rate());
            burnPanel.setPreferredSize(new Dimension(300,200));
        }

        return burnPanel;
    }

    protected BallisticsPanel thrustPanel() {
        if(thrustPanel == null) {
            thrustPanel = new BallisticsPanel(Ballistics.thrust());
            thrustPanel.setPreferredSize(new Dimension(300, 200));
        }

        return thrustPanel;
    }

    public JSlider slider() {
        if(slider == null) {
            slider = new JSlider();
            sliderMax = slider.getMaximum();
            sliderMin = slider.getMinimum();
            slider.addChangeListener(this);
            slider.setValue(slider.getMaximum());
        }

        return slider;
    }
    
}