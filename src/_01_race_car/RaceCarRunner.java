package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar Scarred_wolf_racing = new RaceCar("Scarred_wolf_racing",5);
		// 2. Print the RaceCar's position in the race
System.out.println("Your Racecar is in "+Scarred_wolf_racing.getPositionInRace()+"th place");
		// 3. Crash the RaceCar
		Scarred_wolf_racing.crash();
		System.out.println("Your Racecar is in "+Scarred_wolf_racing.getPositionInRace()+"th place");
		// 4. If the car is damaged. Bring it in for a pit stop.
		Scarred_wolf_racing.pit();
		// 5. Help the car move into first place.
		for (int i = 7; i > 0; i--) {
			Scarred_wolf_racing.overtake();
		}
		
		
		
	}
}
