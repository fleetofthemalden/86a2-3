public class Pair extends Rowing_Shell {
	public Pair(MyMap m, String n, int x, int y, int d, String r){
		new_Pair(m, n, x, y, d, r);
	}
	public Pair(MyMap m, int x, int y, int d){
		new_Pair(m, "newPair", x, y, d, "port");
	}
		
	public Pair(MyMap m, int x, int y, String r){
		new_Pair(m, "newPair", x, y, 0, r);
	}
	
	public Pair(MyMap m, int x, int y){
		new_Pair(m, "newPair", x, y, 0, "port");
	}
	public Pair(MyMap m, String n, int x, int y, int d){
		new_Pair(m, n, x, y, d, "port");
	}
		
	public Pair(MyMap m, String n, int x, int y, String r){
		new_Pair(m, n, x, y, 0, r);
	}
	
	public Pair(MyMap m, String n, int x, int y){
		new_Pair(m, n, x, y, 0, "port");
	}
	public Pair(MyMap m, String n){
		new_Pair(m, n, 50, 50, 0, "port");
	}
	
	public Pair(MyMap m){
		new_Pair(m, "newPair", 50, 50, 0, "port");
	}
	private void new_Pair(MyMap m, String n, int x, int y, int d, String r){
		new_shell(m, n, x, y, d, 26, 2, r, false);
		set_img("Pair.png");
	}
	public static String classname = "Pair";
}
		
		
	