
package Program;
import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UserInterface.printBoard(ChessMatch.getPieces());
    }
}