package com.company.linkedlist;

public class Palindrome {
    public static void main(String[] args){
        Node list1 = NodeUtil.createLinkedList(new int[]{7,1,6,3,3,6,1,7,9});
        Node head = list1;
        Node midNode = findMiddleNode(list1);
        Node newList = reverseMidNode(midNode,head);
        NodeUtil.print(newList);
        boolean flag = true;
        while(midNode.next != null){
            if(head.val != midNode.next.val){
                System.out.println("not a palindrome");
                flag = false;
                break;
            }
            midNode = midNode.next;
            head = head.next;
        }
        if(flag){
            System.out.println("is a palindrome");
        }

    }

    private static Node reverseMidNode(Node midNode, Node head) {
        Node temp = head;
        while(temp != midNode.next){
            temp = temp.next;
        }
        Node prev = null;
        Node next;
        while(temp !=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        midNode.next = prev;
        return head;
    }

    private static Node findMiddleNode(Node list1) {
        Node slow = list1;
        Node fast = list1;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

}
