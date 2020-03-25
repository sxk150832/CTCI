package com.company.linkedlist;

/**
 * find kth element from last
 * eg k=1 means last element of the linked list
 */
public class KthTolast {
    public static void main(String[] args){
        Node head = NodeUtil.createLinkedList(new int[]{3,5,2,5,4,9,1,2});
       Node ele = findKthTolast(head,8);
       if(ele != null){
           System.out.println(ele.val);
       }
    }

    private static Node findKthTolast(Node head, int i) {
        Node temp = head;
        Node start = head;
        for(int count = 0; count < i ;count++){
           if(temp !=null){
               temp = temp.next;
           }else{
               return null;
           }
        }

        while(temp !=null){
            start = start.next;
            temp = temp.next;
        }
        return start;


    }
}
