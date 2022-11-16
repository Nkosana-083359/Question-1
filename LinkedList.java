/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;


class LinkedListApp {
 
    static class Node {
        int data;
        Node next;
    };
 
    // Function to insert whole linked list in
    static Node insert(int i,Node head1, Node head2)
    {
        // traverse the first linked list
        int count = 1;
        Node curr = head1;
        while (count < i) {
            curr = curr.next;
            count++;
        }
 
        Node temp = curr.next;
   
        curr.next = head2;
 
        while (head2.next != null)
            head2 = head2.next;

        head2.next = temp;
        return head1;
    }
 
    public static void main(String args[])
    {
        /* a: 1,2,3,4,5
           b: 6,7,8,9 */
        Node a = null;
        Node b = null;
        int p = 3;
 
        // first linked list
        a = push(a, 5);
        a = push(a, 4);
        a = push(a, 3);
        a = push(a, 2);
        a = push(a, 1);
 
        // second linked list
        b = push(b, 9);
        b = push(b, 8);
        b = push(b, 7);
        b = push(b, 6);
 
        printList(a);
        System.out.println();
 
        printList(b);
 
        a = insert(p,a, b);
 
        System.out.print("\nResulting linked list\t");
        printList(a);
    }
    
     static void printList(Node head)
    {
        if (head == null)
            return;
 
        System.out.print(head.data + " ");
        printList(head.next);
    }
 
    static Node push(Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }
}
