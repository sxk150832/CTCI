package com.company.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * remove duplicates from unordered singly linkedlist
 */
public class RemoveDups {

    public static void main(String... args){
        Node head = NodeUtil.createLinkedList(new int[]{3,5,2,5,4,1,1,2});
     //  Node newHeadHashSet = removeDuplicateHashSet(head);
      // print(newHeadHashSet);
       Node newHead = removeDuplicate(head);
       NodeUtil.print(newHead);
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

}




