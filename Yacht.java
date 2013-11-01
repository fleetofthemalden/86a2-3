import java.awt.Image;
import java.awt.Toolkit;


public class Yacht extends Ship {
	private static Image image = Toolkit.getDefaultToolkit().getImage("yacht.png");
	private static int yacht_length = 300;
	
	private void new_Yacht(MyMap m, String n, int x, int y, int d){
		new_ship(m, n, x, y, d, yacht_length);
		img = image;
	}
	
	public Yacht(MyMap m, String n, int x, int y, int d){
		new_Yacht(m, n, x, y, d);
	}
	public Yacht(MyMap m, String n, int x, int y){
		new_Yacht(m, n, x, y, 0);
	}
	public Yacht(MyMap m, int x, int y, int d){
		new_Yacht(m, "newYacht", x, y, d);
	}
	public Yacht(MyMap m, int x, int y){
		new_Yacht(m, "newYacht", x, y, 0);
	}
	public Yacht(MyMap m, String n){
		new_Yacht(m, n, 50, 50, 0);
	}
	public Yacht(MyMap m){
		new_Yacht(m, "newYacht", 50, 50, 0);
	}
	public static String classname = "Yacht";
}