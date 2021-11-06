import Models.Room;
import Models.Ceiling;

import java.util.ArrayList;

public class Check {

    private static final double ceilingHeight = 2500;
    private static double livingRoomSize, kitchenSize, bedroomSize, masterBedroomSize, bathroomSize;

    public static ArrayList<String> numOfRooms(int numOfRooms, Room room){

        ArrayList<String> messages=new ArrayList<>();

        if(numOfRooms == 2){
            livingRoomSize = 10000;
            kitchenSize = 6000;
            bathroomSize = 3500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom") || room.getRoomType().equalsIgnoreCase("bedroom")){
                messages.add("This type of room should not be in this type of apartment.");
            }

        }
        else if(numOfRooms == 3){
            livingRoomSize = 10000;
            kitchenSize = 6000;
            masterBedroomSize = 10500;
            bathroomSize = 3500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                messages.add("This type of room should not be in this type of apartment.");
            }


        }
        else if(numOfRooms == 4){
            livingRoomSize = 12000;
            kitchenSize = 6000;
            bedroomSize = 9000;
            masterBedroomSize = 10500;
            bathroomSize = 3500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }
        }
        else if(numOfRooms == 5){
            livingRoomSize = 12000;
            kitchenSize = 6000;
            bedroomSize = 9000;
            masterBedroomSize = 10500;
            bathroomSize = 4500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }
        }
        else if(numOfRooms == 6){
            livingRoomSize = 12000;
            kitchenSize = 6000;
            bedroomSize = 9000;
            masterBedroomSize = 10500;
            bathroomSize = 4500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                }
                messages.add("Room: " + room.getID() + " has size issue.");
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

        }
        else if(numOfRooms == 7 || numOfRooms >= 8){
            livingRoomSize = 16000;
            kitchenSize = 6000;
            bedroomSize = 9000;
            masterBedroomSize = 10500;
            bathroomSize = 6000;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    messages.add("Room: " + room.getID() + " has size issue.");
                }
            }

        }
        else{
            messages.add("Number of rooms out of bounds.");
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
