package com.rhb.link;

public class Solution {

    //删除链表的倒数第n个node
    public Node removeNthFromEnd(Node head, int n){
        Node start = new Node(0);
        Node slow = start, fast = start;
        slow.next = head;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    //链表倒置
    public Node reverseNode(Node head){
        Node pre = null;
        Node cur = head;
        Node next = head;
        while (next != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    //链表中环的检测
    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next.next != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }

    //两个有序链表的合并
    public Node mergeTwoNode(Node n1, Node n2){
        if(n1 == null){
            return n2;
        }
        if(n2 == null){
            return n1;
        }

        Node output = null;
        Node cur = null;
        Node temp = null;
        int val;
        while(n1 != null && n2 != null){
            if(n1.o < n2.o){
                val = n1.o;
                n1 = n1.next;
            }else{
                val = n2.o;
                n2 = n2.next;
            }
            temp = new Node(val);
            if(output==null){
                output = temp;
                cur = temp;
            }else {
                cur.next =temp;
                cur = cur.next;
            }
        }
        if(n1 != null){
            cur.next = n1;
        }

        if(n2 != null){
            cur.next = n2;
        }

        return output;

    }

    //链表的中间节点
    public Node middleNode(Node head){
        Node a = head;
        Node b = head;
        while (a !=null && b != null){
            a=a.next.next;
            b= b.next;
        }
        return b;
    }

}
