public class Check {

    private final double ceilingHeight = 2500;
    private double livingRoomSize, kitchenSize, bedroomSize, masterBedroomSize, bathroomSize;

    public void numOfRooms(int numOfRooms){

        if(numOfRooms == 2){
            livingRoomSize = 10000;
            kitchenSize = 6000;
            bathroomSize = 3500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom") || room.getRoomType().equaldIgnoreCase("bedroom")){
                System.out.println("This type of room should not be in this type of apartment.");
            }

        }
        else if(numOfRooms == 3){
            livingRoomSize = 10000;
            kitchenSize = 6000;
            masterBedroomSize = 10500;
            bathroomSize = 3500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equaldIgnoreCase("bedroom")){
                System.out.println("This type of room should not be in this type of apartment.");
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
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
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
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }
        }
        else if(numOfRooms == 6){
            livingRoomSize = 12000;
            kitchenSize = 6000;
            bedroomSize = 9000;
            masterBedroomSize = 10500;
            singleRoomSize = 6500;
            bathroomSize = 4500;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

        }
        else if(numOfRooms == 7 || numOfRooms == 8){
            livingRoomSize = 16000;
            kitchenSize = 6000;
            bedroomSize = 9000;
            masterBedroomSize = 10500;
            singleRoomSize = 6500;
            bathroomSize = 6000;

            if(room.getRoomType().equalsIgnoreCase("living room")){
                if(room.getRoomSize() < livingRoomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("kitchen")){
                if(room.getRoomSize() < kitchenSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bedroom")){
                if(room.getRoomSize() < bedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("master bedroom")){
                if(room.getRoomSize() < masterBedroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

            if(room.getRoomType().equalsIgnoreCase("bathroom")){
                if(room.getRoomSize() < bathroomSize){
                    System.out.println(room.getID() + " has size issue.");
                }
                else{
                    System.out.println("All good.");
                }
            }

        }
        else{
            System.out.println("Number of rooms out of bounds.");
        }


    }
}
