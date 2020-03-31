package _05_vault;

public class jamesbond {
	public static void main(String[] args) {
		jamesbond jym = new jamesbond();

		jym.findcode(new vault());
	}

	void findcode(vault vault) {

		for (int i = 0; i < 1000; i++) {
			
			if (vault.trycode(i)) {
				System.out.println("Cracked the vault!!!!"+ " The code was "+ i);
				
				return;
			}
		}

	}
}
