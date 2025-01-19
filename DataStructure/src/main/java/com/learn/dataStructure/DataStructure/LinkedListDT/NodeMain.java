package com.learn.dataStructure.DataStructure.LinkedListDT;

public class NodeMain {

    public static void main(String[] args) {
        /*// Creating head of the Linked list
        Node head = new Node(1);
        System.out.println("The value at head is " + head.value);*/


        LinkedListDT list = new LinkedListDT();
        list.insertFront(3);
        System.out.println("The value at the head is: " + list.getHeadValue());

        list.insertFront(2);
        System.out.println("The value at the head is: " + list.getHeadValue());
    }
}
