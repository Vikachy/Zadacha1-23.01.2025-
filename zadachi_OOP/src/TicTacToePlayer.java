public class TicTacToePlayer {
    private String name;
    private char symbol;

    public TicTacToePlayer(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

}