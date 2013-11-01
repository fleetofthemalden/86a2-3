import java.lang.Math.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

public class Ship {
	int posx;
	int posy;
	int deg;
	int r;
	int rw;
	int length;
	String name;
	Image img;
	MyMap map;
	
	double bowx;
	double bowy;
	double sternxc;
	double sternyc;
	double sternx;
	double sterny;
	
	
	void new_ship(MyMap m, String n, int x, int y, int d, int len){
		this.map = m;
		this.name = n;
		this.posx = x;
		this.posy = y;
		this.deg = d;
		this.r = len/2;
		this.length = len;
		this.rw = 0;
		chart(0);
	}
	
	void resize(){
		int w = img.getWidth(map)/3;
        int h = img.getHeight(map)/3;
        length = h;
        r = length/2;
        rw = w/2;
        chart(0);
    }
    	
	private void chart(int heading){
		deg += heading;
		bowx = posx + r * Math.sin(deg);
		bowy = posy + r * Math.cos(deg);
		sternxc = posx - rw * Math.cos(deg);
		sternyc = posy - r * Math.cos(deg); 
		sternx = posx - r * Math.sin(deg);
		sterny = posy - r * Math.cos(deg);
	}
	public void sail(int distance){
		sail(distance, 0);
	}
	
	public void sail(int distance, int heading){
		chart(heading);
		posx += distance * Math.cos(deg);
		posy += distance * Math.sin(deg);
		chart(0);
	}
	
	public void draw(Graphics g){
		Graphics2D g2d=(Graphics2D)g;
    	double rad = Math.toRadians(deg);
        g2d.rotate(rad);
        int w = img.getWidth(map)/3;
        int h = img.getHeight(map)/3;
        double map_r = Math.sqrt(posx * posx + posy * posy);
        if(posx == 0){posx = 1;}
        double map_rad = Math.atan(posy/posx);
       	int map_x = (int)(map_r * Math.cos(map_rad - rad)) - rw;
       	int map_y = (int)(map_r * Math.sin(map_rad - rad)) - r;
   		g2d.drawImage(img, map_x, map_y, w, h, map);
        g2d.rotate((-1)*rad);
        g2d.drawString(name, posx+10, posy+10);
    }
    public String name(){return this.name;}
    public boolean isClicked(int mouse_x, int mouse_y){
    	if(mouse_x < (posx + rw) && mouse_x > (posx - rw) && mouse_y > (posy - r) && mouse_y < (posy + r)){
    		return true;
    	}
    	else{return false;}
    }
    public int heading(){return this.deg;}
    public int lattitude(){return this.posy;}
    public int longitude(){return this.posx;}
	
		
}

		
	