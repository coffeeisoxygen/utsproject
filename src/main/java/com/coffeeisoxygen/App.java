package com.coffeeisoxygen;

import java.awt.Point;

import com.coffeeisoxygen.model.board.Board;
import com.coffeeisoxygen.model.manager.BoardManager;
import com.coffeeisoxygen.model.tilemodel.TileNormalPoint;

public class App {
    public static void main(String[] args) {
        // Create the board manager
        BoardManager boardManager = new BoardManager();

        // Create a board with default placement
        boardManager.createBoard(5, 5, true);
        Board board = boardManager.getBoard();

        // Print the board state
        printBoard(board);

        // Set a new tile at a specific position
        boardManager.setTile(new Point(2, 2), new TileNormalPoint("CustomTile", new Point(2, 2)));

        // Print the updated board state
        System.out.println("After setting a custom tile:");
        printBoard(board);
    }

    private static void printBoard(Board board) {
        for (int y = 0; y < board.getHeight(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                if (board.getTile(new Point(x, y)) != null) {
                    System.out.print(board.getTile(new Point(x, y)).getName() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}