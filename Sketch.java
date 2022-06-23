import processing.core.PApplet;

public class Sketch extends PApplet {
	
	int counter = 2;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  //ground
  fill(0, 128, 0);
  rect(0, 250, 400, 250);
  
  //calling methods  
  house(25, 130);
  house(220, 150);

  ball(200, 200, 40);
  ball(25, 350, 30);
  ball(350, 350, 50);
  
  if(counter == 2){
  System.out.println(middle(400));
  counter--;
  }
}

// define other methods down here.
  
/**
 * Change the location of the house
 * 
 * @param houseX X location of the house
 * @param houseY Y location of the house
 */
  private void house(float houseX, float houseY){
  fill(200, 155, 125);
  rect(houseX, houseY, 150, 150); 

  fill(125, 65, 45);
  rect(houseX + 10, houseY - 60, 25, 60);
  
  fill(125, 65, 45);
  triangle(houseX, houseY, houseX + 150, houseY, houseX + 75, houseY - 70);

  fill(255, 197, 143);
  rect(houseX + 75, houseY + 60, 60, 90);

  fill(255, 255, 255);
  rect(houseX + 10, houseY + 60, 50, 50);

  fill(0, 0, 0);
  line(houseX + 35, houseY + 60, houseX + 35, houseY + 110);

  fill(0, 0, 0);
  line(houseX + 10, houseY + 85, houseX + 60, houseY + 85);

  fill(0, 0, 0);
  ellipse(houseX + 120, houseY + 110, 15, 15);
}

/**
 * Change the size and location of the ball
 * 
 * @param circleX X location of the ball
 * @param circleY Y location of the ball
 * @param ballSize changes the size of the ball
 */
private void ball(float circleX, float circleY, float ballSize){
  fill(250, 255, 0);
  ellipse(circleX, circleY, ballSize, ballSize);

  fill(255, 0, 150);
  ellipse(circleX, circleY, ballSize, ballSize/2);

  fill(65, 0, 255);
  ellipse(circleX, circleY, ballSize/2, ballSize);

}

/**
 * return a value for the location of a ball drawn in the middle 
 * 
 * @param height height of the canvas
 * @return the middle of the ball
 */
public int middle(int height){
  return height / 2;
  } 
}

