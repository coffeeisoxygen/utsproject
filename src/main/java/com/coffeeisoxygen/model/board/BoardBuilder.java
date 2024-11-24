package com.coffeeisoxygen.model.board;

import com.coffeeisoxygen.model.interfaces.IBoardBuilder;
import com.coffeeisoxygen.model.interfaces.ITilePlacementHelper;

public class BoardBuilder implements IBoardBuilder {
    private int width;
    private int height;
    private ITilePlacementHelper tilePlacementHelper;
    private Board board;

    public BoardBuilder(ITilePlacementHelper tilePlacementHelper) {
        this.tilePlacementHelper = tilePlacementHelper;
    }

    @Override
    public IBoardBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public IBoardBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public IBoardBuilder setDefaultPlacement() {
        this.board = new Board(width, height);
        tilePlacementHelper.defaultTilePlacement(board);
        return this;
    }

    @Override
    public Board build() {
        return board;
    }
}