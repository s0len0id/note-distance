package org.strawberrytree.midi.domain;

import org.strawberrytree.midi.domain.marker.Interval;
import org.strawberrytree.midi.domain.marker.MidiNote;

import java.util.List;

public class Scale {
    private List notes;

    public Scale(List notes){
        this.notes = notes;
    }

    public MidiNote getMidiNoteAtInterval(Interval interval, Note current ) {

        int midinote;
        for(int step=0 ; step < interval.interval; step++ ) {
            Note next = current.getNext();
        }

        return new MidiNote();
    }
}
