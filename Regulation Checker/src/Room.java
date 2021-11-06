public class Room
{
    private RoomType roomType;
    private double roomArea;
    private int roomId;
    private double ceilingHeight;

    public Room(RoomType roomType, int roomId, double ceilingHeight, double roomArea)
    {
        this.roomId = roomId;
        this.ceilingHeight = ceilingHeight;
        this.roomArea = roomArea;
        this.roomType = roomType;
    }

    public int getRoomId() {
        return roomId;
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
