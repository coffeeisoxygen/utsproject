package com.coffeeisoxygen.model.tile;

import java.awt.Point;

import com.coffeeisoxygen.model.playermodel.Player;

public class TileRestPoint extends Tile {
    private static final String DEFAULT_NAME = "C";

    // constructor with name and position
    public TileRestPoint(String name, Point position) {
        super(name != null && !name.isEmpty() ? name : DEFAULT_NAME, TileType.REST, position);
    }

    // constructor with position only
    public TileRestPoint(Point position) {
        super(DEFAULT_NAME, TileType.REST, position);
    }

    @Override
    void action(Player player) {
        // TODO : ComeBack with A Cup of Coffee and then implement this method
    }

}