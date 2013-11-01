//Dixon Minnick
//Dixon.Minnick@Tufts.edu

//Canvas class
//  used to draw different images on the canvas

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;


public class MyMap extends JComponent implements MouseListener {
    private ArrayList<Ship> ships;
    private int num_ships;
    private int scale;
    private int tick;
    private ShipControls controls;
    private int lattitude = 0;
    private int longitude = 0;

    public MyMap () {
		ships = new ArrayList<Ship>();
		num_ships = 0;
		tick = 1;
		addMouseListener (this);
		this.setBorder (new LineBorder(Color.BLUE, 2));
    }

    public void paintComponent (Graphics g) {
		for(int i=0; i<num_ships; i++){
			paintShip(i, g);
		}
    }
    
    private void paintShip (int i, Graphics g){
    	Ship s = (Ship)ships.get(i);
    	s.draw(g);   
    }
    
    private void move_ship(int i, int distance){
    	Ship s = (Ship)ships.get(i);
    	s.sail(0, distance);
    }
    
    private void move_ship(Ship s, int distance){
    	Ship ss = (Ship)ships.get(ships.indexOf(s));
    	ss.sail(0, distance);
    }
    
    public void move_ship(Ship s){
    	move_ship(s, tick);
    }
    
    public void move_ships(){
    	for(int i=0; i<num_ships; i++){
    		move_ship(i, tick);
    	}
    }
    
    public void setSpeed(int i){
    	tick = i;
    }
    
    public void add_ship(Ship s){
    	ships.add(s);
    	num_ships = ships.size();
    	this.repaint();
    }
    
	public void remove(Ship s){
		ships.remove(s);
		num_ships = ships.size();
		this.repaint();
	}
	public void setControls(ShipControls c){
		this.controls = c;
	}
	public int getGeoLong(){return longitude;}
	public int getGeoLat(){return lattitude;}
	

    /** MouseListener callbacks */
    public void mousePressed (MouseEvent event) {	
		//System.out.println ("Mouse down at " + event.getPoint().x + ", " + event.getPoint().y);
		int x = event.getPoint().x;
		int y = event.getPoint().y;
		longitude = x;
		lattitude = y;
		for(int i=0; i<num_ships; i++){
			Ship s = ships.get(i);
			if(s.isClicked(x, y)){
				controls.setBoat(s);
				return;
			}
		}
    }
    public void mouseClicked (MouseEvent event) {}
    public void mouseReleased (MouseEvent event) {}
    public void mouseEntered (MouseEvent event) {}
    public void mouseExited (MouseEvent event) {}
}
