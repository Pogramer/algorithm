package com.rhb.link;

public class Node {
    public int o;
    public Node next;
    public Node(int o,Node next){
        this.o = o;
        this.next = next;
    }

    public Node(int o){
        this.o = o;
    }

    @Override
    public String toString() {
        return "Node{" +
                "o=" + o +
                ", next=" + next +
                '}';
    }
}
