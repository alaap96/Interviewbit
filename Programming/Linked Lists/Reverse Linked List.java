/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseList(ListNode a) {
	    // Approch is to maintain 3 pointers and change nodes in place in one shot
	    ListNode prev = null;
	    ListNode current = a;
	    ListNode next = null;
	    while(current != null){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    return prev;
	}
}
