package com.company.linkedlist;

/**
 * for given value i move all values less than i to left and all values greater than i to the right
 */
public class Partition {
    public static void main(String args[]){
        Node head = NodeUtil.createLinkedList(new int[]{3,5,2,5,1,4,0});
        Node newHead =  makePartition(head,5);
        NodeUtil.print(newHead);
    }

    private static Node makePartition(Node head, int i) {
        Node tempHead = null;
        Node tempTail = null;
        Node middle = null;
        Node tempHeadStart = tempHead;
        Node tempTailStart = tempHead;
        Node middleStart = tempHead;
        while(head !=null){
            if(head.val < i){
                if(tempHead == null){
                    tempHead = head;
                    tempHeadStart = tempHead;
                }else {
                    tempHead.next = head;
                    tempHead = tempHead.next;
                }
            }else if(head.val > i){
                if(tempTail == null){
                    tempTail = head;
                    tempTailStart = tempTail;
                }else {
                    tempTail.next = head;
                    tempTail = tempTail.next;
                }
            }else{
                if(middle == null){
                    middle = head;
                    middleStart = middle;
                }else {
                    middle.next = head;
                    middle = middle.next;
                }
            }
            head = head.next;
        }
       if(tempHead !=null){
           tempHead.next = middleStart;
           middle.next = tempTailStart;
           if(tempTailStart !=null) {
               tempTail.next = null;
           }
           return tempHeadStart;
       }
       middle.next = tempTailStart;
       if(tempTailStart !=null) {
           tempTail.next = null;
       }
       return middleStart;

    }
}
