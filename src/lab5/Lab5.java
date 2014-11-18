/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lab1.Song;

/**
 *
 * @author Josh
 */
public class Lab5 {

    public static void main(String[] args) {

        Song s1 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s2 = new Song("18 and Life", "Skid Row", "Skid Row", "3:51");
        Song s3 = new Song("No One Like You", "Scorpions", "Blackout", "3:57");
        Song s4 = new Song("Master of Puppets", "Metallica", "Master of Puppets", "8:36");

        List<Song> songList = new ArrayList<>();
        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);
        Collections.sort(songList);
        
        for(Song s : songList) {
            System.out.println(s);
        }
    }
}
