package com.company.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * remove duplicates from unordered singly linkedlist
 */
public class RemoveDups {

    public static void main(String... args){
        Node head = createLinkedList();
     //  Node newHeadHashSet = removeDuplicateHashSet(head);
      // print(newHeadHashSet);
       Node newHead = removeDuplicate(head);
        print(newHead);
    }

    private static void print(Node newHeadHashSet) {
        StringBuilder sb = new StringBuilder();
        while (newHeadHashSet !=null){
            sb.append(newHeadHashSet.val).append("->");
            newHeadHashSet = newHeadHashSet.next;
        }
        sb.replace(sb.length()-2,sb.length(),"");
        System.out.println(sb.toString());
    }

    private static Node removeDuplicateHashSet(Node head) {
        if(head == null){
            return head;
        }
        Set set = new HashSet<>();
        Node prev = null;
        Node temp = head;
        while(head !=null ) {
            if (set.contains(head.val)) {
                prev.next = head.next;
                head = prev;
            } else {
                set.add(head.val);
            }
            prev = head;
            head = head.next;
        }
        return temp;
    }

    private static Node removeDuplicate(Node head) {
        Node current = head;
        while(current !=null){
            Node runner = current;
            while(runner.next !=null){
                if(current.val == runner.next.val){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    private static Node createLinkedList() {
        Node n = new Node(3);
        n.next = new Node(5);
        n.next.next = new Node(2);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(4);
        n.next.next.next.next.next = new Node(1);
        n.next.next.next.next.next.next = new Node(1);
        n.next.next.next.next.next.next.next = new Node(2);

        return n;
    }

}

class Node {
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }

}



