public class Eight extends Rowing_Shell {
	public Eight(MyMap m, String n, int x, int y, int d, String r){
		new_Eight(m, n, x, y, d, r);
	}
	public Eight(MyMap m, int x, int y, int d){
		new_Eight(m, "newEight", x, y, d, "port");
	}
		
	public Eight(MyMap m, int x, int y, String r){
		new_Eight(m, "newEight", x, y, 0, r);
	}
	
	public Eight(MyMap m, int x, int y){
		new_Eight(m, "newEight", x, y, 0, "port");
	}
	public Eight(MyMap m, String n, int x, int y, int d){
		new_Eight(m, n, x, y, d, "port");
	}
		
	public Eight(MyMap m, String n, int x, int y, String r){
		new_Eight(m, n, x, y, 0, r);
	}
	
	public Eight(MyMap m, String n, int x, int y){
		new_Eight(m, n, x, y, 0, "port");
	}
	public Eight(MyMap m, String n){
		new_Eight(m, n, 50, 50, 0, "port");
	}
	
	public Eight(MyMap m){
		new_Eight(m, "newEight", 50, 50, 0, "port");
	}
	private void new_Eight(MyMap m, String n, int x, int y, int d, String r){
		new_shell(m, n, x, y, d, 60, 8, r, true);
		set_img();
	}
	public static String classname = "Eight";
}
		
		
	