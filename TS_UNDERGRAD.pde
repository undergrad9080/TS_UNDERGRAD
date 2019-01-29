road rd = new road();
setupsAndDraws sd = new setupsAndDraws();

void setup() {
	size(1000, 750);
	sd.setupForPbv();
	sd.setupForPvv();
}

void draw() {
	background(255);
	rd.roadDisplay();
	sd.drawForPbv();
	sd.drawForPvv();
}

// double distance = Math.sqrt(Math.pow((x - px), 2) + Math.pow((y - py), 2));
