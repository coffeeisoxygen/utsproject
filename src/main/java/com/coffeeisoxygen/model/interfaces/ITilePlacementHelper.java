package com.coffeeisoxygen.model.interfaces;

import java.awt.Point;

import com.coffeeisoxygen.model.board.Board;
import com.coffeeisoxygen.model.enumerate.TileType;

public interface ITilePlacementHelper {

    void placeTile(Board board, TileType tileType, Point position);

    void defaultTilePlacement(Board board);

}