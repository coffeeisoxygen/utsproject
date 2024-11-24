package com.coffeeisoxygen.model.tilemodel;

import java.awt.Point;

import com.coffeeisoxygen.model.enumerate.TileType;
import com.coffeeisoxygen.model.playermodel.Player;

public class TileFinishPoint extends Tile {
    private static final String DEFAULT_NAME = "F";

    // constructor with name and position
    public TileFinishPoint(String name, Point position) {
        super(name != null && !name.isEmpty() ? name : DEFAULT_NAME, TileType.FINISH, position);
    }

    // constructor with position only
    public TileFinishPoint(Point position) {
        super(DEFAULT_NAME, TileType.FINISH, position);
    }

    @Override
    void action(Player player) {
        // TODO : ComeBack with A Cup of Coffee and then implement this method
    }

}