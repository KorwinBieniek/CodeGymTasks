package com.codegym.task.task34.task3410.model;

import com.codegym.task.task34.task3410.controller.EventListener;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Model {
    public static final int BOARD_CELL_SIZE = 20;

    private GameObjects gameObjects;
    private int currentLevel = 1;
    private EventListener eventListener;
    LevelLoader levelLoader;

    public Model() {
        try {
            levelLoader = new LevelLoader(Paths.get(getClass().getResource("../res/levels.txt").toURI()));
        } catch (URISyntaxException e) {
        }
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void move(Direction direction) {
        if (checkWallCollision(gameObjects.getPlayer(), direction)) {
            return;
        }

        if (checkBoxCollisionAndMoveIfAvailable(direction)) {
            return;
        }

        int dx = direction == Direction.LEFT ? -BOARD_CELL_SIZE : (direction == Direction.RIGHT ? BOARD_CELL_SIZE : 0);
        int dy = direction == Direction.UP ? -BOARD_CELL_SIZE : (direction == Direction.DOWN ? BOARD_CELL_SIZE : 0);
        gameObjects.getPlayer().move(dx, dy);

        checkCompletion();
    }

    public void restart() {
        restartLevel(currentLevel);
    }

    public void startNextLevel() {
        currentLevel++;
        restartLevel(currentLevel);
    }

    public boolean checkWallCollision(CollisionObject gameObject, Direction direction) {
        for (Wall wall : gameObjects.getWalls()) {
            if (gameObject.isCollision(wall, direction)) {
                return true;
            }
        }
        return false;
    }


    public boolean checkBoxCollisionAndMoveIfAvailable(Direction direction) {
        for (Box box : gameObjects.getBoxes()) {
            if (gameObjects.getPlayer().isCollision(box, direction)) {
                for (Box item : gameObjects.getBoxes()) {
                    if (!box.equals(item)) {
                        if (box.isCollision(item, direction)) {
                            return true;
                        }
                    }
                    if (checkWallCollision(box, direction)) {
                        return true;
                    }
                }
                int dx = direction == Direction.LEFT ? -BOARD_CELL_SIZE : (direction == Direction.RIGHT ? BOARD_CELL_SIZE : 0);
                int dy = direction == Direction.UP ? -BOARD_CELL_SIZE : (direction == Direction.DOWN ? BOARD_CELL_SIZE : 0);
                box.move(dx, dy);
            }
        }
        return false;
    }

    public void checkCompletion() {
        int numberOfStorageLocations = gameObjects.getStorageLocations().size();
        int numberOfStorageLocationsWithBox = 0;

        for (StorageLocation storageLocation : gameObjects.getStorageLocations()) {
            for (Box box : gameObjects.getBoxes()) {
                if (box.getX() == storageLocation.getX() && box.getY() == storageLocation.getY()) {
                    numberOfStorageLocationsWithBox++;
                }
            }
        }

        if (numberOfStorageLocationsWithBox == numberOfStorageLocations) {
            eventListener.levelCompleted(currentLevel);
        }
    }

    public void restartLevel(int level) {
        gameObjects = levelLoader.getLevel(level);
    }

    public GameObjects getGameObjects() {
        return gameObjects;
    }
}
