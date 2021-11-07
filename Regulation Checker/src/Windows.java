import Models.Ceiling;
import Models.Room;
import Services.FileReader;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;

public class Windows {

    public static void makeFilereadWindow(){
        JLabel label=new JLabel("Enter filepath for ceiling data:");
        JButton ceilingButton=new JButton();
        ceilingButton.setText("Check Ceiling Regulations");
        JTextField textField=new JTextField(20);
        ceilingButton.addActionListener(e -> checkCeilings( textField.getText() ) );

        JLabel roomLabel=new JLabel("Enter filepath for room data:");
        JButton roomButton=new JButton();
        roomButton.setText("Check Room Regulations");
        JTextField roomtextField=new JTextField(20);
        roomButton.addActionListener(e -> checkRooms( roomtextField.getText() ) );


        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(ceilingButton);

        panel.add(roomLabel);
        panel.add(roomtextField);
        panel.add(roomButton);

        JFrame frame=new JFrame("Check Regulations");
        frame.add(panel);
        frame.setSize(700,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void checkCeilings(String filePath){
        ArrayList<Ceiling> ceilingList = FileReader.loadCeiling(filePath);
        ArrayList<String> messageList=new ArrayList<>();
        for(Ceiling ceiling : ceilingList){
            String message = Check.checkCeiling(ceiling);
            if(message!=null) messageList.add(message);
        }
        String messages="";
        for(String message:messageList) messages+=message+"\n";
        makeMessageWindow(messages);
    }

    public static void checkRooms(String filePath){
        ArrayList<Room> roomList = FileReader.loadRooms(filePath);
        ArrayList<String> messageList=new ArrayList<>();
        for(Room room : roomList){
            ArrayList<String>messages = Check.numOfRooms(FileReader.getRoomCounter(),room, roomList);
            if(messages!=null)
            {
                for(String message: messages) {

                        messageList.add(message);
                }
            }
        }
        String messages="";
        for(String message:messageList) messages+=message+"\n";
        makeMessageWindow(messages);
    }

    public static void makeMessageWindow(String messages){
        JPanel middlePanel = new JPanel ();
        middlePanel.setBorder ( new TitledBorder( new EtchedBorder(), "Messages" ) );
        JTextArea display = new JTextArea ( 16, 58 );
        display.setText(messages);
        display.setEditable ( false );
        JScrollPane scroll = new JScrollPane ( display );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

        middlePanel.add ( scroll );

        JFrame frame = new JFrame ();
        frame.add ( middlePanel );
        frame.pack();
        frame.setLocationRelativeTo ( null );
        frame.setVisible ( true );
    }
}
