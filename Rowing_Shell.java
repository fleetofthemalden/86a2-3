import java.awt.Image;
import java.awt.Toolkit;


public class Rowing_Shell extends Ship {
	
	
	private boolean coxed;
	private String[] seats;
	private int rowers;
	private String rigging;
	

	private static String default_boat = "Eight.png";
	private static Image shell_image = Toolkit.getDefaultToolkit().getImage(default_boat);
	
	void new_shell(MyMap m, String n, int x, int y, int d, int len, int rwrs, String rig, boolean cox){
		new_ship(m, n, x, y, d, len);
		rowers = rwrs;
		rigging = rig;
		coxed = cox;
		rig();
	}
	
	void set_img(){
		img = shell_image;
		//System.out.println ("set img to " + boat);
		resize();
	}
	
	void set_img(String b){
		img = Toolkit.getDefaultToolkit().getImage(b);
		resize();
	}
	
	private void rig () {
		if(rigging != "scull"){
			rig_sweep();
		}
		else{
			rig_scull();
		}
	}
		
	public void rerig (){
		if(rigging != "scull"){
			rerig_sweep();
		}
	}
	
	private void rig_sweep () {
		seats = new String[rowers];
		for(int i=rowers; i>0; i--){
			if(i%2 == 0){
				seats[i-1] = "port";
			}
			else{
				seats[i-1] = "starboard";
			}
		}
		rigging = "port";
	}
	
	private void rerig_sweep (){
		for(int i=rowers; i>0; i--){
			if(seats[i-1] == "starboard"){
				seats[i-1] = "port";
			}
			else{
				seats[i-1] = "starboard";
			}
		}
		if(rigging == "port"){
			rigging = "starboard";
		}
		else{
			rigging = "port";
		}
	}
	public void rerig(String rig){
		if(rig != rigging){
			if(rig == "bucket"){
				rowers = rowers/2;
				rerig();
				rowers = rowers*2;
				rigging = "bucket";
			}
			else{
				rerig();
			}
		}
	}
	private void rig_scull(){
		seats = new String[rowers];
		for(int i=rowers; i>0; i--){
			seats[i-1] = "scull";
		}
		rigging = "scull";
	}
	
	public void draw_ship(){
		//draw_shell();
	}
	/*
	void draw_shell(){
		draw_bow();
		for(int i=0; i<rowers; i++){
			draw_oar(i);
		}
		draw_cox();
		draw_stern();
	}
	
	
	
	void draw_oar(int seat){
		double oarx = bowx - (seat*5 - 8)*Math.cin(r);
		double oary = bowy - (seat*5 - 8)*Math.sin(r);
		if(seats[seat] == "starboard"){
			draw_starboard_oar(oarx,oary);
		}
		else if(seats[seat] == "port"){
			draw_port_oar(oarx,oary);
		}
		else{
			draw_scull_oar(oarx,oary);
		}
	}
	*/
}
		
		
	