package com.codingdojo.ZooKeeperPart2;
import com.codingdojo.ZooKeeperPart1.Mammal;
public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("*flap**flap**flap*");
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("*SCREECH* *AARRGGGHHHHHUGHAH*");
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("*ffsfffsfsfszfzfzffsfsfsfffffzffz*");
	}
}
