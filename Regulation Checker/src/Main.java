import Services.FileReader;

public class Main
{

    public static void main(String[] args) {
        String filepath = "/Users/malthegram/IdeaProjects/Hackathon-2021/Regulation Checker/src/resources/Ceiling-Schedule.csv";

        System.out.println(FileReader.loadCeiling(filepath));

    }
}
