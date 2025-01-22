package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.forward(300);//Create Stem 
		
		robot.turnLeft(180);//Go back Down Stem 
		robot.forward(20);//Back down Stem 20 Units
		
		robot.turnLeft(90);//Move to position of Right Branch
		robot.forward(40);// Move 40 units to create 40 unit right Branch
		
		robot.turnRight(180);//Turn back to the direction for Left Branch
		robot.forward(80);// Cover twice the distance to create Left Branch
		
		robot.turnLeft(180);//Go back to the right to reach stem
		robot.forward(40);// Move 40 units back in right direction to reach stem
		
		robot.turnRight(90);//Turn to position back down the Branch
		robot.forward(80);//Move 80 Units down 
		
		robot.turnRight(90);//Position to make 2nd left Branch
		robot.forward(80);//Move left 80 units to make left branch
		
		robot.turnLeft(180);//Move back to the right position 
		robot.forward(160);//Go down twice the length to create right Branch
		
		robot.turnRight(180);//Move back to the left direction 
		robot.forward(80);//move 80 units back to the center of stem
		
		robot.turnLeft(90);//Turn to go back to position Stem
		robot.forward(160);//Move down 160 units 
		
		robot.turnRight(90);//Position to make Left Branch
		robot.forward(160);//Move 160 units to the left 
		
		robot.turnLeft(180);//Turn around to reach Right Direction for Right Branch
		robot.forward(360);//Move 360 units to the right to make the right Branch 
	}

}
