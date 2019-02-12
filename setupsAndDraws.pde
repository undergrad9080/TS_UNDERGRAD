public class setupsAndDraws {
  publicVehicles[] pbvFT = new publicVehicles[10];
  publicVehicles[] pbvFL = new publicVehicles[10];
  publicVehicles[] pbvFR = new publicVehicles[10];

  privateVehicles[] pvvFT = new privateVehicles[10];
  privateVehicles[] pvvFL = new privateVehicles[10];
  privateVehicles[] pvvFR = new privateVehicles[10];

  public void setupForPbv() {
  	for(int i = 0; i < pbvFT.length; i++) {
  		pbvFT[i] = new publicVehicles(int(random(485,520)), 0, 0, 5, 15, 30, int(random(1,4)), 1);
  	}

  	for(int i = 0; i < pbvFL.length; i++) {
  		pbvFL[i] = new publicVehicles(0, int(random(400, 410)), 5, 0, 30, 15, int(random(1,4)), 2);
  	}

  	for(int i = 0; i < pbvFR.length; i++) {
  		pbvFR[i] = new publicVehicles(width, int(random(370, 380)), 5, 0, 30, 15, int(random(1,4)), 3);
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
  		pvvFT[i] = new privateVehicles(int(random(485,520)), 0, 0, 5, 15, 30, int(random(1,4)), 1);
  	}

  	for(int i = 0; i < pvvFL.length; i++) {
  		pvvFL[i] = new privateVehicles(0, int(random(400, 410)), 5, 0, 30, 15, int(random(1,4)), 2);
  	}

  	for(int i = 0; i < pvvFR.length; i++) {
  		pvvFR[i] = new privateVehicles(width, int(random(370, 380)), 5, 0, 30, 15, int(random(1,4)), 3);
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
