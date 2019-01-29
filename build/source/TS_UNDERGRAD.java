import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class TS_UNDERGRAD extends PApplet {

road rd = new road();
setupsAndDraws sd = new setupsAndDraws();

public void setup() {
	
	sd.setupForPbv();
	sd.setupForPvv();
}

public void draw() {
	background(255);
	rd.roadDisplay();
	sd.drawForPbv();
	sd.drawForPvv();
}

// double distance = Math.sqrt(Math.pow((x - px), 2) + Math.pow((y - py), 2));
public class privateVehicles {
  private int px, py, dx, dy, s1, s2, g, des, orig;

  public privateVehicles(int px, int py, int dx, int dy, int s1, int s2, int des, int orig) {
    this.px = px;
    this.py = py;
    this.dx = dx;
    this.dy = dy;
    this.s1 = s1;
    this.s2 = s2;
    this.des = des;
    this.orig = orig;
  }

  public void displayFromTop(){
    fill(0, 255, 0);
    rect(this.px, this.py, this.s1, this.s2);
    if(des == 1) {
      if(py >= 370) {
        this.s1 = 30;
        this.s2 = 15;
        moveLeft();
      }
    } else if(des == 2) {
      if(py >= 405) {
        this.s1 = 30;
        this.s2 = 15;
        moveRight();
      }
    }
  }

  public void displayFromLeft() {
    fill(0, 255, 0);
    rect(this.px, this.py, this.s1, this.s2);
    if(des == 3) {
      if(px >= 500) {
        this.s1 = 15;
        this.s2 = 30;
        dx = 0;
        dy = 5;
        py += dy;
      }
    }
  }

  public void displayFromRight() {
    fill(0, 255, 0);
    rect(this.px, this.py, this.s1, this.s2);
    if(des == 3) {
      if(px >= 500) {
        this.s1 = 15;
        this.s2 = 30;
        dx = 0;
        dy = 5;
        py += dy;
      }
    }
  }

  public void moveForward(){
    if(orig == 1) {
      py += dy;
    } else if(orig == 2) {
      px += dx;
    } else if(orig == 3) {
      px -= dx;
    }
  }

  public void moveRight() {
    dx = 5;
    dy = 0;
    px += dx;
  }

  public void moveLeft() {
    dx = 5;
    dy = 0;
    px -= dx;
  }

  public void moveBreak() {
    if(py >= 330){
      dy = 0;
    }
  }

  // public boolean collision(int x, int y) {
  //   double distance = Math.sqrt(Math.pow((x - px), 2) + Math.pow((y - py), 2));
  //   if(distance < (s1*s2)/2) {
  //     return true;
  //   }
  //   return false;
  // }
}
public class publicVehicles {
  private int px, py, dx, dy, s1, s2, g, des, orig;

  public publicVehicles(int px, int py, int dx, int dy, int s1, int s2, int des, int orig) {
    this.px = px;
    this.py = py;
    this.dx = dx;
    this.dy = dy;
    this.s1 = s1;
    this.s2 = s2;
    this.des = des;
    this.orig = orig;
  }

  public void displayFromTop(){
    fill(255, 0, 0);
    rect(this.px, this.py, this.s1, this.s2);
    if(des == 1) {
      if(py >= 370) {
        this.s1 = 30;
        this.s2 = 15;
        moveLeft();
      }
    } else if(des == 2) {
      if(py >= 405) {
        this.s1 = 30;
        this.s2 = 15;
        moveRight();
      }
    }
  }

  public void displayFromLeft() {
    fill(255, 0, 0);
    rect(this.px, this.py, this.s1, this.s2);
    if(des == 3) {
      if(px >= 500) {
        this.s1 = 15;
        this.s2 = 30;
        dx = 0;
        dy = 5;
        py += dy;
      }
    }
  }

  public void displayFromRight() {
    fill(255, 0, 0);
    rect(this.px, this.py, this.s1, this.s2);
    if(des == 3) {
      if(px >= 500) {
        this.s1 = 15;
        this.s2 = 30;
        dx = 0;
        dy = 5;
        py += dy;
      }
    }
  }

  public void moveForward(){
    if(orig == 1) {
      py += dy;
    } else if(orig == 2) {
      px += dx;
    } else if(orig == 3) {
      px -= dx;
    }
  }

  public void moveRight() {
    dx = 5;
    dy = 0;
    px += dx;
  }

  public void moveLeft() {
    dx = 5;
    dy = 0;
    px -= dx;
  }

  public void moveBreak() {
    if(py >= 330){
      dy = 0;
    }
  }

  // public boolean collision(int x, int y) {
  //   double distance = Math.sqrt(Math.pow((x - px), 2) + Math.pow((y - py), 2));
  //   if(distance < (s1*s2)/2) {
  //     return true;
  //   }
  //   return false;
  // }
}
public class road {
	public void roadDisplay() {
  	fill(0);
    beginShape();
    vertex(475,0);
    vertex(475,365);
    vertex(0,365);
    vertex(0,425);
    vertex(475,425);
    vertex(475,height);
    vertex(535,height);
    vertex(535,425);
    vertex(width,425);
    vertex(width,365);
    vertex(535,365);
    vertex(535,0);
    endShape(CLOSE);
  }
}
public class setupsAndDraws {
  publicVehicles[] pbvFT = new publicVehicles[10];
  publicVehicles[] pbvFL = new publicVehicles[10];
  publicVehicles[] pbvFR = new publicVehicles[10];

  privateVehicles[] pvvFT = new privateVehicles[10];
  privateVehicles[] pvvFL = new privateVehicles[10];
  privateVehicles[] pvvFR = new privateVehicles[10];

  public void setupForPbv() {
  	for(int i = 0; i < pbvFT.length; i++) {
  		pbvFT[i] = new publicVehicles(PApplet.parseInt(random(485,520)), 0, 0, 5, 15, 30, PApplet.parseInt(random(1,4)), 1);
  	}

  	for(int i = 0; i < pbvFL.length; i++) {
  		pbvFL[i] = new publicVehicles(0, PApplet.parseInt(random(400, 410)), 5, 0, 30, 15, PApplet.parseInt(random(1,4)), 2);
  	}

  	for(int i = 0; i < pbvFR.length; i++) {
  		pbvFR[i] = new publicVehicles(width, PApplet.parseInt(random(370, 380)), 5, 0, 30, 15, PApplet.parseInt(random(1,4)), 3);
  	}
  }

  public void drawForPbv() {
  	for(int i = 0; i < pbvFT.length; i++) {
  		pbvFT[i].displayFromTop();
  		pbvFT[i].moveForward();
  	}

  	for(int i = 0; i < pbvFL.length; i++) {
  		pbvFL[i].displayFromLeft();
  		pbvFL[i].moveForward();
  	}

  	for(int i = 0; i < pbvFR.length; i++) {
  		pbvFR[i].displayFromRight();
  		pbvFR[i].moveForward();
  	}
  }

  public void setupForPvv() {
  	for(int i = 0; i < pvvFT.length; i++) {
  		pvvFT[i] = new privateVehicles(PApplet.parseInt(random(485,520)), 0, 0, 5, 15, 30, PApplet.parseInt(random(1,4)), 1);
  	}

  	for(int i = 0; i < pvvFL.length; i++) {
  		pvvFL[i] = new privateVehicles(0, PApplet.parseInt(random(400, 410)), 5, 0, 30, 15, PApplet.parseInt(random(1,4)), 2);
  	}

  	for(int i = 0; i < pvvFR.length; i++) {
  		pvvFR[i] = new privateVehicles(width, PApplet.parseInt(random(370, 380)), 5, 0, 30, 15, PApplet.parseInt(random(1,4)), 3);
  	}
  }

  public void drawForPvv() {
  	for(int i = 0; i < pvvFT.length; i++) {
  		pvvFT[i].displayFromTop();
  		pvvFT[i].moveForward();
  	}

  	for(int i = 0; i < pvvFL.length; i++) {
  		pvvFL[i].displayFromLeft();
  		pvvFL[i].moveForward();
  	}

  	for(int i = 0; i < pvvFR.length; i++) {
  		pvvFR[i].displayFromRight();
  		pvvFR[i].moveForward();
  	}
  }
}
  public void settings() { 	size(1000, 750); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "TS_UNDERGRAD" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
