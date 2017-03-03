package org.usfirst.frc.team3328.robot.subsystems;

public interface Shooter {
	
	HotelLobby getBelt();
	
	boolean isEmpty();
	
	boolean isMax();
	
	boolean isShooting();
	
	void startShoot();
	
	void stopShoot();
	
	void startLoad();
	
	void stopLoad();
	
	boolean isLoading();

}