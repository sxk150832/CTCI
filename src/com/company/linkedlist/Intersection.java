package com.company.linkedlist;

public class Intersection {
    public static void main(String[] args){
        Node list1 = NodeUtil.createLinkedList(new int[]{3,1,5,9,7,2,1});
        Node list2 = NodeUtil.createLinkedList(new int[]{4,6,7,2,1});
        Node newHead1 = reverseList(list1);
        Node newHead2 = reverseList(list2);
        Node node = findIntersection(newHead1,newHead2);
        NodeUtil.print(node);
    }

    private static Node reverseList(Node list2) {
        Node prev = null;
        Node next = null;
        while(list2  != null){
            next = list2.next;
            list2.next = prev;
            prev = list2;
            list2 = next;
        }
        return prev;
    }

    private static Node findIntersection(Node list1, Node list2) {
        Node prev = null;
        while(list1 !=null && list2 !=null){
            if(list1.val == list2.val){
                prev = list1;
                list1 = list1.next;
                list2 = list2.next;
            }else {
                return prev;
            }
        }
        return null;
    }
}
