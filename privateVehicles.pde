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
