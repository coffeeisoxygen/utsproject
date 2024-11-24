package com.coffeeisoxygen.model.interfaces;

import java.awt.Point;

import com.coffeeisoxygen.model.enumerate.TileType;
import com.coffeeisoxygen.model.tilemodel.Tile;

public interface ITileFactory {
    Tile createTile(TileType type, Point position);
    Tile createTile(String name, TileType type, Point position);
}
