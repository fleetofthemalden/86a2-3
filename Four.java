public class Four extends Rowing_Shell {
	public Four(MyMap m, String n, int x, int y, int d, String r){
		new_Four(m, n, x, y, d, r);
	}
	public Four(MyMap m, int x, int y, int d){
		new_Four(m, "newFour", x, y, d, "port");
	}
		
	public Four(MyMap m, int x, int y, String r){
		new_Four(m, "newFour", x, y, 0, r);
	}
	
	public Four(MyMap m, int x, int y){
		new_Four(m, "newFour", x, y, 0, "port");
	}
	public Four(MyMap m, String n, int x, int y, int d){
		new_Four(m, n, x, y, d, "port");
	}
		
	public Four(MyMap m, String n, int x, int y, String r){
		new_Four(m, n, x, y, 0, r);
	}
	
	public Four(MyMap m, String n, int x, int y){
		new_Four(m, n, x, y, 0, "port");
	}
	public Four(MyMap m, String n){
		new_Four(m, n, 50, 50, 0, "port");
	}
	
	public Four(MyMap m){
		new_Four(m, "newFour", 50, 50, 0, "port");
	}
	private void new_Four(MyMap m, String n, int x, int y, int d, String r){
		new_shell(m, n, x, y, d, 40, 4, r, true);
		set_img("Four.png");
	}
	public static String classname = "Four";
}
		
		
	