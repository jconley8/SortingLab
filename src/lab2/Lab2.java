/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;
import lab1.Song;

/**
 *
 * @author Josh
 */
public class Lab2 {

    public static void main(String[] args) {
        Song s1 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s2 = new Song("18 and Life", "Skid Row", "Skid Row", "3:51");
        Song s3 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s4 = new Song("Master of Puppets", "Metallica", "Master of Puppets", "8:36");

        Map<String, Song> songMap = new HashMap<>();
        songMap.put("No One Like You", s1);
        songMap.put("18 and Life", s2);
        songMap.put("No One Like You", s3);
        songMap.put("Master of Puppets", s4);
      
        System.out.println("HashMap:");
        for (Song s : songMap.values()) {
            System.out.println(s);
        }

        Map<String, Song> songMap2 = new TreeMap<>();
        songMap2.put("No One Like You", s1);
        songMap2.put("18 and Life", s2);
        songMap2.put("No One Like You", s3);
        songMap2.put("Master of Puppets", s4);
        
        System.out.println("TreeMap:");
        for (Song s : songMap2.values()) {
            System.out.println(s);
        }
    }
}
