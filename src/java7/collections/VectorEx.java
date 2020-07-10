package java7.collections;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		 //start();
		 addPlayer1Objects();
		//usingGenerics();
	}

	private static void start() {
		// LISTS RETAIN INSERTION ORDER
		// LISTS ALLOWS MULTIPLE NULLS
		Vector players = new Vector();
		players.add("Rambo");
		players.add("John");
		players.add(null);
		players.add("John");
		players.add(null);
		System.out.println(players);

	}

	private static void addPlayer1Objects() {
		Vector players = new Vector();
		Player1 player = new Player1();
		player.id = 1;
		player.name = "Bill";
		players.add(player);

		Player1 player1 = new Player1();
		player1.id = 2;
		player1.name = "Gates";
		players.add(player1);

		players.add("Dhoni");
		players.add(2);
		System.out.println(players);
	}

	private static void usingGenerics() {
		Vector<Player1> players = new Vector();
		Player1 player = new Player1();
		player.id = 1;
		player.name = "Bill";
		players.add(player);

		Player1 player1 = new Player1();
		player1.id = 2;
		player1.name = "Gates";
		players.add(player1);

//		players.add("Dhoni");
//		players.add(2);
		System.out.println(players);
	}
}

class Player1 {
	int id;
	String name;

	@Override
	public String toString() {
		return "Player1 [id=" + id + ", name=" + name + "]";
	}

}