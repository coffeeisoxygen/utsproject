package com.coffeeisoxygen.model.tile;

import java.awt.Point;

import com.coffeeisoxygen.model.board.Board;
import com.coffeeisoxygen.model.interfaces.ITileFactory;
import com.coffeeisoxygen.model.interfaces.ITilePlacementHelper;

public class TilePlacementHelper implements ITilePlacementHelper {
    private ITileFactory tileFactory;

    public TilePlacementHelper(ITileFactory tileFactory) {
        this.tileFactory = tileFactory;
    }

    @Override
    public void placeTile(Board board, TileType tileType, Point position) {
        Tile tile = tileFactory.createTile(tileType, position);
        board.setTile(position, tile);
    }

    @Override
    public void defaultTilePlacement(Board board) {
        // Example default placement logic
        int width = board.getWidth();
        int height = board.getHeight();

        // Place start tile at (0, 0)
        placeTile(board, TileType.START, new Point(0, 0));

        // Place finish tile at (width-1, height-1)
        placeTile(board, TileType.FINISH, new Point(width - 1, height - 1));

        // Place some normal tiles
        for (int x = 1; x < width - 1; x++) {
            for (int y = 1; y < height - 1; y++) {
                placeTile(board, TileType.NORMAL, new Point(x, y));
            }
        }

        // Place some danger tiles
        placeTile(board, TileType.DANGER, new Point(width / 2, height / 2));
    }
}