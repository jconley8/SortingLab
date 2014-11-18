/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab1.Song;

/**
 *
 * @author Josh
 */
public class SongByArtist implements Comparator<Song> {

    @Override
    public int compare(Song s1, Song s2) {
        return s1.getArtist().compareTo(s2.getArtist());
    }

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

        Collection<Song> values = songMap.values();
        // Now put in List
        List<Song> songList = new ArrayList<>(values);
        // Notice this version of Collections.sort takes a 2nd paramater --
        // a Comparator that defines the altnerate sort strategy
        Collections.sort(songList, new SongByArtist());
        for (Song s : songList) {
            System.out.println(s);
        }

    }

}
