package com.company.linkedlist;

public class NodeUtil {
     static Node createLinkedList(int[] arr) {
        Node head = null;
        Node temp = null;
        for(int i = 0; i< arr.length; i++){
            Node n = new Node(arr[i]);
            if(head == null){
                head = n;
                temp = head;
            }else{
                head.next = n;
                head = head.next;
            }
        }
        return temp;
    }
     static void print(Node newHeadHashSet) {
        StringBuilder sb = new StringBuilder();
        while (newHeadHashSet !=null){
            sb.append(newHeadHashSet.val).append("->");
            newHeadHashSet = newHeadHashSet.next;
        }
        sb.replace(sb.length()-2,sb.length(),"");
        System.out.println(sb.toString());
    }
}
