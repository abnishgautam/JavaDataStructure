package com.learn.dataStructure.DataStructure.LinkedListDT;

public class LinkedListDT {


    public Node head;

    public void insertFront(int value){
        System.out.println("Inserting at the start" + value);

        // Step 1: Create a new Node
        Node newNode = new Node(value);

        // Step 2: Set next of newNode to the current head
        newNode.next = head;

        // Step 3: Set newNode as the head
        head = newNode;
    }

    public void  insertEnd (int value) {
        System.out.println("Inserting at the start" + value);

        head.next = new Node(value);
    }

    public int getHeadValue() {
        if(head == null){
            return -1;
        } else {
            return head.value;
        }
    }
}
