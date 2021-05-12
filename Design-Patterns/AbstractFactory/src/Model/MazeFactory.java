package Model;

public class MazeFactory extends AbstractMazeFactory {

    public MazeFactory() {}

    @Override
    public Maze makeMaze() {
        Maze maze = new CommonMaze();
        return maze;
    }

    @Override
    public Wall makeWall() {
        Wall wall = new CommonWall();
        return wall;
    }

    @Override
    public Room makeRoom() {
        Room room = new CommonRoom();
        return room;
    }

    @Override
    public Door makeDoor() {
        Door door = new CommonDoor();
        return door;
    }

    @Override
    public MazeGame getmaze() {
        return new MazeGame(new CommonMaze(), new CommonWall(),
                new CommonRoom(), new CommonDoor());
    }


}
