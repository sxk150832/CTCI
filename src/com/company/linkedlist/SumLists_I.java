package com.company.linkedlist;

public class SumLists_I {
    public static void main(String [] args){
        Node list1 = NodeUtil.createLinkedList(new int[]{7,1,6,3});
        Node list2 = NodeUtil.createLinkedList(new int[]{4,5,9});
       Node sum = findSum(list1,list2);
       NodeUtil.print(sum);
    }

    private static Node findSum(Node list1, Node list2) {
        int carry = 0;
        int sum = 0;
        Node head = list1;
        Node prev = null;
        while(list1 !=null && list2 !=null){
            sum = list1.val + list2.val + carry;
            list1.val = sum%10;

            carry = sum/10;
            prev = list1;
            list1 = list1.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            sum = list1.val + carry;
            list1.val = sum % 10;
            carry = sum / 10;
            list1 = list1.next;
        }
        if(list2 != null){
            prev.next = list2;
        }

        while(list2 != null){
            sum = list2.val + carry;
            list2.val = sum%10;
            carry = sum/10;
            list2 = list2.next;
        }

        return head;
    }
}
