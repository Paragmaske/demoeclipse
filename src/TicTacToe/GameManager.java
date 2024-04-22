package TicTacToe;

import java.util.Scanner;

public class GameManager {
	public static void main(String[] args) {
		playGame();
	}

	private static void playGame() {
		System.out.println("Enter board size and no of Players");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Game g = new Game(a, b);
		g.intialiseGame(g.board);
		sc.nextLine();
		SymbolFactory s = new SymbolFactory();
		for (int i = 0; i < g.players.length; i++) {
			System.out.println("enter player name and symbol");
			String name = sc.nextLine();
			String symbolString = sc.nextLine();

			g.players[i] = new Player(name, s.getSymbol(symbolString));
		}

		int maxChance = g.board.length * g.board[0].length;
		int noOfPlayers = b;
		for (int i = 0; i < maxChance; i++) {
			g.printBoard(g.board);
			int playersChance = i % noOfPlayers;
			System.out.println(g.players[playersChance].name + " please enter row and column");
			int row = sc.nextInt();
			int col = sc.nextInt();
			if (g.board[row][col] != ' ') {
				System.out.println("already occupied" + g.players[playersChance].name + ":)");
				i = i - 1;
				continue;
			}
			g.play(g.players[playersChance], row, col, g.board);

		}
		System.out.println("draw");
	}
}
