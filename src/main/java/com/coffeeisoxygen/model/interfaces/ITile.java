package com.coffeeisoxygen.model.interfaces;

import java.awt.Color;
import java.awt.Point;

import com.coffeeisoxygen.model.enumerate.TileType;

public interface ITile {

    String getName();

    void setName(String tileName);

    TileType getTileType();

    void setTileType(TileType type);

    Point getTilePosition();

    void setTilePosition(Point tilePosition);

    Color getColor();

}