//Dixon Minnick
//Dixon.Minnick@Tufts.edu

//Main Program
//  creates all elements, and renders them in a suitable layout

import java.awt.Container;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private MyMap harbor_ctrl;

    public static void main (String [] args) {
		new Main ();
    }
    
    public Main () {
	// Window setup
	super("Assignment 3");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize (800, 800);
	Container content = getContentPane();
	content.setLayout (new BorderLayout());
	
	harbor_ctrl = new MyMap();
	ShipControls controls = new ShipControls(harbor_ctrl);
	harbor_ctrl.setControls(controls);
	
	/*
	Pair mv2 = new Pair(harbor_ctrl, "mv2", 20, 20);
	Four mv4 = new Four(harbor_ctrl, "mv4", 150, 150, -45);
	Pair m2v2 = new Pair(harbor_ctrl, "m2v2", 350, 350, -45);
	Yacht y = new Yacht(harbor_ctrl);
	
	harbor_ctrl.add_ship(y);
	harbor_ctrl.add_ship(mv4);
	harbor_ctrl.add_ship(mv2);
	*/
	
	content.add (controls, BorderLayout.EAST);
	content.add (harbor_ctrl, BorderLayout.CENTER);
	
	// Show the window
	setVisible (true);
	}
}