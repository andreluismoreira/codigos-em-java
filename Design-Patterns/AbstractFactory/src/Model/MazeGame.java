package Model;

public class MazeGame {

    private Maze maze;
    private Wall wall;
    private Room room;
    private Door door;

    public MazeGame () {};
    public MazeGame(Maze maze, Wall wall, Room room, Door door) {
        this.maze = maze;
        this.wall = wall;
        this.room = room;
        this.door = door;
    }

    public Maze getMaze() {
        return maze;
    }

    public Wall getWall() {
        return wall;
    }

    public Room getRoom() {
        return room;
    }

    public Door getDoor() {
        return door;
    }

    public void setMaze (Maze maze) {
        this.maze = maze;
    }

    public void setWall (Wall wall) {
        this.wall = wall;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setDoor(Door door){
        this.door = door;
    }

    public String toString() {
        return "MazeGame [ maze=" + maze + ", wall=" + wall + ", room" +
                room + ", door=" + door + " ]";
    }
}
