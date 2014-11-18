/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lab1.Song;

/**
 *
 * @author Josh
 */
public class Lab3 {

    public static void main(String[] args) {
        Song s1 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s2 = new Song("18 and Life", "Skid Row", "Skid Row", "3:51");
        Song s3 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s4 = new Song("Master of Puppets", "Metallica", "Master of Puppets", "8:36");

        Map<String, Song> songMap2 = new TreeMap<>();
        songMap2.put("No One Like You", s1);
        songMap2.put("18 and Life", s2);
        songMap2.put("No One Like You", s3);
        songMap2.put("Master of Puppets", s4);

        System.out.println("Sorted Keys:");
        for (String s : songMap2.keySet()) {
            System.out.println(s);
        }

        Collection<Song> values = songMap2.values();
        List<Song> sortedList = new ArrayList<Song>(values);
        Collections.sort(sortedList);
        
        System.out.println("Sorted Values:");
        for (Song s : sortedList) {
            System.out.println(s);
        }
    }
}
