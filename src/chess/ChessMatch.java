package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
    }

    // A peça de xadrez herda de peça que está em um tabuleiro. Um tabuleiro (Board) tem linhas e colunas e possui uma
    // matriz de peças com um método para retornar a peça na posição em que se encontra.
    public ChessPiece[][] getPieces(){
         ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
         for (int i = 0; i < board.getRows(); i++){
             for (int j = 0; j < board.getColumns(); j ++){
                 mat[i][j] = (ChessPiece) board.piece(i, j);
             }
         }
         return mat;
    }
}
