import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyList extends JList<String> implements ListSelectionListener {
    public MyList (MyMap m) {
    	map = m;
		String[] items = {"Eight", "Four", "Pair", "Yacht"};
		setListData (items);
		setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
		addListSelectionListener (this);
    }
    private MyMap map;

    public void valueChanged (ListSelectionEvent e) {
		if (! e.getValueIsAdjusting()) {
	    	//System.out.println ("List: " + getSelectedValue());
	    	
		}
    }
}