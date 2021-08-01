package com.startfirst;



import javax.swing.*;
import java.util.ArrayList;

//package com.company;
class Listing extends JFrame{

//    public static void main(String[] args) {
//
//        new Listing();
//    }

    Listing(ArrayList<String> al) {

        final ArrayList<String> wordlist = new ArrayList<String>(al);

        JList<String> displayList = new JList<>(wordlist.toArray(new String[0]));

        JScrollPane scrollPane = new JScrollPane(displayList);
        JFrame frame = new JFrame("TOLL GENERATED ");
        frame.getContentPane().add(scrollPane);
        frame.revalidate();
        frame.repaint();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);
        frame.setVisible(true);
    }


}
