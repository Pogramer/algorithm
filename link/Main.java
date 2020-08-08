package com.rhb.link;

public class Main {
    public static void main(String[] args) {
        Node a = new Node(1,new Node(3,new Node(5,new Node(6,new Node(8,new Node(9))))));
        Node a1 = new Node(2,new Node(4,new Node(7,new Node(10,new Node(11,new Node(12))))));
        System.out.println(a);
        Node b;
        Node c;
        boolean e;
//        b = new Solution().removeNthFromEnd(a,2);
//        c = new Solution().reverseNode(a);
//        e = new Solution().hasCycle(a);
        c = new Solution().mergeTwoNode(a,a1);
        System.out.println(c);
    }
}
