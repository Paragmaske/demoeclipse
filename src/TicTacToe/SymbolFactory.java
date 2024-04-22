package TicTacToe;

public class SymbolFactory {

	Symbol getSymbol(String sym) {

		switch (sym) {
		case "*":
			return new StarSymbol();
		case "#":
			return new HashSymbol();
		default:
			return new DefaultSymbol();
		}

	}
}
