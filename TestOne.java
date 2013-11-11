package test;

import java.awt.Color;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**@author Saurabh Rathod*/
public class TestOne 
{
	Finch f = new Finch();
	
	static int a[];
	
	public TestOne()
	{


	while(f.isTapped())
	{
		if(f.isLeftLightSensor(0) && f.isRightLightSensor(0))
		{
			goStraight();
		}
		else
		{
			f.buzz(150, 200);
		}
	}
		
		
		
		
		//f.saySomething("Moving Left");
		
		//goStraight();
		
		//goLeft();
		
		//goStraight();
		
		//goReverse();
		
		
	}

	public void goStraight()
	{
		
		while(f.isObstacle()==true)
		{
			f.stopWheels();
			f.setLED(255, 0, 0);
		}
		while(f.isObstacle()==false)
		{
			f.setLED(0, 0, 255);
			
			f.setWheelVelocities(200, 200, 2000);
			f.stopWheels();
			f.sleep(1000);
		}
		
	}
	
	public void goLeft()
	{
		
		while(f.isObstacle()==true)
		{
			f.stopWheels();
			f.setLED(255, 0, 0);
		}
		while(f.isObstacle()==false)
		{
			f.setLED(0, 0, 255);
			
			f.setWheelVelocities(0, 150, 1500);		//150+ speed makes the wheel float and spin without touching the surface.
			f.stopWheels();
			f.sleep(1000);
		}
	}
	
	public void goRight()
	{
		
		while(f.isObstacle()==true)
		{
			f.stopWheels();
			f.setLED(255, 0, 0);
		}
		while(f.isObstacle()==false)
		{
			f.setLED(0, 0, 255);
			
			f.setWheelVelocities(255, 126, 4000);
			f.stopWheels();

		}
	}
	
	public void goReverse()
	{
		while(f.isObstacle()==true)
		{
			f.stopWheels();
			f.setLED(255, 0, 0);
		}
		while(f.isObstacle()==false)
		{
			f.setLED(0, 0, 255);
			f.setWheelVelocities(-150, -150, 5000);
			f.stopWheels();
			f.sleep(1000);
		}
	}

	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		TestOne t = new TestOne();
	}
}
