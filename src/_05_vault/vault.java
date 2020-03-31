package _05_vault;

import java.util.Random;

public class vault {
	int secretcode;

	vault() {
		Random ra = new Random();
		secretcode = ra.nextInt(1001);
		System.out.println(secretcode);
	}

	boolean trycode(int code) {
		System.out.println("Trying code" + code);
		if (secretcode == code) {
			return true;
		}

		return false;
	}
}
