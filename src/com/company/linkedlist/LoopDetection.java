package com.company.linkedlist;

public class LoopDetection {
    public static void main(String args[]){
        Node list1 =createLoopLinkedList(new int[]{3,1,5,9,7,2,1},9);
       Node node = detectLoop(list1);
        System.out.println(node.val);
    }

    private static Node detectLoop(Node list1) {
        Node slow = list1;
        Node fast = list1;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        Node start = list1;
        while(start !=slow){
            start = start.next;
            slow = slow.next;
        }
        return start;
    }

    private static Node createLoopLinkedList(int[] ints, int i) {
        Node head = new Node(ints[0]);
        Node temp = head;
        Node loopNode = null;
        for(int j = 1; j< ints.length;j++){
           head.next = new Node(ints[j]);
            if(ints[j] == i){
                loopNode = head.next;
            }
            head = head.next;
        }
        head.next = loopNode;
        return temp;
    }

}
