/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Set;
import java.util.TreeSet;
import lab1.Song;

/**
 *
 * @author Josh
 */
public class Lab4 {
    public static void main(String[] args) {
        Song s1 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s2 = new Song("18 and Life", "Skid Row", "Skid Row", "3:51");
        Song s3 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s4 = new Song("Master of Puppets", "Metallica", "Master of Puppets", "8:36");

        Set<Song> songSet = new TreeSet<Song>();
        
        songSet.add(s1);
        songSet.add(s2);
        songSet.add(s3);
        songSet.add(s4);
        
        for(Song s : songSet) {
            System.out.println(s);
        }
    }
}
