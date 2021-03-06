package game;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerOne implements Paddle {
	
	
	int width;
	double height;
	double yVel;
	boolean Accel;
	boolean deAccel;
	
	PlayerOne() {
		
		Accel = false;
		deAccel = false;
		yVel = 0;
		height = 210;
		width = 20;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(width, (int)height, 20, 80);
		
	}

	@Override
	public void move() {
		if(Accel == true) {
			yVel -= 2;
		}
		
		else if(deAccel == true) {
			yVel += 2;
		}
		
		else if(!deAccel && !Accel) {
			yVel *= 0.94;
		}
		
		if(yVel >= 5) {
			yVel = 5;
		}
		
		else if(yVel <= -5) {
			yVel = -5;
		}
		
		height += yVel;
		
		if(height < 0) {
			height = 0;
		}
		
		if(height > 420) {
			height = 420;
		}
		
	}

	@Override
	public int getY() {
		
		return (int)height;
	}
	
	public void setAccel(boolean x) {
		Accel = x;
	}
	
	public void setDeAccel(boolean x) {
		deAccel = x;
	}

}
