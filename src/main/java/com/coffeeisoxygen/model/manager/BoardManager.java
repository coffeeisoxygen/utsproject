package com.coffeeisoxygen.model.manager;

import java.awt.Point;

import com.coffeeisoxygen.model.board.Board;
import com.coffeeisoxygen.model.board.BoardBuilder;
import com.coffeeisoxygen.model.interfaces.IBoardBuilder;
import com.coffeeisoxygen.model.interfaces.ITile;
import com.coffeeisoxygen.model.interfaces.ITileFactory;
import com.coffeeisoxygen.model.interfaces.ITilePlacementHelper;
import com.coffeeisoxygen.model.tile.TileFactory;
import com.coffeeisoxygen.model.tile.TilePlacementHelper;

public class BoardManager {
    private Board board;
    private IBoardBuilder boardBuilder;

    public BoardManager() {
        ITileFactory tileFactory = new TileFactory();
        ITilePlacementHelper tilePlacementHelper = new TilePlacementHelper(tileFactory);
        this.boardBuilder = new BoardBuilder(tilePlacementHelper);
    }

    public void createBoard(int width, int height, boolean defaultPlacement) {
        boardBuilder.setWidth(width).setHeight(height);
        if (defaultPlacement) {
            boardBuilder.setDefaultPlacement();
        }
        this.board = boardBuilder.build();
    }

    public void resizeBoard(int width, int height) {
        this.board = boardBuilder.setWidth(width)
                .setHeight(height)
                .setDefaultPlacement()
                .build();
    }

    public void setTile(Point position, ITile tile) {
        board.setTile(position, tile);
    }

    public Board getBoard() {
        return board;
    }
}