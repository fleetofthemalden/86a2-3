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

public class AddWidget extends JPanel{
	private myTextField name;
	private MyScrollBar deg_b;
	private MyButton add;
	private MyMap map;
	private MyList b_list;
	private int x;
	private int y;
	private boolean inside;
	private boolean adding;
	
	public AddWidget(MyMap m){
		JLabel title = new JLabel("Add New Ship");
		this.map = m;
		x = 0;
		y = 0;
		b_list = new MyList(m);
		name = new myTextField();
		JLabel temp = new JLabel("Heading");
		deg_b = new MyScrollBar(temp);
		add = new MyButton("Add", this);
		this.setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(title);
		this.add(b_list);
		this.add(name);
		this.add(temp);
		this.add(deg_b);
		this.add(add);
		this.setBorder (new LineBorder(Color.RED, 1));
		inside = false;
		adding = false;
		//this.setEnabled(false);
	}
    public void addBoat(){
    	String temp = b_list.getSelectedValue();
    	x = map.getGeoLong();
    	y = map.getGeoLat();
    	
    	if(temp == "Eight"){
    		Ship s = new Eight(map, name.getText(), x, y, deg_b.val());
    		map.add_ship(s);
    	}
    	else if(temp == "Pair"){
    		Ship s = new Pair(map, name.getText(), x, y, deg_b.val());
    		map.add_ship(s);
    	}
    	else if(temp == "Four"){
    		Ship s = new Four(map, name.getText(), x, y, deg_b.val());
    		map.add_ship(s);
    	}
    	else if(temp == "Yacht"){
    		Ship s = new Yacht(map, name.getText(), x, y, deg_b.val());
    		map.add_ship(s);
    	}
    	else{return;}
    	adding = false;
    }
}