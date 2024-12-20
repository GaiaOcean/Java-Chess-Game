package Chess;

import BoardGame.Board;

public class ChessMatch {
    private Board board;

    /*sets the board dimension*/
    public ChessMatch(){
        board = new Board(8,8);
    }
    /*Returns the pieces in the board*/
    public ChessPiece[][] getPieces(){
        ChessPiece[][] piecesMat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int i = 0; i < board.getRows();i++){
            for(int j = 0; j < board.getColumns();j++){
                piecesMat[i][j] = (ChessPiece)board.piece(i,j);
            }
        }
        return piecesMat;

    }
}
