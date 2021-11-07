package Models;

public class Room
{
    private String roomType;
    private double roomArea;
    private long roomId;

    public Room(String roomType, String roomId, String roomArea)
    {
        this.roomType = roomType;
        this.roomId = Long.parseLong(roomId);
        this.roomArea = Double.parseDouble(roomArea);
    }


    public long getID() {
        return roomId;
    }

    public double getRoomSize() {
        return roomArea;
    }

    public String getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomArea=" + roomArea +
                ", roomId=" + roomId;
    }
}
