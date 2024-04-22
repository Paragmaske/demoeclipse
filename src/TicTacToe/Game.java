package TicTacToe;

import java.util.List;
import java.util.Random;

public class Game {
	char[][] board;
	Player[] players;

	Game(int sizeOfBoard, int noOfPlayers) {
		this.board = new char[sizeOfBoard][sizeOfBoard];
		this.players = new Player[noOfPlayers];
	}

	void intialiseGame(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ' ';
			}
		}

	}

	private static boolean checkWinner(Player p, char[][] board) {
		for (int i = 0; i < board.length; i++) {
			int count = 0;
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == p.s.getSymbol()) {
					count++;
				}

			}
			if (count == 3)
				return true;
		}

		for (int i = 0; i < board.length; i++) {
			int count = 0;
			for (int j = 0; j < board[0].length; j++) {
				if (board[j][i] == p.s.getSymbol()) {
					count++;
				}

			}
			if (count == 3)
				return true;
		}
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] == p.s.getSymbol()) {
				count++;
			}
			if (count == 3)
				return true;
		}
		int rowCount = 0;
		int colCount = 2;
		int count1 = 0;
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {
				if (i == rowCount && j == colCount && board[i][j] == p.s.getSymbol()) {
					count1++;
				}
			}
			rowCount++;
			colCount--;
			if (count1 == 3)
				return true;
		}
		return false;

	}

	static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("------------------------");
	}

	void play(Player p, int row, int column, char[][] board) {
		Character currPlayerSymbol = p.s.getSymbol();

		board[row][column] = currPlayerSymbol;
		boolean checkWinner = checkWinner(p, board);
		if (checkWinner) {
			System.out.println("you won " + p.name);
			System.exit(0);
		}
	}

	Player chooseFirst(Player[] players) {
		int maxRange = players.length;
		Random r = new Random();
		int nextInt = r.nextInt(maxRange);
		return players[nextInt];

	}

}
