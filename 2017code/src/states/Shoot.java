package states;

import org.usfirst.frc.team3328.robot.subsystems.HotelLobby;
import org.usfirst.frc.team3328.robot.subsystems.Shooter;

public class Shoot implements RobotState{

	Shooter shooter;
	HotelLobby belt;
	
	public Shoot(Shooter sh, HotelLobby lobby){
		shooter = sh;
		belt = lobby;
	}

	@Override
	public void setValue(double value){
		
	}
	
	@Override
	public boolean run() {
		if (!shooter.isEmpty()){
			belt.runBelt();
			shooter.maxSpeed();
			return false;
		}
		shooter.stop();
		return true;
	}
}
