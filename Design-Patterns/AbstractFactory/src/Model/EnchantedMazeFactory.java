package Model;

public class EnchantedMazeFactory extends AbstractMazeFactory {

    public EnchantedMazeFactory() {}

    @Override
    public Maze makeMaze() {
        Maze maze = new EnchantedMaze();
        return maze;
    }

    @Override
    public Wall makeWall() {
        Wall wall = new EnchantedWall();
        return wall;
    }

    @Override
    public Room makeRoom() {
        Room room = new EnchantedRoom();
        return room;
    }

    @Override
    public Door makeDoor() {
        Door door = new EnchantedDoor();
        return door;
    }

    @Override
    public MazeGame getmaze() {
        return new MazeGame(new EnchantedMaze(), new EnchantedWall(),
                new EnchantedRoom(), new EnchantedDoor()) {
        };
    }


}
