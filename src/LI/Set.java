package LI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Set {
	public static void main(String[] args) {
		char[][] inputMatrix = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		isValidSudoku(inputMatrix);
	}

	public static boolean isValidSudoku(char[][] board) {
		Map<Integer, HashSet<Character>> rowMap = new HashMap<>();
		Map<Integer, HashSet<Character>> colMap = new HashMap<>();
		Map<int[], HashSet<Character>> smallIsland = new HashMap<>();
		for (int i = 0; i < board.length; i++) {
			rowMap.put(i, new HashSet<Character>());
			colMap.put(i, new HashSet<Character>());
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '.') {
					continue;
				}

				if ((!rowMap.isEmpty() && !rowMap.get(i).isEmpty() && rowMap.get(i).contains(board[i][j]))
						|| (!colMap.isEmpty() && !colMap.get(i).isEmpty() && colMap.get(i).contains(board[i][j]))
						|| (!smallIsland.isEmpty() && !smallIsland.get(i).isEmpty()
								&& smallIsland.get(i).contains(board[i][j]))) {
					return false;
				}

				rowMap.get(i).add(board[i][j]);
				colMap.get(j).add(board[i][j]);
				if (smallIsland.get(new int[] { i / 3, j / 3 }) == null) {
					HashSet<Character> newhash = new HashSet<Character>();
					newhash.add(board[i][j]);
					smallIsland.put(new int[] { i / 3, j / 3 }, newhash);
				} else {
					HashSet<Character> newhash = smallIsland.get(new int[] { i / 3, j / 3 });
					newhash.add(board[i][j]);
					smallIsland.put(new int[] { i / 3, j / 3 }, newhash);
				}
			}

		}

		return true;
	}

}
