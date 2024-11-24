package com.coffeeisoxygen.model.tile;

import java.awt.Point;

import com.coffeeisoxygen.model.playermodel.Player;

public class TileNormalPoint extends Tile {
    private static final String DEFAULT_NAME = "N";

    // constructor with name and position
    public TileNormalPoint(String name, Point position) {
        super(name != null && !name.isEmpty() ? name : DEFAULT_NAME, TileType.NORMAL, position);
    }

    // constructor with position only
    public TileNormalPoint(Point position) {
        super(DEFAULT_NAME, TileType.NORMAL, position);
    }

    @Override
    void action(Player player) {
        // TODO : ComeBack with A Cup of Coffee and then implement this method
    }

}
