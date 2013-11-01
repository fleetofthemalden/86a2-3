import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.Math.*;

public class MyScrollBar extends JScrollBar implements AdjustmentListener {
    private JLabel label;
    private String s;
    private int val;
    private int valChange;
    private Ship boat;
    private MyMap map;
    
    public MyScrollBar (JLabel label) {
    	setOrientation (HORIZONTAL);
    	this.label = label;
    	s = label.getText();
    	addAdjustmentListener (this);
    	boat = null;
    	map = null;
    }
    
    public MyScrollBar (JLabel label, Ship s) {
    	setOrientation (HORIZONTAL);
    	this.label = label;
    	this.s = label.getText();
    	addAdjustmentListener (this);
    	boat = s;
    	map = null;
    }
    
    public MyScrollBar (JLabel label, MyMap map) {
    	setOrientation (HORIZONTAL);
    	this.label = label;
    	s = label.getText();
    	addAdjustmentListener (this);
    	boat = null;
    	this.map = map;
    }

    public void adjustmentValueChanged (AdjustmentEvent event) {
		//System.out.println ("Scrollbar: " + getValue());
		int temp = 4 * getValue() - 180;
		valChange = temp - val;
		val = temp;
		if(boat != null){
			boat.sail(0, valChange);
		}
		if(map != null){
			map.setSpeed(getValue());
			label.setText(s + ": " + getValue());
		}
		else{
			label.setText(s + ": " + val);
		}
    }
    public int val(){return val;}
    public void setBoat(Ship s){
    	this.boat = s;
    	this.setValue(s.heading() / 4);
    }
}