
public class TestMachine {
     public static void main(String[] args) {
    	 GumballMachine gumballMachine = new GumballMachine();
    	 Person person = new Person (7);
    	 
    	 person.insertCoin(gumballMachine, 2);
    	 person.insertCoin(gumballMachine, 22);
    	 person.insertCoin(gumballMachine, 32);
    	 person.insertCoin(gumballMachine, 42);
    	 person.insertCoin(gumballMachine, 52);
    	 person.insertCoin(gumballMachine, 62);
    	 person.insertCoin(gumballMachine, 72);

     }
}
