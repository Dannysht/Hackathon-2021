package Services;

import Models.Ceiling;
import Models.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
    public FileReader() {
    }

    private static ArrayList<Ceiling> ceilingList = new ArrayList<>();

    public static ArrayList<Ceiling> loadCeiling(String filepath){

        try{
            Scanner dataFile = new Scanner(new File(filepath));

            dataFile.nextLine();

            while (dataFile.hasNext()){
                String [] cL = dataFile.nextLine().split(";"); // cL is the current line in the scanner
                Ceiling ceiling = new Ceiling(cL[0],cL[1],cL[2]);

                ceilingList.add(ceiling);

            }


        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }




        return ceilingList;
    }
}
