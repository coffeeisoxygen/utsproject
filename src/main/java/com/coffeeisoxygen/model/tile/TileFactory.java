package com.coffeeisoxygen.model.tile;

import java.awt.Point;

import com.coffeeisoxygen.model.interfaces.ITileFactory;

public class TileFactory implements ITileFactory {

    // Overloaded method to create a tile with or without a given name
    @Override
    public Tile createTile(TileType type, Point position) {
        return createTile(null, type, position);
    }

    @Override
    public Tile createTile(String name, TileType type, Point position) {
        switch (type) {
            case NORMAL -> {
                return name == null ? new TileNormalPoint(position) : new TileNormalPoint(name, position);
            }
            case FINISH -> {
                return name == null ? new TileFinishPoint(position) : new TileFinishPoint(name, position);
            }
            case START -> {
                return name == null ? new TileStartPoint(position) : new TileStartPoint(name, position);
            }
            case DANGER -> {
                return name == null ? new TileDangerPoint(position) : new TileDangerPoint(name, position);
            }
            case REST -> {
                return name == null ? new TileRestPoint(position) : new TileRestPoint(name, position);
            }
            default -> throw new IllegalArgumentException("Unknown tile type: " + type);
        }
    }
}
