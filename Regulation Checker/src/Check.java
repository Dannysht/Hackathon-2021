import Models.Room;
import Models.Ceiling;
import Services.FileReader;

import java.util.ArrayList;

public class Check {

    private static final double ceilingHeight = 2500, entranceOrHallway = 1300;
    private static double livingRoomSize, kitchenSize, bedroomSize, masterBedroomSize, bathroomSize;
    private static boolean issueSomewhere = false;

    public static boolean isApartmentSuitable(ArrayList<Room> rooms)
    {
        boolean livingRoom = false, kitchen = false, bathroom = false;
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase("living room")){
                livingRoom = true;
            }
            else if(room.getRoomType().equalsIgnoreCase("kitchen"))
            {
                kitchen = true;
            }
            else if(room.getRoomType().equalsIgnoreCase("bathroom"))
            {
                bathroom = true;
            }
        }
        if(livingRoom == true && kitchen == true && bathroom == true)
        {
            return true;
        }
        return false;
    }

    public static ArrayList<String> numOfRooms(int numOfRooms, Room room, ArrayList<Room> rooms){

        ArrayList<String> messages=new ArrayList<>();
        if(isApartmentSuitable(rooms) == true) {
            if (numOfRooms == 2) {
                livingRoomSize = 10000;
                kitchenSize = 6000;
                bathroomSize = 3500;

                if (room.getRoomType().equalsIgnoreCase("living room")) {
                    if (room.getRoomSize() < livingRoomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("kitchen")) {
                    if (room.getRoomSize() < kitchenSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bathroom")) {
                    if (room.getRoomSize() < bathroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if(room.getRoomType().equalsIgnoreCase("entrance"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if(room.getRoomType().equalsIgnoreCase("hallway"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("master bedroom") || room.getRoomType().equalsIgnoreCase("bedroom")) {
                    issueSomewhere = true;
                    messages.add("This type of room should not be in this type of apartment.");
                }

            } else if (numOfRooms == 3) {
                livingRoomSize = 10000;
                kitchenSize = 6000;
                masterBedroomSize = 10500;
                bathroomSize = 3500;

                if (room.getRoomType().equalsIgnoreCase("living room")) {
                    if (room.getRoomSize() < livingRoomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("kitchen")) {
                    if (room.getRoomSize() < kitchenSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("master bedroom")) {
                    if (room.getRoomSize() < masterBedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bathroom")) {
                    if (room.getRoomSize() < bathroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if(room.getRoomType().equalsIgnoreCase("entrance"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }
                if(room.getRoomType().equalsIgnoreCase("hallway"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bedroom")) {
                    issueSomewhere = true;
                    messages.add("This type of room should not be in this type of apartment.");
                }


            } else if (numOfRooms == 4) {
                livingRoomSize = 12000;
                kitchenSize = 6000;
                bedroomSize = 9000;
                masterBedroomSize = 10500;
                bathroomSize = 3500;

                if (room.getRoomType().equalsIgnoreCase("living room")) {
                    if (room.getRoomSize() < livingRoomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("kitchen")) {
                    if (room.getRoomSize() < kitchenSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bedroom")) {
                    if (room.getRoomSize() < bedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("master bedroom")) {
                    if (room.getRoomSize() < masterBedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }

                }

                if(room.getRoomType().equalsIgnoreCase("entrance"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if(room.getRoomType().equalsIgnoreCase("hallway"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bathroom")) {
                    if (room.getRoomSize() < bathroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }
            } else if (numOfRooms == 5) {
                livingRoomSize = 12000;
                kitchenSize = 6000;
                bedroomSize = 9000;
                masterBedroomSize = 10500;
                bathroomSize = 4500;

                if (room.getRoomType().equalsIgnoreCase("living room")) {
                    if (room.getRoomSize() < livingRoomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("kitchen")) {
                    if (room.getRoomSize() < kitchenSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bedroom")) {
                    if (room.getRoomSize() < bedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("master bedroom")) {
                    if (room.getRoomSize() < masterBedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bathroom")) {
                    if (room.getRoomSize() < bathroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }

                    if(room.getRoomType().equalsIgnoreCase("entrance"))
                    {
                        if(room.getRoomSize() < entranceOrHallway)
                        {
                            issueSomewhere = true;
                            messages.add("Room: " + room.getID() + " has size issue.");
                        }
                    }

                    if(room.getRoomType().equalsIgnoreCase("hallway"))
                    {
                        if(room.getRoomSize() < entranceOrHallway)
                        {
                            issueSomewhere = true;
                            messages.add("Room: " + room.getID() + " has size issue.");
                        }
                    }
                }
            } else if (numOfRooms == 6) {
                livingRoomSize = 12000;
                kitchenSize = 6000;
                bedroomSize = 9000;
                masterBedroomSize = 10500;
                bathroomSize = 4500;

                if (room.getRoomType().equalsIgnoreCase("living room")) {
                    if (room.getRoomSize() < livingRoomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("kitchen")) {
                    if (room.getRoomSize() < kitchenSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bedroom")) {
                    if (room.getRoomSize() < bedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("master bedroom")) {
                    if (room.getRoomSize() < masterBedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bathroom")) {
                    if (room.getRoomSize() < bathroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }

                    if(room.getRoomType().equalsIgnoreCase("entrance"))
                    {
                        if(room.getRoomSize() < entranceOrHallway)
                        {
                            issueSomewhere = true;
                            messages.add("Room: " + room.getID() + " has size issue.");
                        }
                    }

                    if(room.getRoomType().equalsIgnoreCase("hallway"))
                    {
                        if(room.getRoomSize() < entranceOrHallway)
                        {
                            issueSomewhere = true;
                            messages.add("Room: " + room.getID() + " has size issue.");
                        }
                    }
                }

            } else if (numOfRooms >= 7) {
                livingRoomSize = 16000;
                kitchenSize = 6000;
                bedroomSize = 9000;
                masterBedroomSize = 10500;
                bathroomSize = 6000;

                if (room.getRoomType().equalsIgnoreCase("living room")) {
                    if (room.getRoomSize() < livingRoomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("kitchen")) {
                    if (room.getRoomSize() < kitchenSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bedroom")) {
                    if (room.getRoomSize() < bedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("master bedroom")) {
                    if (room.getRoomSize() < masterBedroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if (room.getRoomType().equalsIgnoreCase("bathroom")) {
                    if (room.getRoomSize() < bathroomSize) {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }

                if(room.getRoomType().equalsIgnoreCase("entrance"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }
                if(room.getRoomType().equalsIgnoreCase("hallway"))
                {
                    if(room.getRoomSize() < entranceOrHallway)
                    {
                        issueSomewhere = true ;
                        messages.add("Room: " + room.getID() + " has size issue.");
                    }
                }
            }
            else {
                messages.add("Number of rooms out of bounds.");
            }
        }
        else
        {
            messages.add("You do not meet the requirements for an appartment");
        }
        if (issueSomewhere == false) {
            messages.add("No issues found!");
        }
        return messages;
    }

    public static String checkCeiling(Ceiling ceiling){
        if(ceiling.getHeight() < ceilingHeight){
            return("Ceiling: " + ceiling.getId() + " is too low.");
        }
        return null;
    }
}
