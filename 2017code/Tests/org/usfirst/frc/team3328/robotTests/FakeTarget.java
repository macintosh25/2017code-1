package org.usfirst.frc.team3328.robotTests;

import org.usfirst.frc.team3328.robot.networking.Target;

public class FakeTarget implements Target {
	
	double pixel;
	
	@Override
	public double getPixel() {
		// TODO Auto-generated method stub
		return pixel;
	}

	@Override
	public void setPixel(double ang) {
		pixel = ang;

	}

	@Override
	public void setStatus(boolean stat) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTime(long stamp) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printValues() {
		// TODO Auto-generated method stub

	}

}
