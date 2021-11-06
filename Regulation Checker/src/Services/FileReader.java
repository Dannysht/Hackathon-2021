package Services;

import Models.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
    public FileReader() {
    }

    private static ArrayList<Room> dataList = new ArrayList<>();

    public static ArrayList<Room> loadData(){

        try{
            Scanner dataFile = new Scanner(new File("/Users/malthegram/IdeaProjects/Hackathon-2021/Regulation Checker/src/resources/fakeData.csv"));

            dataFile.nextLine();

            while (dataFile.hasNext()){
                String [] cL = dataFile.nextLine().split(";"); // cL is the current line in the scanner
                Room room = new Room(cL[0],cL[1],cL[2],cL[3]);

                dataList.add(room);

            }


        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }




        return dataList;
    }
}
