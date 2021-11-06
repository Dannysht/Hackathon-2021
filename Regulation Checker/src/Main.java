import Models.Ceiling;
import Services.FileReader;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args) {
        String filepath = "D:\\Main\\Hackathon\\Hackathon-2021\\Regulation Checker\\src\\resources\\Ceiling-Schedule.csv";

        ArrayList<Ceiling> ceilingList = FileReader.loadCeiling(filepath);
        for(Ceiling ceiling : ceilingList){
            Check.checkCeiling(ceiling);
        }
    }
}
