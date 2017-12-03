/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode a, int b) {
	    if(a == null)return a;
	    if(a.next == null)return a;
	    //find length of the list
	    int length = 0;
	    ListNode head = a;
	    while(head.next != null){
	        head=head.next;
	        length++;
	    }
	    // Then make head a circular linked list 
	    head.next = a;
	    head = head.next;
	    length++;
	   //find element that needs to be set as first element
	    b = b % length;
	    b = length - b;
	    // go to the before element 
	        while(b > 1){
	            head = head.next;
	            b--;
	        }
	        // make the next element as head
	        // then cut the link of circular linked list
            a = head.next;
            head.next = null;
	    return a;
	}
}
