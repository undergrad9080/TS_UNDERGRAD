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
