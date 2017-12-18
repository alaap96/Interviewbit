/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public static ListNode reverseList2(ListNode a) {
	    if(a.next == null){return a;}
	    else{
	        // reverse all the links  then return the newhead to the wrap function
	        ListNode next = a.next;
	        ListNode newHead = reverseList2(next);
	        next.next = a;
	        return newHead;
	    }
	}
	// Wrap method for the above recursive method
	public static ListNode reverseList(ListNode p){
	    if(p == null || p.next == null){
	        return p;
	    }
	    //Keep track of head and then make head.next null
	    ListNode head = p;
	    ListNode newHead = reverseList2(p);
	    head.next = null;
	    return newHead;
	}
}
