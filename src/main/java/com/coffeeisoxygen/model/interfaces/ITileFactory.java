package com.coffeeisoxygen.model.interfaces;

import java.awt.Point;

import com.coffeeisoxygen.model.tile.Tile;
import com.coffeeisoxygen.model.tile.TileType;

public interface ITileFactory {
    Tile createTile(TileType type, Point position);
    Tile createTile(String name, TileType type, Point position);
}
