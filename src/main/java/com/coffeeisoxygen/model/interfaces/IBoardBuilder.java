package com.coffeeisoxygen.model.interfaces;

import com.coffeeisoxygen.model.board.Board;

public interface IBoardBuilder {
    IBoardBuilder setWidth(int width);
    IBoardBuilder setHeight(int height);
    IBoardBuilder setDefaultPlacement();
    Board build();
}