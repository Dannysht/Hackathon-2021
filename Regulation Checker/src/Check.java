public class Check {

    private final double ceilingHeight = 2500;
    private double livingRoomSize, kitchenSize, doubleRoomSize, masterBedroomSize, singleRoomSize, bathroomSize;

    public void numOfRooms(int numOfRooms){

        if(numOfRooms == 2){
            livingRoomSize = 10.00;
            kitchenSize = 6.00;
            bathroomSize = 3.5;
        }
        else if(numOfRooms == 3){
            livingRoomSize = 10.00;
            kitchenSize = 6.00;
            masterBedroomSize = 10.5;
            bathroomSize = 3.5;
        }
        else if(numOfRooms == 4){
            livingRoomSize = 12.0;
            kitchenSize = 6.0;
            doubleRoomSize = 9.0;
            masterBedroomSize = 10.5;
            bathroomSize = 3.5;
        }
        else if(numOfRooms == 5){
            livingRoomSize = 12.0;
            kitchenSize = 6.0;
            doubleRoomSize = 9.0;
            masterBedroomSize = 10.5;
            bathroomSize = 4.5;
        }
        else if(numOfRooms == 6){
            livingRoomSize = 12.0;
            kitchenSize = 6.0;
            doubleRoomSize = 9.0;
            masterBedroomSize = 10.5;
            singleRoomSize = 6.5;
            bathroomSize = 4.5;
        }
        else if(numOfRooms == 7 || numOfRooms == 8){
            livingRoomSize = 16.0;
            kitchenSize = 6.0;
            doubleRoomSize = 9.0;
            masterBedroomSize = 10.5;
            singleRoomSize = 6.5;
            bathroomSize = 6.0;
        }
        else{
            System.out.println("Number of rooms out of bounds.");
        }
    }
}
