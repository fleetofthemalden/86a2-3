
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
import java.util.*;

public class ShipControls extends JPanel {
	private ArrayList<MyButton> buttons;
	private ArrayList<MyScrollBar> bars;
	
	private Ship thisBoat;
	private MyMap map;
	private JLabel shipName;
	private JLabel longitude;
	private JLabel lattitude;
	
	public ShipControls(){
		super();
		buttons = new ArrayList<MyButton>();
		bars = new ArrayList<MyScrollBar>();
		thisBoat = null;
		map = null;
		this.setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		defaultControls();
		this.setBorder (new LineBorder(Color.YELLOW, 1));
	}
	public ShipControls(MyMap m){
		super();
		buttons = new ArrayList<MyButton>();
		bars = new ArrayList<MyScrollBar>();
		thisBoat = null;
		this.map = m;
		this.setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		defaultControls();
		this.setBorder (new LineBorder(Color.ORANGE, 1));
	}
	public void add_w(MyButton butt){
		super.add(butt);
		buttons.add(butt);
	}
	public void add_w(MyScrollBar sbarro){
		super.add(sbarro);
		bars.add(sbarro);
	}
	public void setBoat(Ship s){
		thisBoat = s;
		shipName.setText("Ship Name: " + s.name());
		for(int i=0; i<buttons.size(); i++){
			MyButton b = (MyButton)buttons.get(i);
			b.setBoat(s);
		}
		for(int i=0; i<bars.size(); i++){
			MyScrollBar b = (MyScrollBar)bars.get(i);
			b.setBoat(s);
		}
	}
	public void unsetBoat(){
		this.setBoat(null);
	}
	private void defaultControls(){
		shipName = new JLabel("Ship Name: no_boat_selected");
		this.add(shipName);
		this.add(new JLabel("_________"));
		JLabel temp = new JLabel("Heading");
		MyScrollBar deg_b = new MyScrollBar(temp);
		this.add(temp);
		this.add_w(deg_b);
		this.add(new JLabel("_________"));
		temp = new JLabel("BoatSpeed");
		MyScrollBar speed_b = new MyScrollBar(temp, this.map);
		this.add(temp);
		this.add_w(speed_b);
		MyButton sailButt = new MyButton("Sail", this.map);
		this.add_w(sailButt);
		this.add(new JLabel("_________"));
		MyButton delButt = new MyButton("Delete", this.map);
		this.add_w(delButt);
		AddWidget w = new AddWidget(map);
		this.add(w);
			
	}
	
}