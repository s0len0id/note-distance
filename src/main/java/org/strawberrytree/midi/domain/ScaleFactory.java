package org.strawberrytree.midi.domain;

import java.util.ArrayList;

public class ScaleFactory {


    // https://github.com/Singond/Music
    // 3	60	61	62	63	64	65	66	67	68	69	70	71
    //    private static ArrayList<Integer> DEFAULT =  new ArrayList<>( Arrays.asList(60,61,62));

    private static ArrayList<Note> defaultNotes = new ArrayList<>();
    static {
        Note note1 = new Note("c");
        Note note2 = new Note("d");
        Note note3 = new Note("e");

        note1.setNext(note2);
        note1.setPrev(note3);

        note2.setNext(note3);
        note2.setPrev(note1);

        note3.setNext(note1);
        note3.setPrev(note2);

        defaultNotes.add(note1);
        defaultNotes.add(note2);
        defaultNotes.add(note3);
    }

    public static Scale getScale() {
        return new Scale(defaultNotes);
    }

}
