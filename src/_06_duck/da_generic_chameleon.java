package _06_duck;

import java.awt.Color;
import java.util.Random;

public class da_generic_chameleon {

	public static void main(String[] args) {
		da_generic_chameleon jim = new da_generic_chameleon("Winston");
jim.run();
jim.hide(Color.RED);
	}

	String name;

	da_generic_chameleon(String name) {
		this.name = name;

	}

	int run() {
		 Random alex = new Random();
		 
		
		 int milesran =alex.nextInt(50);  ;
		System.out.println(name + " has run "+ milesran + " miles away because you smell and also corona virus");
		 return milesran;
	}

	Color hide(Color hideColor) {
		Color hiding = Color.RED;
		Random hi = new Random();
		hiding = new Color (hi.nextInt(255), hi.nextInt(255), hi.nextInt(255));
		System.out.println("after you have run to where " + name +" is you have to start looking at" + " blue "+ hiding.getBlue()+ " red "+hiding.getRed() +" colored things");
		return hiding;
	}
}
