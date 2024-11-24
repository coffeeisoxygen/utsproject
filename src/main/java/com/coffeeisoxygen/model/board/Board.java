package com.coffeeisoxygen.model.board;

import java.awt.Point;
import com.coffeeisoxygen.model.interfaces.ITile;

public class Board {
    private ITile[][] tiles;
    private int width;
    private int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new ITile[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setTile(Point position, ITile tile) {
        if (position.x >= 0 && position.x < width && position.y >= 0 && position.y < height) {
            tiles[position.x][position.y] = tile;
            tile.setTilePosition(position); // Forwarding the position to the tile
        } else {
            throw new IllegalArgumentException("Position out of bounds");
        }
    }

    public ITile getTile(Point position) {
        if (position.x >= 0 && position.x < width && position.y >= 0 && position.y < height) {
            return tiles[position.x][position.y];
        } else {
            throw new IllegalArgumentException("Position out of bounds");
        }
    }
}