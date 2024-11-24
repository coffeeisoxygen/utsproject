package com.coffeeisoxygen.model.tile;

import java.awt.Color;
import java.awt.Point;
import java.util.EnumMap;
import java.util.Map;

import com.coffeeisoxygen.model.interfaces.ITile;
import com.coffeeisoxygen.model.playermodel.Player;

public abstract class Tile implements ITile {

    private String tileName;
    private TileType tileType;
    private Point tilePosition;
    private Color color;

    protected static final Map<TileType, Color> colorMap = new EnumMap<>(TileType.class);
    static {
        colorMap.put(TileType.NORMAL, Color.GRAY);
        colorMap.put(TileType.FINISH, Color.BLUE);
        colorMap.put(TileType.START, Color.GREEN);
        colorMap.put(TileType.DANGER, Color.RED);
        colorMap.put(TileType.REST, Color.YELLOW);
    }

    @Override
    public String getName() {
        return tileName;
    }

    @Override
    public void setName(String tileName) {
        this.tileName = tileName;
    }

    @Override
    public TileType getTileType() {
        return tileType;
    }

    @Override
    public void setTileType(TileType type) {
        this.tileType = type;
    }

    @Override
    public Point getTilePosition() {
        return tilePosition;
    }

    @Override
    public void setTilePosition(Point tilePosition) {
        this.tilePosition = tilePosition;
    }

    @Override
    public Color getColor() {
        return color;
    }

    protected Tile(String tileName, TileType type, Point position, Color color) {
        this.tileName = (tileName != null) ? tileName : "tile";
        this.tileType = (tileType != null) ? tileType : TileType.NORMAL;
        this.tilePosition = position;
        this.color = (color != null) ? color : colorMap.get(type);
    }

    protected Tile(String tileName, TileType type, Point position) {
        this(tileName, type, position, null);
    }

    protected Tile(TileType type, Point position) {
        this(null, type, position, null);
    }

    /**
     * This method defines the action to be performed by the tile.
     * Subclasses should provide the implementation for this method.
     */
    abstract void action(Player player);
}
