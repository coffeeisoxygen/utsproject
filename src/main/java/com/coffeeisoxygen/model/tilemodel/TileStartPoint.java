package com.coffeeisoxygen.model.tilemodel;

import java.awt.Point;

import com.coffeeisoxygen.model.enumerate.TileType;
import com.coffeeisoxygen.model.playermodel.Player;

public class TileStartPoint extends Tile {
    private static final String DEFAULT_NAME = "S";

    // constructor with name and position
    public TileStartPoint(String name, Point position) {
        super(name != null && !name.isEmpty() ? name : DEFAULT_NAME, TileType.START, position);
    }

    // constructor with position only
    public TileStartPoint(Point position) {
        super(DEFAULT_NAME, TileType.START, position);
    }

    @Override
    void action(Player player) {
        // TODO : ComeBack with A Cup of Coffee and then implement this method
    }

}