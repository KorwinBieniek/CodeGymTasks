package com.codegym.task.task34.task3410.model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {
    public LevelLoader(Path levels) {
    }

    public GameObjects getLevel(int level) {


        Set<Wall> walls = new HashSet<>();
        Set<Box> boxes = new HashSet<>();
        Set<StorageLocation> storageLocations = new HashSet<>();
        Player player;

        int x = Model.BOARD_CELL_SIZE / 2;
        int y = Model.BOARD_CELL_SIZE / 2;

        walls.add(new Wall(x + 0 * Model.BOARD_CELL_SIZE, y));
        walls.add(new Wall(x + 1 * Model.BOARD_CELL_SIZE, y));
        walls.add(new Wall(x + 2 * Model.BOARD_CELL_SIZE, y));

        boxes.add(new Box(x + 0 * Model.BOARD_CELL_SIZE, y + Model.BOARD_CELL_SIZE));
        storageLocations.add(new StorageLocation(x + 1 * Model.BOARD_CELL_SIZE, y + Model.BOARD_CELL_SIZE));
        player = new Player(x + 2 * Model.BOARD_CELL_SIZE, y + Model.BOARD_CELL_SIZE);

        return new GameObjects(walls, boxes, storageLocations, player);
    }
}
