public class GumballMachine implements Coinable, Dispensable {
	int insert;
	
	public GumballMachine() {
		this.insert = 1000;
	}

	
	public void dispense() {
		this.insert--;
		System.out.println("Game Starting!");
		System.out.println("Game Ended!");
		
	}

	
	public void reload(int count) {
		this.insert =+ count;
	}

	public boolean insertCoin() {
		if (this.insert > 0) {
			this.dispense();
			return true;
		}
		
		return false;
	}

}
