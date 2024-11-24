package com.coffeeisoxygen.model.tilemodel;

import java.awt.Point;

import com.coffeeisoxygen.model.enumerate.TileType;
import com.coffeeisoxygen.model.playermodel.Player;

public class TileDangerPoint extends Tile {
    private static final String DEFAULT_NAME = "X";

    // constructor with name and position
    public TileDangerPoint(String name, Point position) {
        super(name != null && !name.isEmpty() ? name : DEFAULT_NAME, TileType.DANGER, position);
    }

    // constructor with position only
    public TileDangerPoint(Point position) {
        super(DEFAULT_NAME, TileType.DANGER, position);
    }

    @Override
    void action(Player player) {
        // TODO : ComeBack with A Cup of Coffee and then implement this method
    }

}