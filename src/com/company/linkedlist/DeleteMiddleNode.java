package com.company.linkedlist;

public class DeleteMiddleNode {
    public static void main(String[] args){
        Node head = NodeUtil.createLinkedList(new int[]{3,5,2,5,4,1,1,2,3,8});
        Node newNode = deleteMiddleNode(head);
        NodeUtil.print(newNode);
    }

    private static Node deleteMiddleNode(Node head) {
        if(head == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node start = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        while(head.next != slow){
            head = head.next;
        }
        head.next = head.next.next;
        return start;
    }

}
