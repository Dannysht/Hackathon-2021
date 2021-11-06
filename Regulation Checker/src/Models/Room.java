package Models;

public class Room
{
    private String roomType;
    private double roomArea;
    private int roomId;
    private double ceilingHeight;

    public Room(String roomType, String roomId, String ceilingHeight, String roomArea)
    {
        this.roomType = roomType;
        this.roomId = Integer.parseInt(roomId);
        this.ceilingHeight = Double.parseDouble(ceilingHeight);
        this.roomArea = Integer.parseInt(roomArea);
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

    public String getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomArea=" + roomArea +
                ", roomId=" + roomId +
                ", ceilingHeight=" + ceilingHeight +
                '}';
    }
}
