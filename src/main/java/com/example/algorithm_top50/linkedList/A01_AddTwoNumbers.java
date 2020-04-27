package com.example.algorithm_top50.linkedList;

import java.util.ArrayList;
import java.util.List;

public class A01_AddTwoNumbers {

    public int[] solution(int[] num1, int[] num2) {
        Node node = new Node(num1[0], num2[0]);
        boolean isTen = false;

        if ((num1[0] + num2[0]) == 10) {
            isTen = true;
        }

        List<Integer> list = new ArrayList<>(num1.length);
        list.add(node.sum);

        for (int i = 1; i < num1.length; i++) {
            node.next = new Node(num1[i], num2[i]);

            if (isTen) {
                node.next.plusOne();

                if (node.next.sum == 0) {
                    isTen = true;
                }  else {
                    isTen = false;
                }
            }

            if ((num1[i] + num2[i]) == 10) {
                isTen = true;
            }
            list.add(node.next.sum);
            node = node.next;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private class Node {

        int first;

        int second;

        int sum;

        Node next;

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
            this.sum = (first + second) % 10;
        }

        public void plusOne() {
            sum = (sum + 1) % 10;
        }
    }







    public void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(2);
        ListNode node = solve(l1, l2);
        while(node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode solve(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode p1 =l1, p2 =l2 , p3=newHead;
        int carry =0;

        while(p1 != null|| p2!= null) {
            if(p1 != null) {
                carry+= p1.val;
                p1 =p1.next;
            }
            if(p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry%10);
            p3 =p3.next;
            carry /= 10;
        }
        if(carry==1) p3.next = new ListNode(1);
        return newHead.next;
    }

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
}
