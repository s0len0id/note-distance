package org.strawberrytree.midi.domain;

public class Note {

    private Note prev;
    private Note next;
    private String name;

    protected Note(String name) {
        this.name=name;
    }

    protected void setPrev(Note prev) {
        this.prev = prev;    }

    protected void setNext(Note next) {
        this.next =next;    }

    public Note getPrev() {
        return prev;
    }

    public Note getNext() {
        return next;
    }

}
