import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MyButton extends JButton implements ActionListener {
    private String buttonText;
    private MyMap map;
    private Ship boat;
    private AddWidget wShip;
    public MyButton (String label, MyMap c) {
    	map = c;
    	buttonText = label;
    	setText(label);
    	addActionListener (this);
    	this.setEnabled(false);
    }
    public MyButton (String label, AddWidget wShip) {
    	buttonText = label;
    	    	setText(label);

    	this.wShip = wShip;
    	addActionListener (this);
    	this.setEnabled(true);
    }
     public void actionPerformed(ActionEvent e) {
     	if(buttonText == "Add"){
     		wShip.addBoat();
     		return;
     	}
     	if(boat == null){
     		return;
     	}
     	if(buttonText == "Delete"){
     		map.remove(boat);
     		this.setEnabled(false);
     		boat = null;
     	}
     	else if(buttonText == "Sail"){
     		map.move_ship(boat);
     	}
     	
     	
     }
     public void setBoat(Ship b){
     	this.setEnabled(true);
     	this.boat = b;
     }
}